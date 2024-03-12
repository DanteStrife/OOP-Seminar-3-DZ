import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {
    private final List<Student> students;

    public StudyGroup(List<Student> students) {

        this.students = students;
    }


    @Override
    public Iterator<Student> iterator() {

        return new StudyGroupIterator(students);
    }

    @Override
    public void Stream(Integer numberinStream, String nameofStream) {
            }

    @Override
    public void main() {

    }

    @Override
    public void getNumberinStream() {

    }

    @Override
    public void setNumberinStream() {

    }

    @Override
    public void getNameofStream() {

    }

    @Override
    public void setNameofStream() {

    }
}
