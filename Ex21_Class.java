package Study;

class Pos2D{		// 2차원의 위치가 필요한 게임을 만들 때 사용되어야 하는 것
	String name = "호동";
	int x;			// Class 내에서 사용되는 변수는 '필드(Field)' 라고 한다 : 값을 저장할 수있는 공간. 
	int y;			
	
	void ShowPos() {		// Class 내에서 사용되는 함수를 '매서드(Method)' 라고 한다.
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}

public class Ex21_Class {

	public static void main(String[] args) {
		/*
		 * <흐름>
		 * 변수 : 하나의 데이터를 저장한다. 자료형 필요하다
		 * 
		 * 배열 : [같은 자료형]의 여러 데이터를 묶어서 관리
		 * 
		 * C 언어의 구조체 (struct) :[여러 자료형]을 포함할 수 있는 [사용자 정의 자료형]
		 * -> Problem of Struct
		 * -> : 형식이 지정 되어 있어서, 사용되는 함수도 자주 사용할 수 있는 함수가 정해져 있다.
		 * 
		 * Class의 개념 : 구조체와 함수를 묶어서 [하나의 자료형]으로 만들어서 쓰자!
		 */

		Pos2D ob1 = new Pos2D();		// Class 자료형으로 만들어낸 변수를 객체(=Object) 라고 한다. 
		ob1.x = 10;						// 객체 내부의 필드에 접근하기 위해서 (.) 을 사용한다.
		ob1.y = 20;						// 따라서 여기서는 ob1이라는 객체 내부의 x 또는 y 라는 필드에 접근한다.

		System.out.println("ob1.x : " + ob1.x);
		System.out.println("ob1.y : " + ob1.y);
		
		ob1.ShowPos();
		
		
	}

}
