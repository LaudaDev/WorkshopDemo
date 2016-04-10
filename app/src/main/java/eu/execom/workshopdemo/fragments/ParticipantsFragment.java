package eu.execom.workshopdemo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import eu.execom.workshopdemo.R;
import eu.execom.workshopdemo.adapters.StudentsAdapter;
import eu.execom.workshopdemo.models.Student;
import eu.execom.workshopdemo.repository.StudentRepository;

/**
 * {@link ParticipantsFragment Fragment} responsible for handling participant display and actions logic.
 */
public class ParticipantsFragment extends Fragment {


    public ParticipantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflating view
        final View view = inflater.inflate(R.layout.fragment_participants, container, false);

        // Note, when trying to get references from layouts that are not directly activity's content
        // its required to search for them within a ViewGroup, the view we inflated above in this case.
        final ListView listView = (ListView) view.findViewById(R.id.list_view);
        // Creating a instance of StudentsAdapter. Note here that we are getting a List<Student> from
        // a static method of the StudentRepository class. This is a good decoupling example. Also,
        // it is likely that that list would be needed elsewhere if this weren't just a demo app,
        // so its a good example of the DRY principle also (Do not Repeat Yourself).
        final StudentsAdapter adapter = new StudentsAdapter(getContext(), StudentRepository.getAllStudents());
        listView.setAdapter(adapter);

        // Here we are setting a listener on the listView. The onItemClick method will be invoked every
        // time a item is selected.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ParticipantsFragment.this.getContext(), ((Student) parent.getItemAtPosition(position)).getName(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
