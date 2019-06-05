package Study;

class Parent{
	String name;
	
	Parent(){
		System.out.println("부모 클래스 생성자 호출 !!");
	}
	
	Parent(String name){
		this();
		this.name = name;
	}
}

class Child extends Parent{
	int num;
	Child(){
		// 컴퓨터가 "extends Parent"를 보고 부모 클래스의 생성자를 자동으로 호출한다.
		System.out.println("자식 클래스 생성자 호출 !!");
	}
	
	Child(String name){
//		this.name = name;
		super(name);		// super는 부모 클래스의 생성자를 호출하는 keyword
	}
	
	void ShowName() {
//		System.out.println("이름 : " + this.name);
		System.out.println("이름 : " + super.name);
		
		System.out.println(this.num);
//		System.out.println(super.num);
		
		/*
		 * name 필드는 부모클래스와 자식클래스가 공통적으로 보유하고 있으므로, this or super 어떤 걸 써도 무방하다.
		 * super 는 부모를 가리키는 keyword 이다. 따라서 자식 클래스 안에 있는 num은 "super.num"으로 사용 불가능 하다.
		 */

	}
}

public class Ex36_Super {
	public static void main(String[] args) {
		Child c1 = new Child("자식 객체");	
		c1.ShowName();
	}
}
