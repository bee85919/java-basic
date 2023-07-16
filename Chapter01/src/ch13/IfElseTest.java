package ch13;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요:");
		
		int age;
		
		age = scanner.nextInt();
		
		if (age >= 8) {
			System.out.println("학교에 갑니다.");
		}			
		
		else {
			System.out.println("학교에 가지 않습니다.");
		}

	}

}
