package Study;

import java.io.IOException;

public class Ex48_Throws {
	public static void main(String[] args) throws IOException {
		
		System.out.print("글자 하나 입력 (1byte): ");
		int ch = System.in.read();
		System.out.println("ch : " + ch);
		
		System.out.print("글자 하나 입력 (1byte): ");
		int num = System.in.read();
		System.out.println("num : " + num);
		
		// 사용자에게 값을 입력받아서 저장하는 경우
		// 자료형 불일치, 범위 초과 등의 예외가 발생할 소지가 있다
		// IOException
		// 자주 사용되는 코드에 예외가 있다면, 해당 메서드를 호출하는 함수에서
		// throws [예외] 형식을 이용하여 함수내 발생하는 모든 예외를 
		// 상위 레벨에게 전가시키는 구문
		

	}
}
