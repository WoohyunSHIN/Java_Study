package Study;

import java.util.Scanner;

public class Ex12_ReverseNumber {

	public static void main(String[] args) {
	
		// 자리수와 상관없이 정수를 입력받아 입력받은 정수를 거꾸로 출력하는 코드를 while과 if를 이용하여 구현하세요.
		
		// 입력 : 1234
		// 출력 : 4321

	Scanner sc = new Scanner(System.in);	


	int num=0;
	
	System.out.print("정수 입력 : ");
	num = sc.nextInt();
	
		while(true) {
			System.out.print(num%10);
			num = num / 10;
			
			if(num==0) break;
		}
		System.out.println("\n");

System.out.println("===================================="); 

	int num2=0;
	int ret=0;
	
	System.out.print("숫자를 입력해 주세요 ");
	num2 = sc.nextInt(); sc.nextLine();
	
	while(true) {
		ret += num2%10;
		num2 /= 10;
		if(num2==0) break;
		ret *= 10;
	}
		
	System.out.println("결과 : "+ ret);
	
	}
}	
	
	
