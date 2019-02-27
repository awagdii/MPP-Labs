package lab2_prob2a;

public class Main {

    public static void main(String args[]) {
        Student student = new Student("John");
        student.getReport().addCourseGrade("MPP", "A");
        student.getReport().addCourseGrade("MWA", "B+");
        GradeReport johnGradeReport = student.getReport();
        System.out.println(student);
        System.out.println(johnGradeReport);
    }
}
