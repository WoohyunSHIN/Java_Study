package Study;

public class Ex15_Function {
	public static void main(String[] args) {

		// 함수 (Function) 이란 ? 어떤 기능을 수행할 수있는 코드들의 집합, 이름을 부여하여 호출 가능하도록 작
		
		System.out.println();			// 입력값을 전달하지 않아도 "\n" 줄 바꿈 기능을 기본적으로 수행한다.
		System.out.println("아이유~");
	
		// y = f(x)
		// y = 2x + 1
		
		System.out.println(MyFunc(1)); 		// 함수의 호출
		System.out.println(3);
		
		MyFunc2(7);
		System.out.print("메인 함수의 종료.");
	}
	
	static int MyFunc(int x) {
		/*
		 * 반환형은 변수가 아니라 자료형만 작성(int, String, double..). 
		 * 반환형의 자료형은 return 의 자료형과 일치
		 * return은 최대 1개의 값만 반환할 수있다.
		 * 
		 */
		int result = 0;
		result = (2*x) + 1;
		return result; 		
		// return 의 2가지 기능
		// return 1. 현재 함수를 종료한다.
		// return 2. 다음에 오는 값을 호출된 자리로 반환한다.
	}
	
	static void MyFunc2(int x) {
		System.out.println("결과 : " + ((2*x)+1));
		return;		// 여기서는 함수의 1번 기능.
	}
	
}
