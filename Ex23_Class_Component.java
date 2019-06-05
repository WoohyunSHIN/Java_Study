package Study;

class Test{		// Java에서는 총 5가지의 클래스 구성요소가 존재한다.
	// 1. Field : Data 를 저장할 수 있는 공간 (변수)
	String name;
	int score;
	double avg;
	private int score2; 		
	public double avg2;
	/*
	 * 4. 접근제한자 : 클래스 내부의 값에 접근할수 있는 범위(내부 또는 외부)를 제한. 보안문제!
	 * 				Private 은 비공개
	 * 				Public 은 공개
	 */
	
	// 2. Method : Data를 이용하여 처리할 수있는 코드의 집합, 함
	void Func() {
		
	}
	
	// 3. Constructor : Class 의 형태대로 객체를 생성하는 함수, "생성자"
	Test(){	
		/*
		 * 함수인데, 클래스의 이름과 같고 반환형이 존재하지 않는 함수.	
		 * 역활 : 객체 생성, 클래스에 정의된 필드 생성, 메서드 연결.
		 * 클래시 작성시 정의하지 않으면, 자바 가상머신이 자동으로 작성해준다.
		 */
		System.out.println("객체 생성!!");
	}
}

public class Ex23_Class_Component {
	public static void main(String[] args) {
		Test ob1 = new Test();		// 여기서 뒤에 new 이후에 오는 Test 는 Constructor 의 Test이다.
		
//		ob1.score2=100; 	// 불가능 하다 왜냐하면 Class에 score2 객체를 private 로 해놓았기 때문이다.
		ob1.avg2 = 95.33;
		
		System.out.println("name : " + ob1.name); 	
		/*
		 * 초기화도 진행되지 않았는데, 이미 초기화가 되어 있다 ?
		 * 5. Garbage Collector의 역활
		 * (1) 필드가 초기화되지 않았다면, 자료형에 맞는 값으로 초기화합니다.
		 * (2) 참조되지 않는 객체를 자동으로 소멸시킨다 (자동 메모리 관리)
		 * (3) 생성자의 자동 생성, 기타 자동으로 처리되는 내용을 관리해준다.
		 */
	}
}
