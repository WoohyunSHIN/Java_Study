package Study;

import java.util.Scanner;

public class Ex04_WrapperClass {
	public static void main(String[] args) {
	/*
	 * Primitive 자료형, 즉 기본자료형을 은닉하는 용도로 사용한다. 
	 */
		// Primitive
		boolean bo = true;
		byte by = 10;
		short sh = 20;
		char ch = 65;
		int num = 100;
		long ln = 200L;		// 정수의 대표 자료형이 아니기 때문에 구분하기 위해서. 
		float fl = 1.1F;	// 실수의 대표 자료형이 아니기 때문에 구분하기 위해서.
		double db = 1.2;

		// Wrapper Class
		Boolean bo2 = bo;	// Primitive와 1:1 대응이 된다. 별도의 형 변환없이 대입이 가능하다. 
		Byte by2 = by;
		Short sh2 = sh;
		Character ch2 = ch;
		Integer num2 = num;
		Long ln2 = ln;
		Float fl2 = fl;
		Double db2 = db;
		
		/*
		 * 위의 Wrapper Class에 접근하기 위해서는 
		 */
		
		System.out.println("db2 :" + db2);
		System.out.println("db2.toString " + db2.toString());
		
//		String data = db2; 	// 자료형 불일치 대입 불가
		String data = db2.toString();
					//[객체].[객체의기능(함수)]
		System.out.println("data : " + data);
		
		
		/*
		 * 실습 1.
		 * System.out.println(db2.getClass().getName());
		 * 
		 * 실습 2.
		 * System.out.println("data : " + data);
		 * System.out.println("num2: " + num2);
		 *
		 * data = "120";
		 * System.out.println("data + 1 = " + (data +1));
		 * 
		 * int num3= Integer.parseInt(data);
		 * System.out.println("num3 + 1 = " + (num3+1));
		 * 
		 * 실습 3.
		 * Scanner sc = new Scanner(System.in);
		 *
		 * int num4 = sc.nextInt();	// Problem 엔터값을 처리하지 않아서 버퍼에 남긴다. 따라서 대신에
		 * int num4 = Integer.parseInt(sc.nextLine());	// 이렇게 처리하면 엔터값 생각 할 필요없다.
		 */
	}
}
