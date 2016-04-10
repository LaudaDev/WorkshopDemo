package eu.execom.workshopdemo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import eu.execom.workshopdemo.R;
import eu.execom.workshopdemo.models.Student;

/**
 * {@link StudentsAdapter Adapter} responsible for providing a {@link android.widget.AbsListView
 * ListView/GridView} with children.
 * Created by Alex on 4/10/16.
 */
public class StudentsAdapter extends BaseAdapter {

    private LayoutInflater layoutInflater;

    private List<Student> students;

    public StudentsAdapter(Context context, List<Student> students) {
        layoutInflater = LayoutInflater.from(context);
        this.students = students;
    }

    /**
     * @return number of students available.
     */
    @Override
    public int getCount() {
        return students.size();
    }

    /**
     * @return {@link Student student} for a given position.
     */
    @Override
    public Object getItem(int position) {
        return students.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    /**
     * Constructs a {@link View view} based on a given position.
     * @param position position for which a {@link View view} needs to be provided for.
     * @param convertView {@link View view} that may be null or a existing {@link View view}.
     * @param parent container.
     * @return populated {@link View view} based on the given position.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // ViewHolder is used for storing references on views in a specific convertView.
        ViewHolder viewHolder;
        // If convertView is null, it needs to be made, else we take the references for its view
        // out of it as a tag. This is the recycling mechanism we talked about in the workshop.
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.item_student, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            viewHolder.faculty = (TextView) convertView.findViewById(R.id.faculty);
            viewHolder.thumbnail = (ImageView) convertView.findViewById(R.id.thumbnail);
            // Saving references to views for this convertView as a tag.
            convertView.setTag(viewHolder);
        } else {
            // Retrieving references for views in this convertView.
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final Student student = students.get(position);
        viewHolder.name.setText(student.getName());
        viewHolder.faculty.setText(student.getFaculty());
        viewHolder.thumbnail.setImageResource(student.getImageAddress());
        return convertView;
    }

    /**
     * Class used for storing references to views within a specific view.
     */
    static class ViewHolder {
        TextView name;
        TextView faculty;
        ImageView thumbnail;
    }
}
