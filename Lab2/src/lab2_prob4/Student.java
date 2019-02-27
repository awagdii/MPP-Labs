package lab2_prob4;

import java.util.*;

public class Student {
    String name;
    String id;
    List<TranscriptEntry> grades;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        grades = new ArrayList<>();
    }


    public Transcript getTranscript() {
        return new Transcript(grades, this);
    }

    public List<String> getCourseList() {
        List<String> courseList = new ArrayList<>();
        for (TranscriptEntry grade : grades) {
            courseList.add(grade.section.getCourseName());
        }
        return courseList;
    }

    public void addTranscriptEntry(TranscriptEntry transcriptEntry) {
        grades.add(transcriptEntry);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
