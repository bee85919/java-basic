package ch16;

public class ForTest {

	public static void main(String[] args) {

		int num;
		int sum;
		
		for (sum = 0, num = 1; num <= 10; num ++) {
			
			sum += num;
//			num ++;
			
		}
		
		System.out.println(sum);
		
		
		sum = 0;
		num = 1;
		while (num <= 10) {
			
			sum += num;
			num ++;
			
		}
		
		System.out.println(sum);
		
	}

}
