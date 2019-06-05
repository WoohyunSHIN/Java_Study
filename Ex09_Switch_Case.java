package Study;

import java.util.Scanner;

public class Ex09_Switch_Case {
	public static void main(String[] args) {
		
		// switch ~ case : 하나의 값에 대해서, 값이 무엇이냐에 따라서 코드의 흐름을 분기한다
		
		Scanner sc = new Scanner(System.in);
		int num;
		String txt;
		
//		System.out.print("정수를 하나 입력 : ");
//		num = sc.nextInt();
		
		System.out.print("문자열 입력 : ");
		txt = sc.nextLine();
		
		switch(txt) {	// num이라는 값이
			case "itbank": System.out.println("입력한 값은 itbank"); break;	// 1일 경우
			// if(num==1)
			case "ITBANK": System.out.println("입력한 값은 ITBANK"); break;	// 2일 경우
			// else if(num==2)
			case "kgitbank": System.out.println("입력한 값은 kgitbank"); break;	// 3일 경우
			// else if(num==3)
			default: System.out.println("1,2,3이 아닌 다른 숫자입니다");
			// else
		}
		
		if(txt == "itbank")
			System.out.println("if : itbank 입력");
		
		System.out.println("=====================================\n\n");
		
		// password 입력 : itbank 
		// 성공 !! / 실패 !!
		
		String input;
		
		System.out.print("비밀번호 : ");
		input = sc.nextLine();
		
		switch(input) {
			case "itbank": 
				System.out.println("성공 !!"); 
				break;
			case "kgitbank":
				System.out.println("성공 2 !!");
				break;
			// 각 case 의 마지막은 반드시 break를 작성해야 한다
			// break를 만나면 코드의 진행이 현재 속한 범위 {}의 아래쪽으로 벗어나게 된다
			default:System.out.println("실패 !!");
		}
	}
}
