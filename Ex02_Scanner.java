package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex02_Scanner {
	public static void main(String[] args) throws IOException {
		// 사용자가 프로그램에값을 입력할 때에는 여러가지 예외가 발생할 수 있다.
		// throws IOException : Input Output 할때 예외가 있으면 IOException 으로 떤져라 = 버려라.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		// 입력 받을 수 있는 객체 br을 생성
		/* system : 크게 3가지의 통로를 가지고 있다 in, out, error
		 InputStreamReader : 1byte 짜리 입력을 2byte 짜리로 바꿔주는 놈임
		 BufferedReader : 2byte 짜리 여러개를 한 문장으로 넣을 수 있는 놈임 
		 */
		
		System.out.print("이름을 입력하세요 : ");
		name = br.readLine();		// br의 기능 중 하나인 readLine()을 실행하여 사용자에게 한 줄 단위로 입력받는다.
	
		System.out.println("이름 : "+ name);
		
		System.out.println("===================or=====================");
		
		Scanner sc= new Scanner(System.in);
		// Scanner에는 1byte -> 2byte -> 줄 단위 입력이 내장되어 처리고, 입출력 관련 예외 처리도 내장되어 있다.
		System.out.print("이름을 다시 입력하세요 : ");
		name = sc.nextLine();	// 사용자에게 입력을 받아서 enter 값 까지 내용을 문자열 형태로 반환한다. 
		System.out.println("새로 입력한 이름 : "+name);
		
		int age;
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();		// 사용자에게 정수를 입력받아 반환한다.
		System.out.println("나이 : " + age);
		
	}
}
