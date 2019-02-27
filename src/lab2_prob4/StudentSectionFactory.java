package lab2_prob4;

import java.util.ArrayList;
import java.util.List;

public class StudentSectionFactory {
    private static List<TranscriptEntry> transcriptEntries = new ArrayList<>();

    public static Section createSection(int secNum, String courseName) {
        return new Section(courseName, secNum);
    }

    public static Student createStudent(String id, String name) {
        return new Student(name, id);
    }

    public static void newTranscriptEntry(Student student, Section section, String grade) {
        TranscriptEntry transcriptEntry = new TranscriptEntry(student, section, grade);
        transcriptEntries.add(transcriptEntry);
    }

    public static List<Student> getStudentsByGrade(String grade) {
        List<Student> studentList = new ArrayList<>();
        for (TranscriptEntry entry : transcriptEntries) {
            if (entry.grade == grade) {
                studentList.add(entry.student);
            }
        }
        return studentList;
    }

}
