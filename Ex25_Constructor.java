package Study;

class Human {
	String name; 	// Class Member Field 
	int age;		// Field에 초기값 할당 가능, 모든 객체가 같은 값을 가지게 된다
	String gender;
	
	void Profile() {		// Field 값을 출력하는 Method
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender + "\n");	
	}
	
	// 생성자의 특징 : Class와 이름이 같고, 반환형이 존재하지 않는 Method 
	Human(){
		// 기본 생성자, 작성하지 않아도 자바 가상머신이 자동으로 만들어준다
	}
	Human(String name, int age, String gender){
		// Method 즉, 함수 이기 때문에 overloading 이 가능하다.
		this.name = name;	// 나 자신을 가리키는 this를 붙이면 Class filed 의 name에 접근가능
							// Class Field name 에 매개변수 name의 값을 대입
		this.age = age;
		this.gender = gender;		// 전달받은 gender 를 내가 가지고 있는 gender에 대입
		// this : Class or Object 자기 자신을 가리키는 참조변수.
	}	
	
	// Quiz 1.
	Human(String name, String gender){
		this.name = name;
		this.gender = gender;
	}	
	
}

public class Ex25_Constructor {
	public static void main(String[] args) {
		Human h1 = new Human();		// "h1" 은 객체 , "Human()" 는 Constructor

		h1.Profile(); 	// null, 0, null  => Field 의 값은 자동으로 초기화 된다.
		
		h1.name = "박지성";		// 객체 생성 이후 field의 값을 세팅해 줘야한다.
		h1.age = 37;
		h1.gender = "남성";
		h1.Profile();
		
		Human h2 = new Human();		// Call the constructor
		
		h2.name = "신우현";		// 값을 일일이 넣어주기가 불편하므로
		h2.age = 27;			// 생성자를 활용하여 초기값을 지정할 수 있다.
		h2.gender = "남성";
		h2.Profile();
		
		// 생성자를 this. 를 이용해서 활용하기 
		Human h3 = new Human("이지은",27,"여성");
		h3.Profile();		
		
		// Quiz1. 이름과 성별만 매개변수로 전달받는 생성자를 오버로딩하여 작성하시고
		// h4 객체를 생성하여 테스트 하시오
		Human h4 = new Human("아이유","여성");
		h4.Profile();
		// 위에서 나이는 따로 안건드렸기 때문에 나이는 초기값이 0이 나온다.
		

	}
}
