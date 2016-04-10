package eu.execom.workshopdemo.repository;

import java.util.ArrayList;
import java.util.List;

import eu.execom.workshopdemo.R;
import eu.execom.workshopdemo.models.Student;

/**
 * Created by Alex on 4/10/16.
 */
public class StudentRepository {

    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Marko Begović", "FTN", R.drawable.marko_begovic));
        students.add(new Student("Novica Šarenac", "FTN", R.drawable.novica_sarenac));
        students.add(new Student("Ilija Simić", "FTN", R.drawable.ilija_simic));
        students.add(new Student("Mil\u00E8na Počuča", "FTN", R.drawable.milena_pocuca));
        students.add(new Student("Mario Perić", "PMF", R.drawable.mario_peric));
        students.add(new Student("Filip Moldvai Begović", "PMF", R.drawable.filip_moldvai));
        students.add(new Student("Luka Maletin", "FTN", R.drawable.luka_maletin));
        students.add(new Student("Mihajlo Račić", "FTN", R.drawable.mihajlo_racic));
        students.add(new Student("Milan Sekulić", "PMF", R.drawable.milan_sekulic));
        students.add(new Student("Ljubiša Moćić", "PMF", R.drawable.ljubisa_mocic));
        students.add(new Student("Jasna Stanković", "FTN", R.drawable.jasna_stankovic));
        students.add(new Student("Goran Todorović", "PMF", R.drawable.goran_todorovic));
        students.add(new Student("Helena Zečević", "FTN", R.drawable.helena_zecevic));
        students.add(new Student("Mario Vuković", "PMF", R.drawable.mario_vukovic));
        return students;
    }
}
