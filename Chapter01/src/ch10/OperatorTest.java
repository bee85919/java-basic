package ch10;

public class OperatorTest {

	public static void main(String[] args) {

		int total = 10;
		int add = 20;
		
		total += add;
		System.out.println(total);
		
		int gameScore = 100;
		int myScore;
		
		myScore = ++gameScore;
		// ++gameScore = gameScore + 1 = 100 + 1 = 101
		// myScore = gameScore = 101
		
		System.out.println(myScore + "," + gameScore);
		// 101, 101
		
		myScore = gameScore++;
		// myScore = gameScore = 101
		// gameScore++ => gameScore + 1 = 101 + 1 = 102
		
		System.out.println(myScore + "," + gameScore);
		// 101, 102
		
	}

}