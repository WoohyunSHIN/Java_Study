package Study;

import java.util.Scanner;

public class Ex11_ID_Number_program {

	public static void main(String[] args) {

		/*
		 * Quiz. 
		 * 사용자에게 이름과 주민등록번호 13자리 (가상)을 모두 입력받아서
		 * 4자리 출생 연도 (현재 2019), 월, 일, 나이, 성별을 알려주는 코드
		 * 
		 * 1. 주민번호가 13자리가 아니면, 다시 입력하게 하기 (while)
		 * 2. 자릿수를 구분하여 연,월,일을 별도의 변수에 저장하기
		 * 3. 나머지 항목은 자유형으로 풀기 (권장사항 : if, switch, while을 한번씩 사용해보기.
		 */
		
		/*
		 * <HINT>
		 * int num = 9305162345678;		// int는 불가능 하다, String 이나 long 으로 해결하라.
		 * long ln = 9305162345678L;
		 * String str = "9305162345678";
		 * 
		 * System.out.println("문자열의 길이 : " + str.length());		// 문자열의 길이를 구해주는 함수.
		 */
	
		/*
		 * 변수 선언(이름, 입력데이터(문자열, 정수), 연, 월, 일, 성별 )
		 * 
		 * 문자열로 이름과 데이터를 입력받아서 데이터가 13자리가 아니면 반복하여 입력받기
		 * 길이 검사가 끝났으면 문자열 데이터를 정수형 데이터로 바꿔서 담기
		 * Long ln = Long.parseLong(str);
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);

		String id;
		Long id_ln;
		int select;
		long year=0;
		long month=0;
		long day=0;
		long gen=0;
		
		while(true) {
			System.out.println("1. 주민번호를 입력 ");
			System.out.println("2. 출생 년도 출력 ");
			System.out.println("3. 출생 월 출력 ");
			System.out.println("4. 출생 일 출력 ");
			System.out.println("5. 성별 출력 ");
			System.out.println("0. 종료 ");
			System.out.print("번호를 입력해주세요 : ");
			select = sc.nextInt(); sc.nextLine();
			
			switch(select) {
			case 1: 
				System.out.print("주민번호 13자리를 입력해 주세요 : ");
				id = sc.nextLine();

				if(id.length()==13) {
					id_ln = Long.parseLong(id);
					id_ln /=1000000;
					gen = id_ln%10;
					
					id_ln /= 10;
					day = id_ln%100;
					
					id_ln /= 100;
					month = id_ln%100;
					
					year = id_ln/100;
					break;
				}
				else if(id.length()!=13){
					System.err.println("주민번호를 잘못 입력하셨습니다. 다시입력해 주세요");
					break;
				}
			
			case 2: System.out.println("당신은 " + (1900+year) + "년에 출생하셨습니다."); break;
			case 3: System.out.println("당신은 " + month + "월에 출생하셨습니다."); break;
			case 4: System.out.println("당신은 " + day + "일에 출생하셨습니다."); break;
			case 5: 
				if(gen==1 || gen==3) {
					System.out.println("당신은 남성입니다."); break;
				}
				else {
					System.out.println("당신은 여성입니다."); break;
				} 
			
			case 0: return;
			default : System.err.println("번호를 잘못 입력하셨습니다. 다시 입력해주세요.");
				
			}
		}
	}
}
