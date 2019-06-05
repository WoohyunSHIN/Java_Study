package Study;
// 학생관리 프로그램

import java.util.Scanner;

class Student {		// 학생이라는 자료형 만들기
	// 필드
	String name;
	int kor, eng, mat, sum;
	double avg;
	Scanner sc;
	
	// Method
	void Input() {
		sc = new Scanner(System.in);
		
		System.out.print("이름을 입력 : "); name = sc.nextLine();
		System.out.print("국어 입력 : "); kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어 입력 : "); eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학 입력 : "); mat = Integer.parseInt(sc.nextLine());
		
		sum = kor + eng + mat;
		avg = sum / 3.0;
		System.out.println();
	}
	
	void Show() {
		System.out.printf("[%s] : %d, %d, %d, 합계 : %d, 평균 : %.2f\n",
				name, kor, eng, mat, sum, avg);
	}

}
public class Ex22_Student {

	public static void main(String[] args) {

		Student st01;		// st01은 Student 자료형을 기리킬 수 있는 참조변수이다.
							// 값이 없으면 실제 데이터를 참조하고 있는게 아니다.
		
		st01 = new Student();	// 형식 : " new + 클래스이름(); "
		
		st01.Input();		// 값을 입력받을 것이다.
		st01.Show();		// 값을 출력할 것이다. 
		
		Student st02 = new Student();		// 참조 변수 선언 및 초기화를 동시에 진행해도 됩니다.
		Student st03 = new Student();		// 각 객체는 서로다른 공간을 차지하므로, 데이터가 겹치지 않는다.
		
		st02.Input(); st03.Input();
		st02.Show(); st03.Show();
		
		/*
		 * 잘 만들어진 Class를 활용하면 메인함수의 코드가 짧아지고 단순해진다.
		 * 
		 * Class는 설계도에 준한다. 
		 */
		
		
	}

}
