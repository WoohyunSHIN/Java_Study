package Study;

import java.util.Scanner;

public class Ex13_For {

	public static void main(String[] args) {

		// cmd + shift + f : 소스 코드 글자 정령.
		
		int cnt = 0;

		while (cnt < 5) {
			System.out.printf("%d : Hello, world !!\n", cnt);
			cnt++;
		}

		for (int i = 0; i < 5; i++) {
			System.out.printf("%d : Hello, world !!\n", i);
		}

		// Quiz. 1부터 10까지 정수의 합을 구하는 코드를 for문을 이용하여 작성하자.
		int sum = 0;
		
				for(int i=1;i<=10000;i++) {
					sum += i;
				}
		System.out.println("합계 : "+ sum);
		
		// Quiz. 1에서 100 사이의 홀수의 합과 짝수의 합을 구해서 출력하자.
		int sum_odd=0;
		int sum_even=0;
		int start_num=1;
		int end_num=100;
		
		for(int i=start_num;i<=end_num;i++) {
			if(i%2==1) {
				sum_odd=sum_odd+i;
			}
			else {
				sum_even=sum_even+i;
			}
		}
		System.out.println("홀수 합계 :" + sum_odd + "짝수 합계 :"+ sum_even);
		
		// Quiz. 1부터 10까지의 정수를 한줄에 출력하기.
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
	
		System.out.println();
		
		// Quiz. A ~ Z 까지 출력하는 코
		for(int i=65;i<91;i++) {
			System.out.printf("%c ",i);
		}
		
		System.out.println();
		
		// Quiz. A, B, C, ... Z 출력하기 마지막에는 "," 없
		for(char i='A';i<='Z';i++) {
			if(i=='Z') {
			System.out.print(i);
			}
			
			else {
			System.out.print(i+", ");
			}
		}

		System.out.println();
		
		// Quiz. 정수를 하나 입력받아 1부터 입력받은 수 까지 합을 출력하는 코드.
		Scanner sc = new Scanner(System.in);
		
		int end_nu;
		int result=0;
		System.out.print("숫자를 입력해주세요 : ");
		end_nu = sc.nextInt(); sc.nextLine();
		
		for(int i=1;i<=end_nu;i++) {
			result += i;
		}
		System.out.println("결과 : "+ result);
		
	}
}
