package Study;

import java.util.Scanner;

class Phone{
	/*
	 * 서로 다른 폰 두대가 문자 메시지를 주고 받는 형태를 객체간의 참조를 활용하여
	 * 코드로 구현해 보세요
	 */
	
	String msg;			// 문자 메시지를 참조할 수 있는 참조함수
	String name;		// Field 를 생성할 때, 기본자료형 외의 클래스 자료형도 사용이 가능하다.
	Scanner sc;			// Filed 혹은 매개변수로 Class 자료형 변수를 사용 할 수있다.
	
	Phone(String name){
		this.name = name;
	}
	
	void getMsg(String msg, String sender) {		//메시지와 보낸사람
		this.msg = msg;								// 상대가 보낸 메시지를 내가 가지고 있는 메시지함에 저장
		System.out.println("["+ name + "]" + sender + "가 보낸메시지");
		System.out.println(msg);	//받은 메시지 출력
		System.out.println();
	}
	
	void sendMsg(Phone target) {
		sc = new Scanner(System.in);
		System.out.print("[" + name + "] 보낼 메세지 입력 : ");
		String msg = sc.nextLine();			// 입력 받은 메세지
		target.getMsg(msg,name);			// 대상의 getMsg를 호출하면서 같이 전달, 보낸 사람(자신의 이름)도 전달.
	}

}

public class Ex30_SMS_program {
	public static void main(String[] args) {
		Phone p1 = new Phone("갤럭시");
		Phone p2 = new Phone("아이폰");
		
		p1.sendMsg(p2);
		// p1에서 입력받아서, p2에서 출력 할 수 있도록. 
		p2.sendMsg(p1);
	}
}
