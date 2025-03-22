package schoolManagmentSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//School 1: Demon Slayer
		Teacher giyu = new Teacher("Giyu Son",1500.00);
		Teacher uzui = new Teacher("Uzui Son", 1400.00);
		
		Student inoske = new Student("Insoke H",7);
		Student zen = new Student("Zen S", 6);
		Student tan = new Student("Tan K", 7);
		Student nez = new Student("Nezko K",8);
		inoske.updateTuitionFeePaid(250);
		zen.updateTuitionFeePaid(1400);
		
		List<Teacher> DSteachers = new ArrayList<>();
		DSteachers.add(giyu);
		DSteachers.add(uzui);
		
		List<Student> DSstudents = new ArrayList<>();
		DSstudents.add(nez);
		DSstudents.add(zen);
		DSstudents.add(tan);
		DSstudents.add(inoske);
		School demonSlayer = new School("Demon Slayer", DSteachers,DSstudents);

		System.out.println(demonSlayer);
			
		//School 2: DBZ

	}

}
