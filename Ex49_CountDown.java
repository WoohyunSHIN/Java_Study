package Study;

import java.util.Scanner;

class Timer{
	
	// 시간을 입력받아서(초) 지정된 초만큼 카운트다운 할 수 있는 객체를 구성
	// 남은 시간을 표시할때의 형식 : [04:59] <-

	// 분과 초를 구분하기 위해서 /, % 연산
	// Thread.Sleep(1000);
	// throws
	
	public static void Start() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.print("시간을 입력(초) : ");
		int sec = Integer.parseInt(sc.nextLine());
		
		for (int i = sec; i >= 0; i--) {
			System.out.printf("%02d : %02d\n", i/60, i%60);
			Thread.sleep(1000);		// CPU에게 1초간 일시정지를 전달하는 메서드
		}
		sc.close();
	}
}

public class Ex49_CountDown {

	public static void main(String[] args) {
		try {
			Timer.Start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
