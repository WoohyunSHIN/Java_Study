package Study;

import java.util.Scanner;

public class Ex07_Control_Statement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 제어문 : 프로그램의 흐름이나 분기를 제어하는 구문
	
		/* 
		 * 1. 조건문 : if, switch ~ case
		 * 조건에 따라 실행 여부를 결정하는 구문
		 * 
		 * 1-1. if
		 * if(조건){
		 *		실행문;
		 * } 
		 *
		 * 실행문이 한 줄인 경우에는 {} 블럭을 생략할 수 있다.
		 * 조건에 따라서 조건이 참이면 실행문을 실행하고,
		 * 조건이 거짓이면 실행문을 실행하지 않는다.
		 * 조건절 바로 다음에 ; (세미콜런)을 작성하지 않는다.
		 * 
		 * 
		 * 
		 
		int age;
		
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		if(age >=20) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("미성년자입니다.");
		}
		 */
		//Quiz.1 세 과목의 점수를 입력받아 평균(실수)이 60 점 이상이면 합격, 아니면 불합격을 출력하는 코드
		double a,b,c;
		
		System.out.print("a과목의 성적을 입력해 주세요 : ");
		a = sc.nextDouble(); sc.nextLine();
		
		System.out.print("b과목의 성적을 입력해 주세요 : ");
		b = sc.nextDouble(); sc.nextLine();
		
		System.out.print("c과목의 성적을 입력해 주세요 : ");
		c = sc.nextDouble(); sc.nextLine();
		
		double avg = (a+b+c)/3;
		if(avg >= 60) {
		System.out.printf("당신은 %.2f 점이기 때문에 합격입니다.",avg);
		}
		
		else {
		System.out.printf("당신은 %.2f 점이기 때문에 불합격입니다.",avg);
		}
		
		/* 
		 * 2. 반복문 : while, for, do ~ while
		 * 조건에 따라 지정된 횟수, 혹은 무한대로 반복을 실행하는 구문
		 */
		
		/* 
		 * 3. 분기문 : break, continue, return
		 * 조건에 상관없이 반복을 탈출하거나, 반복의 처음으로 되돌아가는 구문
		 */
		
		
		
	}
}
