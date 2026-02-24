package capstone;
import java.util.List;
import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String title;
    private int credits;
    private List<Student> roster = new ArrayList<>();

    public Course(String courseCode, String title, int credits) {
        this.courseCode = courseCode;
        this.title = title;
        this.credits = credits;
    }

    // Getters & Setters
    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }

    public List<Student> getRoster() { return roster; }

    public void addStudent(Student student) {
        roster.add(student);
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + title + " (" + courseCode + ") - " + credits + " credits");
        System.out.println("Enrolled Students: " + roster.size());
    }
}
