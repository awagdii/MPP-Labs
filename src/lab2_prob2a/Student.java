package lab2_prob2a;

public class Student {
	private String name;
	private GradeReport report;
	
	public Student(String name) {
		this.setName(name);
		this.report=new GradeReport(this);
	}
	public GradeReport getReport() {
		return report;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				'}';
	}
}
