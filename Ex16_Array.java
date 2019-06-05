package Study;

public class Ex16_Array {

	public static void main(String[] args) {
		
		// 데이터를 저장하는 공간
			
		/*
		 * 변수 - 단일 데이터를 저장하는 공간
		 * 		 (하나하나의 개별적인 데이터를 저장하므로, 연관성 있는 여러 데이터 사용시 불편)
		 * 
		 * 배열 - [같은 자료형]의 데이터를 [연속적인 메모리공간]에 저장하여, 
		 * index(순번)으로 참조할 수 있는 변수들의 묶음, 참조형 reference type 
		 */
		
		int []arr; 		// 배열의 선언
		int arr2[];		// 배열을 의미하는 []는 변수이름 앞/뒤에 써도 된다.
		
		int []arr3 = {1, 2, 3};		
		// {x, y, z}
		
		int []arr4 = new int[5]; 	
		// '길이'를 지정하여 공간만 생성할 수있다.
		
		/* 
		 * JAVA : "new" vs C : "(int*)malloc(sizeof(int)*5);" 
		 * 두개다 heap에다 공간을 만들어 낸다. 
		 */
		
		int []arr5 = new int[] {10, 20, 30, 40, 50};
		// 길이 대신 '내용'을 작성해도 된다.
		
//		int []arr6 = new int[3] {1, 2, 3};
		// 불가능하다, '길이'와 '내용'을 동시에 작성하는 것은 불가능 하다.
		
		/*
		 * '[]' 대괄호의 의미 
		 * 배열을 선언할 때에는 자체가 배열임을 표시하거나, 길이를 표현한다.
		 * 그외, 배열에 접근할 때에는 순번을 나타내는 index값을 표현한다.
		 */
		
		System.out.println("arr3[0] : " + arr3[0]);
		System.out.println("arr3[1] : " + arr3[1]);
		System.out.println("arr3[2] : " + arr3[2]);
//		System.out.println("arr3[3] : " + arr3[3]);
		// 배열의 길이와 같은 index는 존재하지 않는다.
		
		System.out.println("arr4[0] : " + arr4[0]);
		// 배열 공간만 생성한 경우에는, 자료형에 맞는 초기값으로 자동 초기화. 
		// 따라서 String은 NULL 로 되어있다.
		
		/*
		 * C의 Pointer vs JAVA의 Reference type
		 * 
		 * 
		 * 
		 */
		
		System.out.println("\n");
		
		// 배열의 순번이 정수형식으로 1씩 증가하면서 값에 접근하므로 for문을 이용할 수 있다.
		for(int i=0;i<3;i++) {
			System.out.println("arr[" + i + "] : " + arr3[i]);
		}
		
		System.out.println("\n");
		
		for(int i=0;i<3;i++) {
			System.out.printf("arr[%d] : %d\n",i,arr3[i]);
		}
	
		System.out.println("\n");
		
		for(int i=0;i<arr3.length;i++) {
			System.out.println("arr[" + i + "] : " + arr3[i]);
		}
		
		System.out.println("\n");
		
		for(int num : arr3) {		// 증감이 +1이라면 즉, 모든 멤버변수를 순회하려면 
			System.out.println("num : " + num);
		}
		
		System.out.println("\n");
		
		// Quiz. 정수형 배열 age를 선언하고, String 배열 name을 선언한 후
		// for 문을 이용하여 이름과 나이를 순차적으로 출력하는 코드.
		
		String []name = {"아이유", "김희철", "김영철",};
		int []age = {27, 36, 46};
		
		for(int i=0;i<name.length;i++) {
			System.out.printf("이름 : %s, 나이 %d\n",name[i],age[i]);
		}
		// 배열의 멤버 변수는 일반 변수와 동일하게 취급하면 된다.
		
	}

}
