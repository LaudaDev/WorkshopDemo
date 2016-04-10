package eu.execom.workshopdemo.models;

/**
 * Model of a student.
 * Created by Alex on 4/10/16.
 */
public class Student {

    private String name;

    private String faculty;

    private int imageAddress;

    public Student(String name, String faculty, int imageAddress) {
        this.name = name;
        this.faculty = faculty;
        this.imageAddress = imageAddress;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getImageAddress() {
        return imageAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", imageAddress=" + imageAddress +
                '}';
    }
}
