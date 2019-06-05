package Study;

import java.util.Scanner;

public class Ex10_While {

	public static void main(String[] args) {
		// if: 조건이 참이면 실행문을 1회 실행
		// while : 조건이 참인 동안 실행문을 반복하여 실행
		
		int num = 5;
		System.out.println("main : "+ num);

		if(num < 10) {		// 조건이 참이면 출력하라
			System.out.println("if : "+ ++num); 	// 결과 = if : 6	
		}
		
		while(num < 10) {	// 조건이 참인동안 출력하라
			System.out.println("while : "+ ++num); 	// 결과 = while : 7,8,9,10	
		}
		
		System.out.println("main : "+ num);

		// 1에서 10 사이의 정수의 합을 출력하라
		
		int n = 1;
		int sum = 0;
		
		while(n<=10) {
			sum += n;
			n++;
		}
		System.out.println("합계 : "+sum);
		
		// while의 조건식은 반복횟수 관련일수도 있고
		// 횟수가 아닐 수도 있다.
		
		int age = 1;
		// 1 대신 사용자의 입력이면 횟수가 정해지지는 않으나 목표치가 20인 수식
		
		while(age !=20) {
			age++;
		}
		System.out.println("20살 ㅊㅋㅊㅋ");
		
		/*
		 * Quiz 1. 1에서 100사이의 홀수의 합과 짝수의 합을 각각 구하시오
		 */
		
		int start_num=1;
		int even_sum=0;
		int odd_sum=0;
		int end_num=100;
		
		while(start_num<=end_num) {
			if(start_num%2==1) {
			odd_sum += start_num;
			start_num++;
			}
			
			else if(start_num%2==0) {
			even_sum += start_num;
			start_num++;
			}
		}
		System.out.println("홀수의 합 : "+ odd_sum + ", 짝수의 합 : " + even_sum);
		
		/*
		 * while을 이용하여 입력받는 수의 범위를 체크하 
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("나이 입력 : ");
			age = sc.nextInt();

			if(age >0) {
				break;		// break 는 현재 속한 {} 의 아래쪽으로 탈출하는 제어문 
							// break 의 대상에는 for, while, switch가 있다.
							// 따라서 여기서 break는 if 가 아니라 while을 탈출한다.
			}
			System.err.println("나이를 자연수로 입력하세요.");
		}
		System.out.printf("나이는 %d 입니다.\n\n",age);
	}
}
