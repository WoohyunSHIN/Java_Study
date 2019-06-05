package Study;

public class Ex01_Variable {
	public static void main(String[] args) {
		
		char ch2;			//변수의 선언
		char ch = 'A';		//변수의 선언 및 초기화
		
		ch2 = 66;			// 변수에 값을 할당, 대입
		
		// 변수를 선언(공간을 생성)할 때에는 				[자료형] [변수이름];
		// 변수를 선언하면서 동시에 초기값을 할당 : 초기화 		[자료형] [변수이름] = [값];
		// 이미 선언된 변수는 자료형을 기재하지 않고 값을 대입 	[변수이름] = [값];
		
		// char : 2 byte의 정수를 나타낸다 (하지만! 글자를 표현하기 위해서 사용하는 자료형) 따라서 ASCII 코드가 아니라 UNIcode 로 잡는다. 문자를 정수형태로 저장한다.
		
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);

		
		short sh = 32767;	// 2 byte 크기의 정수 (+-)를 표현하는 자료형
		
		System.out.println("sh : " + sh); 
		
		// char 2byte, short 2byte 로 똑같으나, 표현할 수 있는 범위가 다르다. 
		// 왜냐하면 char 는 음수가 필요 없으므로 unsigned 자료형이다. 
		// char = 0 ~ 65535
		// short = -32768 ~ 32767
		
		int num = 10;
		// 4 byte 크기의 수를 표현하는 기본 자료형
		// -21억 ~ + 21억
		// 자료형을 지정하지 않은 모든 정수는 int로 간주한다 (정수 중의 대표자료형이다.)
		
		int age = 27;
		System.out.println("나이 : "+ age);
		
		long ln = 2200000000L;	// int자료형은 22억을 가질수 없기 때문에!
		// 8 byte 크기의 정수를 담을 수 있는 자료형
		// 값을 대입할때 마지막에 소문지 'l' 혹은 대문자 'L'을 적어야 표현이 가능하다.
		
		float fl = 3.14f;
		// 4 byte 크기의 실수를 표현하는 자료형
		// 값을 대입할때 마지막에 소문자 'f를 적어야표현이 가능하다.
		
		double db = 11.24;
		// 8 byte 크기의 실수를 표현하는 자료 (실수 중의 대표자료형이다.)
        
        boolean bo;        // true 혹은 false 의 값만 저장할 수 있는 논리 자료형, 1 Byte
        char ch;
        
        ch = 65;
        fl = 3;
        //'영어 소문자'로 시작하는 자료형을 Java의 기본 자료형 (Primitive Type) 이라고 한다.
        
        String name = "아이티뱅크";
        //'영어 대문자'로 시작하는 자료형은 Class라고 한다.
        // Class는 기본 자료형을 이용하여 사용자가 직접 만들 수 있는 '사용자 정의' 자료형이다.
        // Class 는 C 언어 구조체에서 함수를 포함하는 개념이다. 원래 구조체에는 함수개념 쓸수 없고 변수 개념만 쓸 수 있기 때문에.
        
        System.out.print(name);            // 줄 바꿈 없이 출력하는 함수
        System.out.println(name);        //자동으로 한줄 바꿈을 포함하는 함수
        System.out.printf(name);        // 서식에 맞춰서 출력하는 함수
        
        /*
         *  변수 : 값을 담을 수 있는 공간
         *  함수 : 어떤 기능을 포함하고 있는 코드의 묶음, name()
         *  제어문 : 프로그램의 흐름을 제어하는 구문
         *  상수 : 변수에 담지 않고 바로 사용하는 값, 프로그램 시작전에 미리 메모리에 Load 된다
         */
	}
}
