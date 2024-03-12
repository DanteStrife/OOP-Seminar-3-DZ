import java.util.Comparator;

public class StudentComporator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        String o1full = o1.getFirstName() + o1.getAge();
        String o2full = o2.getFirstName() + o2.getAge();

        return o1full.compareTo(o2full);

    }
}
