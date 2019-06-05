package Study;

interface A{						// abstract class의 한 종류, 일반적으로 Object를 생성할 수 없다.
	int a = 10;						// 1. Interface의 모든 field는 static final 속성을 가진다.
	void ShowA();					// 2. Interface의 모든 method는 public abstract 속성을 가진다. 
									// 즉, 자식 class를 만들어 상속 해 줘야 쓸 수 있다.
}	// "다중 상속"이 유일하게 허용된 java의 class 중 하나. 

class B implements A{				// implements keyword 를 이용하여 구현(상속)한다.
	@Override
	public void ShowA() {
		System.out.println("a : " + a);
	}
}

interface C{
	int c = 20;
	void ShowC();
}

class D implements C, A{

	@Override
	public void ShowA() {
		System.out.println("a : " + a);
	}

	@Override
	public void ShowC() {
		System.out.println("c : " + c);
	}
	
}

public class Ex40_Interface {
	public static void main(String[] args) {
		System.out.println("A.a : " + A.a);
		// static 이므로 객체없이 field 에 접근 가능
//		A.a = 12; 	// final에 의해서 초기값 변경 불가. 
	
//		A ob1 = new A();	// 생성 불가능 : Cannot instantiate the type A
//		C ob3 = new C();	// 생성 불가능 : Cannot instantiate the type A
		
		B ob2 = new B();
		ob2.ShowA();
		
		D ob4 = new D();
		ob4.ShowA();
		ob4.ShowC();
	}
}
