package Study;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex46_Exception {

	public static void main(String[] args) {
		// Exception : 예외, 프로그래머의 코드 수정 및 보완으로 예방 가능한 문제. class안에 포함 되어 있다.
		// Error : 프로그램의 코드상으로 수정하기 힘든 문제
		
		int[] arr = new int[] {10, 20, 30}; 	// length : 3
// 		System.out.println(arr[3]);				// index : 3
 		/*
 		 * [ 결과 ]  
 		 *  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException : 3
 		 *  3을 안쓰고 0,1,2 로 바꿔서 보완 가능하다.
 		 */

 		int a = 10;
 		System.out.printf("%d + %d = %d\n",a, 2, a + 2);
 		System.out.printf("%d * %d = %d\n",a, 0, a * 0);
// 		System.out.printf("%d / %d = %d",a, 0, a / 0);
 		/*
 		 * [ 결과 ]  
 		 *  Exception in thread "main" java.lang.ArithmeticException : / by zero
 		 *  0을 안쓰고 나머지 수로 바꿔서 보완 가능하다.
 		 */
 		
 		String str = null;
// 		System.out.println("문자열의 길이 : " + str.length());
 		/*
 		 * [ 결과 ] - 가장 많이 보게 될 Exception
 		 *  Exception in thread "main" java.lang.NullPointException
 		 *  길이를 넣어 놓지도 않고 길이를 구하라고 하니까 안되는 거지요~
 		 */
 		
 		// "try ~ catch" 라는 구문이 있다.
 		// try {} 내부의 코드를 실행할 때 어떤 예외가 발생하면 catch(){} 에서 정해진 예외를 감지하고
 		// cat {}내의 처리를 수행한다. 예외가 발생하지 않으면 catch는 실행되지 않는다.
 		
 		Scanner sc = new Scanner(System.in);
 		try {			// 예외가 발생할 가능성이 있는 코드를 try로 묶어주고
	 		int num;
	 		System.out.print("정수를 입력 : "); num = sc.nextInt(); sc.nextLine();
	 		System.out.println("입력한 정수 : " + num);
 		} catch(InputMismatchException e) {		// catch에서 ()에 어떤 예외가 발생하는지 Type(Class)를 명시
 			System.out.println("예외가 발생했습니다 !!");
 			System.out.println("입력을 올바르게 하지 않았습니다 !!");
 			// e 라는 예외 객체가 try 내에서 생성되었으므로 객체를 활용할 수 있다.
 			System.out.println(e.getMessage());
// 			e.printStackTrace();
 		} finally {				// finally : 예외 발생 여부와 상관없이 반드시 실행해야 할 코드
 			sc.close();
 			/*
 			 * 예를들어 데이터 베이스에 접속을 했다가, 
 			 * 데이터를 다운 받았든 못받았든 접속을 끝내야 할 떄 사용한다.
 			 */
 		}
 		/*
 		 * [불가능 한 것]
 		 * 실수 입력 / int 가 받을 수 있는 숫자범위 밖
 		 */
 		
	}

}
