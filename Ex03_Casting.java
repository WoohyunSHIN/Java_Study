package Study;

public class Ex03_Casting {
	public static void main(String[] args) {
		
		// '=' 대입연산자 : 기본적으로 자료형은 같다는 전제를 가진다. 우측에 있는 값(수식이나 함수의 형태라면 계산을 끝내고 최종 값을 구해서), 좌측의 공간에 대입한다.
		
		byte by = 10;
		int num = by;		// Promotion, 암묵적 형 변환
		
		System.out.println("by : "+by );
		System.out.println("num : "+num );

		/*
		* by = num;		
		* 불가능하다 Type mismatch : cannont convert from int to byte.
		* 따라서 아래와 같이 해결한다. 
		*/
		
		by = (byte)num;		// Casting, 명시적 형 변환 
		
		System.out.println("by : "+by );
		System.out.println("num : "+num );
		
		num = 128;		// byte에서는 표현할 수 없는 값.
		by = (byte)num;
		
		System.out.println("by : "+by );
		System.out.println("num : "+num );
		
		
	}
}
