package ch09;

public class BirthdayTest {

	public static void main(String[] args) {

		Birthday day = new Birthday();
		day.setYear(2023);
		day.setMonth(15);
		day.setDay(30);
		
		System.out.println(day.isValid());
		System.out.println(day);
		day.printThis();
		
	}
}