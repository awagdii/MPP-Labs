package lab2_prob4;

class TranscriptEntry {
    Student student;
    Section section;
    String grade;

    public TranscriptEntry(Student student, Section section, String grade) {
        this.student = student;
        this.section = section;
        this.grade = grade;
        this.student.addTranscriptEntry(this);
        this.section.addTranscriptEntry(this);
    }

    public String toString() {
        return "Student: " + student.name + "\n"
                + "Course name: " + section.courseName + "\n"
                + "Section number: " + section.sectionNumber + "\n"
                + "Grade: " + grade + "\n";
    }

}
