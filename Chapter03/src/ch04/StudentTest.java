package ch04;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.studentName = "Lee";
		studentLee.studentAddress = "Seoul";
		
		Student studentKim = new Student();
		
		studentKim.studentName = "Kim";
		studentKim.studentAddress = "New York";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		
	}

}
