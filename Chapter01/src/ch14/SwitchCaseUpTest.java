package ch14;

import java.util.Scanner;

public class SwitchCaseUpTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int month;
		int day;		
		
		System.out.println("달을 입력하세요:");
		month = scanner.nextInt();
		
		day = switch (month) {
		
			case 1, 3, 5, 7, 8, 10, 12 -> {
				yield 31;
			}
			
			case 4, 6, 9, 11 -> {
				yield 30;
			}
			
			case 2 -> {
				yield 28;
			}
			
			default -> {
				System.out.println("존재하지 않는 달입니다.");
				yield 0;
			}

	
		}; // 세미콜론이 없으면 에러가 발생한다.
		
		System.out.println(month + "달은 " + day + "일 까지 있습니다.");

	}

}
