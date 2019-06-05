package Study;

import java.util.ArrayList;
import java.util.Scanner;

class Timer implements Runnable{
	private boolean End = false;
	
	public void timer() throws InterruptedException {
		for(int i=10;i>=0;i--) {
			System.out.println("\t\t남은시간 : " + i);
			Thread.sleep(1000);
		}
		End = true;
	}
	public boolean isEnd() {
		return End;
	} 
	
	@Override
	public void run() {		// Overriding 이므로 method 의 형식은 부모와 같아야하는데, 부모는 예외처리 throws가 없어서
		try {				// 직접 try ~ catch 해야한다.
			timer();		// run() 에서 내가 실행하고 싶은 method 를 호출
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Input{
	private Timer t;
	Scanner sc = new Scanner(System.in);
	
	public void setT(Timer t) {
		this.t = t;
	}
	
	public void Start() {
		ArrayList<String> al = new ArrayList<String>();
		
		while(t.isEnd() != true) {
			System.out.print("단어 입력 : ");
			String str = sc.nextLine();
			al.add(str);
		}
		System.out.println("\n\n 지금까지 입력한 단어들");
		for(String str : al) {
			System.out.println(str + " ");
		}
	}
}

public class Ex51_Typing {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * 10초의 카운트를 세어서, 10초동안 사용자에게 단어를 입력받고, 
		 * 10초가 지나면 지금 까지 입력한 모든 단어를 띄워쓰기로 구분하여 출력하도록 만들어 보시오.
		 * Thread와 Runnable을 이용하여 code를 작성하세요 
		 */
	
		Timer ob1 = new Timer();			// Runnable
		Thread th1 = new Thread(ob1);		// Thread의 생성자 매개변수로 전달
		Input ob2 = new Input();
		ob2.setT(ob1);
		
		th1.start(); 						// th1을 start()
		ob2.Start(); 						// ob2를 start()
	}
}
