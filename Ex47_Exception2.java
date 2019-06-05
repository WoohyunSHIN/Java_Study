package Study;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception{				// Exception : 모든 예외 class의 최상위 class
	@Override
	public String toString() {
		return "범위에 맞게 점수를 넣지 않았습니다!!!";
	}
}

public class Ex47_Exception2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		
		try {
			System.out.println("점수 입력 (0~100): ");
			score = sc.nextInt(); sc.nextLine();
			if(0 > score || score > 100) {
				throw new MyException(); 		// throw 는 예외 객체를 catch에게 전달한다.
			}
			System.out.println("입력한 점수 : " + score);
			
		} catch(InputMismatchException e) {		// 이미 정의된 예외
			System.out.println("자료형이 일치하지 않습니다. 정수를 입력하세요");
		} catch(MyException e) {				// 내가 따로 만들어낸 예외
			System.out.println(e.toString());
		} catch(Exception e) {					// 예외 class의 최상위 이므로, 나머지 모든 예외를 처리한다.
			e.printStackTrace();				// 일반적인 처리 방법.
		} finally {
			sc.close();
		}
		System.out.println("프로그램 종료");
	}
}
