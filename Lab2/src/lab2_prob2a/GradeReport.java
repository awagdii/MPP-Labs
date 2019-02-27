package lab2_prob2a;

import java.util.HashMap;
import java.util.Map;

public class GradeReport {
    private Student student;
    private Map<String,String>  grades= new HashMap<>();

    public GradeReport(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void addCourseGrade(String courseName , String grade){
        grades.put(courseName,grade);
    }

    @Override
    public String toString() {
        return "GradeReport{" +
                "student=" + student +
                ", grades=" + grades +
                '}';
    }
}
