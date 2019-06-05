package Study;

class Test2{	
	// [ final field ]
	int a = 10;
	static int b = 20;
	final int c = 30;
	static final int d = 40;			
	private static final int e = 50;
	final int f;
	
	Test2(){
		f = 60; 		// final field 도 생성자에 의해 초기화 하는게 가능
	}
	Test2(int f){
		this.f = f; 	// 인자를 매개변수로 전달받아 member field에 초기화 할 수 있다.
	}
	
	// [ final method ]
	// Method 의 내용을 변경 할 수 없다.
	final void func1() {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
	}
	// 부모가 물려줄때 final 속성으로 method를 물려주면, 자식이 함부로 method를 변경할 수 없다. 
	// 상속에서 [overriding] 과 관련
}

/*
 * Final의 특징
 * 처음에 값을 초기화 이후 값을 변경 할 수 없다.
 */


public class Ex32_Final {
	public static void main(String[] args) {
		Test2 ob1 = new Test2();
		ob1.a +=1;
		ob1.b +=1;
//		ob1.c +=1;
//		ob1.d +=1;		// The final field Test2.d cannot be assigned. 
//		ob1.e +=1;		// 접근제한자 private 때문에, 외부에서 접근 할수 없도록 함 
		
		Test2 ob2 = new Test2(70);
		System.out.println("ob2.f : " + ob2.f);
		// 생성자에 의해서 초기화가 가능하다.
		
		ob1.func1();
	}
}
