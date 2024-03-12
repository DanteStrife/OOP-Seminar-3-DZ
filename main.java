import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student("Ярослав", 25, "Тестировщик");
        Student student2 = new Student("Павел", 20, "Программист");
        Student student3 = new Student("Петр", 20, "Программист");
        Student student4 = new Student("Мирослава", 23, "Программист");
        Student student5 = new Student("Владимир", 25, "Аналитик");
        Student student6 = new Student("Сергей", 23, "Аналитик");
        ArrayList<Student> ListPerson = new ArrayList<>(List.of(student1, student2, student3, student4, student5, student6));
        System.out.println(student1.compareTo(student6));
        StudyGroup students1 = new StudyGroup(List.of(student1, student2));
        StudyGroup students2 = new StudyGroup(List.of(student3, student4));
        StudyGroup students3 = new StudyGroup(List.of(student5, student6));
        Iterator<Student> iterator = students1.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.getFirstName() + ": " + student.getAge());
        }
        ListPerson.sort(new StudentComporator());
        System.out.println(ListPerson.toString().substring(1, ListPerson.toString().length()-1));
        Stream stream1 = new Stream(List.of(students1, students3));
        Stream stream2 = new Stream(List.of(students2));


        StreamComparator comparator = new StreamComparator();
        int result = comparator.compare(stream1, stream2);
        if (result > 0) {
            System.out.println("В Stream 1 больше групп");
        } else if (result < 0) {
            System.out.println("В Stream 2 больше групп");
        } else {
            System.out.println("Stream 1 = Steam с одинаковым количеством групп");
        }

    }
}
