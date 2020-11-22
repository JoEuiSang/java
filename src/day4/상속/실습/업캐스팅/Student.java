package day4.상속.실습.업캐스팅;

public class Student extends Person {
	private String grade;
	private String major;

	public Student(String name) {
		super(name);
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
