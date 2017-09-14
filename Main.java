package ru.mail.redlin94;

public class Main {

	public static void main(String[] args) {
		
		try {
			Student student1 = new Student("Alexey", "Androsenko", "Viktorovich", 23, true, 73, 178, 4.5, false, true, 5, "CIDS");
			Student student2 = new Student("Bogdan", "Builder", "Viktorovich", 18, true, 73, 178, 4.5, false, true, 5, "CIDS");
			Student student3 = new Student("Sergey", "Eagle", "Viktorovich", 20, true, 73, 178, 4.5, false, true, 5, "CIDS");
			Student student4 = new Student("Andrey", "Joker", "Viktorovich", 21, true, 73, 178, 4.5, false, true, 5, "CIDS");
			Student student5 = new Student("Vladimir", "Uhimov", "Viktorovich", 19, true, 73, 178, 4.5, false, true, 5, "CIDS");
			Student student6 = new Student("Alexandr", "Xrey", "Viktorovich", 16, true, 73, 178, 4.5, false, true, 5, "CIDS");
			//System.out.println(ya.getInformation());
			Student[] array = new Student[] {student1,student5,student6,null,null, student2, null, student4, null, student3};
			Group g = new Group(array);
			
			
//			g.addStudent(ya);
//			g.addStudent(ya);
//			g.addStudent(ya);
//			g.addStudent(ya);
//			g.addStudent(ya);
//			g.addStudent(ya);
//			g.addStudent(ya);
//			g.addStudent(ya);
			
			
			System.out.println(g.findStudent(student1)+"\n");
			
			System.out.println(g.toString());
			g.addStudent(student1);
		} catch (IllegalAccessError | ExceptionFullGroup | ExceptionNoStudent | ExceptionParametrIsNull e) {
			e.printStackTrace();
		}
		
		
		
		
		//System.out.println(me.getInfoAbautHuman());

	}

}
