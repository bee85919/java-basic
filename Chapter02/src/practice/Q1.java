package practice;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

//		grade = (score >= 90) ? 'A':'B';
		
		char grade;
		int score;
		
		Scanner scanner = new Scanner(System.in);		
		
		System.out.println("Enter grade: ");
		score = scanner.nextInt();
		
		if (score >= 90) {			
			grade = 'A';			
		}
		
		else {			
			grade = 'B';			
		}
		
		System.out.println("Grade: " + grade);
		
	}

}
