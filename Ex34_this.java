package Study;

class Human{
	private String name;
	private String job;
	private static int all;
	private Human target;
	
	Human(){
		System.out.println("Human 객체를 생성했습니다!!");
		this.job = "무직";
		all++;
	}
	
	Human(String name, String job){
		this(); 		// 기본생성자 호출!! 특징 : 첫번째 줄에서만 유효하다. 
		this.name = name;
		this.job = job;
	}
	
	public void Talk(String msg, Human target) {
			// Message 보내기
		target.Listen(msg,this);		// 대상을 지정하여 보내는 경우
	}
	
	public void Talk(String msg) {
		if(target == null) {
			System.out.println("대화 상대가 존재하지 않습니다.");
			return;
		}
		
		target.Listen(msg,this);		// 대상이 없으면 마지막으로 대화한 대상에게 보냄
	}
	
	public void Listen(String msg, Human sender) {
			// Message 받기
		System.out.println(sender.name + "이[" + msg + "]라고 말함");
		target = sender;
	}
	
	public void ShowProfile() {
		System.out.println("이름 : " + name);
		System.out.println("직업 : " + job + "\n");
	}
		
}

public class Ex34_this {
	public static void main(String[] args) {
		Human m1 = new Human("이지은","가수");
		Human m2 = new Human();
		
		m1.Talk("혼잣말...");
		m1.Talk("안녕 반가워", m2);
		m2.Talk("그래 나도 안녕");
	}
}
