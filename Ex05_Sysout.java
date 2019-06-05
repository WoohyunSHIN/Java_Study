package Study;

import java.io.IOException;

public class Ex05_sysout {

	public static void main(String[] args) throws IOException {
	/*
	 * Java 에는 3가지의 system 통로가 있다.
	 */
		
//	 system.in
//	 ex_)
	  System.out.print("1 byte의 글자를 입력 : ");
	  int num = System.in.read();			// system.in 이라는 것은 read 라는 1 byte 짜리를 읽을 수 있는 함수를 가지고 있다.
	  char ch = (char)num;
	  
	  System.out.println("num : " + num);
	  System.out.println("ch : " + ch);
	 	
//	 system.out
//	 ex_)
	  System.out.print("줄바꿈이 없는 출\n");
	  System.out.println("자동으로 한줄 바꿔주는 출력");
	  System.out.print(ch + "," + num);
	  
	  System.out.printf("C언어의 printf()함수와 유사한 출력\n");
	  /*
	   * 	데이터				서식		결과
	   * 	boolean				%b		논리형 결과(true/false)
	   * 	byte, short, int 	%d		Decimal, 10진수
	   * 						%x		Hexadecimal, 16진수
	   * 						%o		Octal, 8진수
	   * 	long				%ld		Long Decimal
	   * 	float				%f		부동 소수점 방식
	   * 	double				%f		부동 소수점 방식
	   * 	char				%c		단일 문자
	   * 	String				%s		문자열
	   */

	  System.out.printf("%b\n", 2>1);
	  System.out.printf("%c\n", 97);
	  System.out.printf("%d\n", 97);
	  System.out.printf("%f\n", 1.2f);
	  System.out.printf("%f\n", 3.14);
	  System.out.printf("%s\n", "문자열~");
	  
//	 system.err
	  System.err.println("빨간색 글자로 예외, 오류 관련 메시지를 출력합니다.");
	
		
		

	}
}
