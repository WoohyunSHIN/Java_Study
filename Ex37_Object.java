package Study;

	/*
	 * Java는 Class에 대해서 다중상속을 허용하지 않는다.
	 * Java의 모든 Class의 최상위 Class는 Object라는 것이 있다. 
	 */

class Test{}	// == class Test extends Object 

class Test2 extends Test{
	
	@Override
	public String toString() {
		return "내가 Overriding 한 Method";
	}
	
	void Show() {
		System.out.println("고유 기능");
	}
}


public class Ex37_Object {
	public static void main(String[] args) {
		Test ob1 = new Test();
		System.out.println("ob1 객체의 클래스 이름은 " + ob1.getClass().getSimpleName());
		
		Test2 ob2 = new Test2();
		System.out.println("ob2 객체의 클래스 이름은 " + ob2.getClass().getSimpleName());
		
		System.out.println("ob1.toString : " + ob1.toString());
		System.out.println("ob2.toString : " + ob2.toString());
		
		Object []arr = new Object[] {"문자열", new Integer(17), ob1, System.in};
		ob1.equals(ob2);
		
		/* 
		 * Object 라는 배열을 만들어 버리면, 배열안에 : 
		 * 문자열, Reference Class, ob1, System.in 모든 객체를 다 넣을 수 있다.
		 * 왜냐하면 Object는 최상위 이기 때문이다.
		 * 이말인 즉, Method 의 매개변수를 Object로 설정하면 모든 객체를 매개변수로 전달 받을 수 있다. 
		 */
		
		System.out.println(ob2.toString());
		System.out.println(arr[2].toString());		// Overriding은 부모 Class 형태로도 참조 가능

		ob2.Show();
//불가능 	arr[2].Show();		// 고유 기능은 부모 Class가 가지지 않으므로 자식 Class로 참조해야 실행 가능하다.
							// 따라서 Casting을 해야 하는데, 하기 전에 객체가 해당 자식 Class가 맞는지 아닌지를
							// 판별하는 연산자가 있다. "A instanceof B" : A객체가 B class로 생성된 객체인지 아닌지를 
							// 판별하여 boolean값을 반환. 
		/*
		 * [ Up/Down Casting ]
		 * Up/Down Casting을 하기 전에 A instanceof B 를 쓴다.
		 * 
		 * Upcasting 자식 객체를 부모 Class로 참조 하는 것을 말한다.
		 * Downcasting : Upcasting 된 객체를 다시 본래의 자식 Class로 참조 하는 것을 말한다.
		 * 
		 * 하나의 객체는 부모 클래스로도 참조가 가능하고, 자식클래스로도 참조가 가능
		 * 하나의 객체가 여러가지 형태로 취급 될 수 있는 특징 : 다형성 (Polymorphism) 
		 */
		
		System.out.println("arr[2] instanceof String : " + (arr[2] instanceof String));
		System.out.println("arr[2] instanceof Test2 : " + (arr[2] instanceof Test));
		
		for(int i=0;i<arr.length;i++) {			// 전체 중에서
			if(arr[i] instanceof Test2) {		// 해당 객체가 Test2의 자료형으로 생성된 객체라면
				((Test2)arr[i]).Show();			// Down-Casting을 실행하여 자식자료형으로 참조하고 고유기능 실행
			}
		}
		
	}
}
