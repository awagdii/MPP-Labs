package lab2_prob4;

import java.util.*;

/**
 * Shows how the design in this package of classes
 * allows you to navigate in the way that the class
 * diagram suggests
 */
public class Main {

    static Student bob = StudentSectionFactory.createStudent("1", "Bob");
    static Student tim = StudentSectionFactory.createStudent("2", "Tim");
    static Student allen = StudentSectionFactory.createStudent("3", "Allen");
    static Section bio1 = StudentSectionFactory.createSection(1, "Biology");
    static Section bio2 = StudentSectionFactory.createSection(2, "Biology");
    static Section math = StudentSectionFactory.createSection(3, "Mathematics");

    public static void main(String[] args) {
        StudentSectionFactory.newTranscriptEntry(bob, bio1, "A");
        StudentSectionFactory.newTranscriptEntry(bob, math, "B+");
        StudentSectionFactory.newTranscriptEntry(tim, bio1, "C");
        StudentSectionFactory.newTranscriptEntry(tim, math, "B");
        StudentSectionFactory.newTranscriptEntry(allen, math, "C+");
        StudentSectionFactory.newTranscriptEntry(allen, bio2, "B+");

        //Get Student's Transcript
        System.out.println("Get Student Transcript For Student Bob : ");
        System.out.println(bob.getTranscript());
        //Get Grade sheet
        System.out.println("Get Section Grade sheet For Biology : ");
        System.out.println(bio1.getGradeSheet());
        //Get Course List Per Student
        System.out.println("Get Course List for Student tim : ");
        System.out.println(tim.getCourseList());
        //Get Students By Grade
        System.out.println("Get Students With Grade A: ");
        System.out.println(StudentSectionFactory.getStudentsByGrade("A"));
    }

    private Transcript getTranscript(Student s) {
        return s.getTranscript();
    }

    private List<String> getCourseNames(Student s) {
        List<TranscriptEntry> all = s.grades;
        List<String> courseNames = new ArrayList<>();
        for (TranscriptEntry te : all) {
            courseNames.add(te.section.courseName);
        }
        return courseNames;
    }

    private List<String> getGrades(Section s) {
        List<String> grades = new ArrayList<>();
        for (TranscriptEntry t : s.gradeSheet) {
            grades.add(t.grade);
        }
        return grades;
    }


}
