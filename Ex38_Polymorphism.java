package Study;
class Human{
	
	Human(String name){
		this.name = name;
	}
	protected String name;
}
/*
 * 모든 자식 클래스는 Show()를 작성하여, 이름과 직업을 출력하도록 작성.
 */
class Actor extends Human{
	
	Actor(String name) {
		super(name);
	}

	void Show() {
		System.out.println("이름 : " + super.name + "\t직업 : " + this.getClass().getSimpleName() );
	}
}

class Singer extends Human{
	
	Singer(String name) {
		super(name);
	}

	void Show() {
		System.out.println("이름 : " + super.name + "\t직업 : " + this.getClass().getSimpleName() );
	}
}

class Student extends Human{
	
	Student(String name) {
		super(name);
	}

	void Show() {
		System.out.println("이름 : " + super.name + "\t직업 : " + this.getClass().getSimpleName() );
	}
}

class Room{
	Human []arr = new Human[3];
	
	public void Enter(Human obj) {
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i] == null) {
				arr[i] = obj;
				System.out.println(obj.name + "입장 !!\n");
				return;
			}
		}
		System.out.println("방이 꽉 찼습니다  !!");
	}
	
	public void ShowAll() {
		System.out.println();
		System.out.println("===입장명===\n");
		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof Actor)		((Actor)arr[i]).Show();
			if(arr[i] instanceof Singer)	((Singer)arr[i]).Show();
			if(arr[i] instanceof Student)	((Student)arr[i]).Show();
		}
	}
}


public class Ex38_Polymorphism {

	public static void main(String[] args) {
		// Mission : 3명의 각기 다른 직업의 객체를 생성하고, Room 객체를 생성하여 입장시키고,
		//			 입장인원들의 프로필을 출력하도록 구현.
		Actor ob1 = new Actor("아이유");
		Singer ob2 = new Singer("이지은");
		Student ob3 = new Student("종래썜");
		Human ob4 = new Human("행인1");
		
		Room room = new Room();
		
		room.Enter(ob1);
		room.Enter(ob2);
		room.Enter(ob3);
		room.Enter(ob4);
	
		room.ShowAll();
	}

}
