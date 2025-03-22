package schoolManagmentSystem;

/*
 * This class is responsible for keeping track of student fee, name, grade, & fee
 */
public class Student {
	
	private int studentId;
	private String name;
	private int gradeYear;
	private double tuitionFeePaid = 0;
	private double costOfCourse = 3000;
	
	private static int id = 1000; // Starting ID number
	
	public Student(String name, int gradeYear) {
		this.studentId = generateId();
		this.name = name;
		this.gradeYear = gradeYear;
	}
	
	//Using synchronized ensures thread safety if multiple threads create Student instances concurrently
	private static synchronized int generateId() {
		return ++id;
	}
	
	public void setGradeYear(int newGradeYear) {
		this.gradeYear = newGradeYear;
	}
	
	public void updateTuitionFeePaid(double amountPaid) {
		if(this.tuitionFeePaid < this.costOfCourse) {
			this.tuitionFeePaid += amountPaid;
			System.out.println("Thank you for your payment of " + amountPaid + "€");
		}else {
			System.out.println("Tuition fee is completely paid");
		}
		viewFeeBalance();
	}
	public double getTuitionFeePaid() {
		return this.tuitionFeePaid;
	}
	
	public void viewFeeBalance() {
		System.out.println(this.name + " payment balance is " + (this.costOfCourse - this.tuitionFeePaid) + "€");
	}
	
	@Override
	public String toString() {
		return "Student ID: " + this.studentId + "\n" + 
				"Student Name: " + this.name + "\n" + 
				"Current grade year: " + this.gradeYear;
	}

}
