package Study;

import java.util.Scanner;

class Timer2{
	private double min;
	private boolean over = false;
	
	Timer2(double n){		min = n;	}
	
	public void ShowTimer() {
		for (double i = min * 60; this.over == false && i >= 0 ; i--) {
			System.err.printf("\t\t\t\t\t%02d : %02d\n", (int)(i / 60), (int)i % 60);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		over = true;	
	}
	public boolean isOver() {	return over;	}
	public void setOver(boolean over) {	this.over = over;	}
}
class Quiz implements Runnable{
	
	Quiz(int answer, Timer2 tm){	//퀴즈를 진행하면서 타이머를 항상 참조할 수 있도록 저장하기 위한 필드 및 생성자
		this.answer = answer;
		this.tm = tm;
	}
	Timer2 tm;
	int answer;	
	void Question() {
		Scanner sc = new Scanner(System.in);
		System.out.println("다음 중 자바의 구성 요소가 아닌 것은 ?");
		System.out.println("1. 클래스");
		System.out.println("2. 접근 제한자");
		System.out.println("3. 쓰레기 수집");
		System.out.println("4. 포인터");
		System.out.println("5. 생성자 오버로딩");
		System.out.print("선택 : ");
		int sel = sc.nextInt();
		
		if(sel==answer && tm.isOver() == false) System.out.println("정답입니다 !!");
		else if(tm.isOver())	System.err.println("시간 초과 !!");
		else			System.err.println("공부하세요 !!");	
		
		tm.setOver(true);	// 답을 입력했다면 타이머를 중지시킨다
		sc.close();
	}
	public void run() {
		Question();		//퀴즈 시작 !!
	}
}
public class Ex52_Timer {
	public static void main(String[] args) throws InterruptedException {
		Timer2 timer = new Timer2(0.09);		// 같은 패키지 내의 클래스는 참조가 가능하다
		
		// 5초 동안 시간을 주고 간단한 객관식 문제를 만들어서 정답/오답을 판별하는 퀴즈 만들기
		Quiz quiz = new Quiz(4, timer);	// 정답은 4번이고 생성한 timer객체를 참조하도록 전달
		Thread th1 = new Thread(quiz);
		th1.start();
		Thread.sleep(50);	// 문제 출력 0.05초 이후 타이머를 시작하도록
		timer.ShowTimer();
		
		/*
		 * < 시간 있을 때 좀 더 알아볼 methods 		
		 * th1.isDaemon();
		 * th1.join();
		 * th1.interrupt();
		*/
		
	}
}
