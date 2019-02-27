package lab2_prob4;

import java.util.*;

public class Section {
	String courseName;
	int sectionNumber;
	List<TranscriptEntry> gradeSheet;

	public Section(String courseName, int sectionNumber) {
		this.courseName = courseName;
		this.sectionNumber = sectionNumber;
		this.gradeSheet= new ArrayList<>();
	}

	public void addTranscriptEntry(TranscriptEntry transcriptEntry){
		gradeSheet.add(transcriptEntry);
	}

	public List<String> getGradeSheet() {
		List<String> gradeList = new ArrayList<>();
		for (TranscriptEntry entry :gradeSheet){
			gradeList.add(entry.grade);
		}
		return gradeList;
	}

	public String getCourseName() {
		return courseName;
	}

	public int getSectionNumber() {
		return sectionNumber;
	}
}
