package Study;

import java.util.Scanner;

public class Ex08_If {
	public static void main(String[] args) {
		// 사용자에게 점수를 입력받아 0 ~ 100 사이의 점수가 아닌 경우는 입력 오류라는 메세지를 출력하기.
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.print("점수를 입력해 주세요 :");
		score = sc.nextInt();  sc.nextLine();
		
		if(0<=score && score<=100) {			// 점수의 범위를 만족하
			if (score>60) {						// 점수가 60점 이상이면
				System.out.println("합격!");		
			}
			else {								// 점수가 60점 미만이면
				System.out.println("불합격");
			}
		}
		
		else if(0>score || 100<score ) {		// 점수의 범위를 벗어나면
			System.err.println("정상적인 점수의 범위를 벗어났습니다.");
		}
		
	}
}
