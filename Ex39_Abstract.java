package Study;

abstract class AB{					// abstract(=추상) class : abstract class, abstract method를 포함한다.
	int a;
	int b;
	public abstract int Result();	// abstract method : abstract method, 정의가 없고 형식만 존재한다.
}

class Child extends AB{				
	@Override	// abstract class 를 상속받는 자식 class 는 의무적으로, abstract method를 overriding 해야한다.
	public int Result() {			// 상속받은 abstract method 는 내용이 달라도 된다.
		return a + b;
	}	
	
}

class CD extends AB{
	@Override
	public int Result() {		// 상속받은 abstract method의 형식은 같아야 한다.
		return a*b;
	}
}

public class Ex39_Abstract {
	public static void main(String[] args) {
	
//		AB ob = new AB(); 
	/*
	 * abstract class는 내용이 구체적이지 않으므로 Object(=객체)를 생성할 수 없다.
	 * abstract class를 상속 받는 자식 class가 abstract method를 정의하여
	 * overriding 하고 Object를 생성한다.
	 * 
	 * [Abstract]
	 * 상속을 위해서 디자인 된 class 이다.
	 * 위의 Child 와 CD 는 디자인 적으로 공통점을 가지게 되고 내용은 각자 가지게 된다.
	 */
		
		Child ob1 = new Child();
		CD ob2 = new CD();
		
		ob1.a = 10;		ob1.b = 20;
		ob2.a = 11; 	ob2.b = 22;
		
		AB []arr = new AB[] {ob1, ob2}; 

		for(AB tmp : arr) {						// for(int i=0;i<arr.length;i++){ (arr[i] == tmp) }
			System.out.println(tmp.Result());
		}
	}
}
