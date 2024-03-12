import java.util.Iterator;

public interface Iterable<S> {
    Iterator<StudyGroup> iterator();

    void Stream(Integer numberinStream, String nameofStream);

    void main();

    void getNumberinStream();

    void setNumberinStream();

    void getNameofStream();

    void setNameofStream();

}
