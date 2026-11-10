
import java.io.*;

// Student class
class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Course class
class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    private String courseCode;
    private String courseName;
    private String instructor;

    public Course(String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}

// Enrollment class
class Enrollment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        Student student = new Student(1, "Khalid", 24);

        Course course = new Course(
                "ICT101",
                "Java Programming",
                "Teacher"
        );

        Enrollment enrollment = new Enrollment(
                student,
                course,
                "10.11.2026"
        );

        // Serialization
        try (ObjectOutputStream output =
                     new ObjectOutputStream(
                             new FileOutputStream("enrollments.ser"))) {

            output.writeObject(enrollment);

            System.out.println("Enrollment saved successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream input =
                     new ObjectInputStream(
                             new FileInputStream("enrollments.ser"))) {

            Enrollment savedEnrollment =
                    (Enrollment) input.readObject();

            System.out.println("\nEnrollment information:");

            System.out.println("Student ID: "
                    + savedEnrollment.getStudent().getId());

            System.out.println("Student Name: "
                    + savedEnrollment.getStudent().getName());

            System.out.println("Student Age: "
                    + savedEnrollment.getStudent().getAge());

            System.out.println("Course Code: "
                    + savedEnrollment.getCourse().getCourseCode());

            System.out.println("Course Name: "
                    + savedEnrollment.getCourse().getCourseName());

            System.out.println("Instructor: "
                    + savedEnrollment.getCourse().getInstructor());

            System.out.println("Enrollment Date: "
                    + savedEnrollment.getEnrollmentDate());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
