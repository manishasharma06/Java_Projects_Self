package schoolManagmentSystem;

import java.util.List;

public class Teacher {

	private int teacherId;
	private String teacherName;
	private double salary;
	private List<String> subjects;
	
	private static int id = 100;
	
	public Teacher(String teacherName, double salary) {
		this.teacherId = generateTeacherId();
		this.teacherName = teacherName;
		this.salary = salary;
	}
	
	private static synchronized int generateTeacherId() {
		return ++id;
	}
	
	public void addNewSubject(List<String> newSubs) {
		this.subjects = newSubs;
	}
	
	public void setSalary(double sal) {
		this.salary = sal;
	}
	public double getSalary() {
		return this.salary;
	}
	
	@Override
	public String toString() {
		return "Teacher ID: " + this.teacherId + "\n" +
				"Name: " + this.teacherName + "\n" +
				"Salary: " + this.salary + "\n" +
				"Subjects: " + String.join(", ", this.subjects);
	}
	
	
	
}
