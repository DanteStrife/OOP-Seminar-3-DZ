import java.util.Iterator;

public class Student implements Comparable<Student> {
    private String FirstName;
    private Integer Age;
    private String Stream;
    private Iterator<Student> Student;
    public String getFirstName() {
        return FirstName;
    }
    public Integer getAge() {
        return Age;
    }
    public String getStream(){
        return Stream;
    }

    @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + FirstName + '\'' +
                ", Age=" + Age +
                ", Stream='" + Stream + '\'' +
                '}' + "\n";
    }

    public Student(String firstName, Integer age, String stream) {
        this.FirstName = firstName;
        this.Age = age;
        this.Stream = stream;
    }

    @Override
    public int compareTo(Student o) {
        int nameComparison = FirstName.compareTo(o.getFirstName());
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Age.compareTo(o.getAge());
    }
}


