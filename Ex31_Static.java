package Study;

class Test{
	String field1;
	
	public void Method1() {}
	
	int v1;					// non-static field
	static int v2;			// static field
	
	public void func1() {	// non-static method
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
		func3();			// func1()이 실행
	}
	public static void func2() {	// static method
//		System.out.println("v1 : " + v1);		
		/*
		 * static method 에서 non-static filed 를 참조 할 수 없다.
		 */
		System.out.println("v2 : " + v2);
	}
	public static void func3() {
		func2();			// static 간에는 서로 참조가 가능하다.
	}
	
}

/*
 *  static 이란 ?
 *  static keyword가 붙은 멤버는 객체 소속이 아니라 class 자체의 소속이 된다.
 *  1. 객체를 생성하지 않아도 멤버에 접근할 수 있다
 *  2. 객체마다의 값이 아니므로, 모든 객체들이 같은 값을 공유하게 된다.
 *  3. 생성(메모리에 load되는) 시점이 다르기 때문에, [static] 과 [non-static] 간의 
 *     서로 참조할 경우 조심
 *     
 *  c.f. 이클립스에서는 static 속성을 가지는 멤버는 Italic 으로 표기
 */

/*
 * 	[ 아래의 이유로 static method 에서 non-static field를 참조 할 수 없다 ]
 *  [ 생성시점의 차이 ]
 *  Java Source 실행 -> Compile(byte code) -> Java Virtual Machine(기계어변환) -> 실행 
 *  Source code 내의 import, class (static 속성을 가진 멤버도 같이 생성)
 *  main method 실행 -> 객체 생성 -> member field, member method(non-static)
 * 
 */

public class Ex31_Static {
	public static void main(String[] args) {
		/*
		 *  class는 자료형(설계도)이고 객체를 
		 *  생성하여 내부 멤버에 접근이 가능하다
		 */
		
		Test ob1 = new Test();
		ob1.field1 = "Test";	// Object.Field
		ob1.Method1();			// Object.Method
	
		int num = Integer.parseInt("122") + 1;
		System.out.println("num : " + num);
		
		// 객체없이, class에 의해서 member field와 method에 접근해 보기
		System.out.println("Test.v2 : " + Test.v2);
		Test.func2();  // Integer.parseInt()와 같은 호출방식
	//  class.member 
		
		Test ob2 = new Test();
		Test ob3 = new Test();
		Test ob4 = new Test();
		
		Test.v2 = 70;
		ob2.func2();		// The static method func2() from the type Test should be accessed in a static way 
		ob3.func2();
		ob4.func2();
		Test.func2();
		/*
		 * 다른 객체에서도 값을 공유한다.
		 */
		
		Test.v2 = 33;
		ob3.func2();
		ob4.func2();
	}
}
