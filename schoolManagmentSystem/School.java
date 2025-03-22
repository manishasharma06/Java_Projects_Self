package schoolManagmentSystem;

import java.util.List;

public class School {

	private String schoolName;
	private List<Teacher> teachers;
	private List<Student> students;
	private double totalMoneyEarned = 0;
	private double totalMoneySpent = 0;
	
	public School(String schoolName, List<Teacher> teachers, List<Student> students) {
		this.schoolName = schoolName;
		this.teachers = teachers;
		this.students = students;
		this.totalMoneyEarned = calTotalMoneyEarned(students);
		this.totalMoneySpent = calTotalMoneySpent(teachers);
	}
	
	public double calTotalMoneySpent(List<Teacher> teachers) {
		for(int i=0; i<teachers.size(); i++) {
			this.totalMoneySpent += teachers.get(i).getSalary();
		}
		return this.totalMoneySpent;
	}
	
	public double calTotalMoneyEarned(List<Student> students) {
		for(int i=0; i<students.size(); i++) {
			this.totalMoneyEarned += students.get(i).getTuitionFeePaid();
		}
		return this.totalMoneyEarned;
	}
	
	public void addNewTeacher(Teacher newTeacher) {
		this.teachers.add(newTeacher);
		this.totalMoneySpent += newTeacher.getSalary();
	}
	
	public void addNewStudent(Student newStudent) {
		this.students.add(newStudent);
		this.totalMoneyEarned += newStudent.getTuitionFeePaid();
	}
	
	public List<Teacher> getTeacherList(){
		return this.teachers;
	}
	public List<Student> getStudentList(){
		return this.students;
	}
	public double getTotalMoneyEarned() {
		return this.totalMoneyEarned;
	}
	public double getTotalMoneySpent() {
		return this.totalMoneySpent;
	}
	
	@Override
	public String toString() {
		return "School details: " + "\n" +
				"Name: " + this.schoolName + "\n" +
				"Total students: " + this.students.size() + "\n" + 
				"Total teachers: " + this.teachers.size() + "\n" + 
				"Money earned: " + this.totalMoneyEarned + "€" + "\n" + 
				"Money spent: " + this.totalMoneySpent + "€" + "\n";
	}
}
