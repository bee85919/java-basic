package ch12;

public class BitTest {
	
	public static void main(String[] args) {
				
		int num1 =  7; // 00000111
		int num2 = 10; // 00001010		
		
		System.out.println();
		
		
		System.out.println( "num1 | num2:" + (num1 | num2) ); 	
		System.out.println();
		
		//   OR: 둘 중 하나라도 1일 때, 1을 반환
		
		// 풀이: 00000111  ( 7)  (num1)
		//       00001010  (10)  (num2)
		//       --------
		// 정답: 00001111 (num1 | num2)
		//             15
		
		
		System.out.println( "num1 & num2:" + (num1 & num2) ); 	
		System.out.println();
		
		//  AND: 둘 다 1일 때, 1을 반환
		
		// 풀이: 00000111  ( 7)   (num1)
		//       00001010  (10)   (num2)
		//       --------
		// 정답: 00000010 (num1 && num2)
		//              2
		
		
		System.out.println( "num1 ^ num2:" + (num1 ^ num2) );
		System.out.println();
		
		//  XOR: 둘 중 하나가 1일 때, 1을 반환 
		//       둘 다 1일 때, 0을 반환
		
		// 풀이: 00000111  ( 7)  (num1)
		//       00001010  (10)  (num2)
		//       --------
		// 정답: 00001101 (num1 ^ num2)
		//             13
		
		System.out.println( "num1:" + (num1) );
		System.out.println();
		
		
		System.out.println( "num1 << 2: " + (num1 << 2) );
		System.out.println();
		
		// 풀이: 00000111    (7) (num1)
		//       --------
		//       00011100   (num1 << 2)
		
		
		System.out.println( "num1:" + (num1) );
		System.out.println();
		
		// num1 <<: num1에 반영되지 않는다.
		
		
		System.out.println( "num1 <<= 2: " + (num1 <<= 2) );
		System.out.println();
		
		// 풀이: 00000111   (7)  (num1)
		//       --------
		//       00011100  (num1 <<= 2)
		
		
		System.out.println( "num1:" + (num1) );
		System.out.println();
		
		// num1 <<=: num1에 반영된다.
		
	}

}
