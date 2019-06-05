package Study;

import java.util.Scanner;

class TV1{
		// TV의 속성값 (전원, 채널, 볼륨)을 필드로 정의
		// TV의 기능(on/off, 필드의 값을 조정, 화면출력)을 메서드로 정의
		
		// 각 성격에 맞는 접근제한자
		// getter, setter
	
	
	/*
	 * if(power==false)
	 * 		power=true;
	 * if(power==true)
	 * 		power=false;
	 */
	
	TV1(){}
	TV1(String name){
		this.name = name;
	}

	private boolean power;
	private int ch = 8;
	private int vl = 20;
	private int mute = 0;
	private String name;
	Scanner sc = new Scanner(System.in);

	public void Power() {power = !power; Show();}
	public void ChUp() {
		if(power) ch++; if(ch<2) ch=25; if(ch>25)  ch = 2; 	Show();}
	public void ChDn() {
		if(power) ch--; if(ch<2) ch=25; if(ch>25)  ch = 2; 	Show();}
	public void VlUp() {
		if(power) vl++; if(vl<0) vl=0;  if(vl>100) vl = 100;	Show();}
	public void VlDn() {
		if(power) vl--; if(vl<0) vl=0;  if(vl>100) vl = 100;	Show();}
	public void Mute() { 
		int tmp = vl; 
		vl = mute;
		mute = tmp;
		Show();
	}
	
	void Show() {
		if(power) {
			System.out.println(name);
			System.out.println("┌──────────┐");
			System.out.printf("│  ch : %2d │\n", ch);
			System.out.printf("│ vol : %2d │\n", vl);
			System.out.println("└──────────┘");
		}
		else {
			System.out.println(name);
			System.out.println("┌──────────┐");
			System.out.printf("│   Power  │\n");
			System.out.printf("│    Off   │\n");
			System.out.println("└──────────┘");
		}
		Input();	
	}
	
	void Input() {
		System.out.println("=============");
		System.out.println("채널 (8, 2)\n볼륨 (6, 4)");
		System.out.println("음소거 (7)\n전원 (0)\t\t종료 (9)");
		System.out.println("=============");
		System.out.print("선택 > ");
		int menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 8:ChUp();break;
		case 6:VlUp();break;
		case 4:VlDn();break;
		case 2:ChDn();break;
		case 0:Power();break;
		case 7:Mute(); break;
		case 9:return;
		default:System.out.println("잘못 입력하셨습니다");
		}
	}
}

public class Ex29_TV_Prof {
	public static void main(String[] args) {

		TV1 tv1 = new TV1("Samsung");
		
				tv1.Power();
		//		tv1.Show();
		//		tv1.ChUp();
		//		tv1.Show();
		//		tv1.Power();
		//		tv1.Show();

	}
}
