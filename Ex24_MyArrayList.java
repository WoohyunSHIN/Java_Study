package Study;

import java.util.Scanner;

class ArrayList{
	// Field
	Scanner sc = new Scanner(System.in);
	private int len = 1;
	
	int [] arr = new int[len];
	int [] tmp;
	
	// Method
	void input() {
			for(int i=0;i<arr.length;i++) {
				if(arr[i] == 0 ) {		// 0이면 입력받아라
					System.out.printf("입력 (%d) : ", arr.length);
					arr[i] = sc.nextInt();
					if(arr[i] == 0) {	// 입력받았는데도 0이면 종료해라
						System.out.println("0을 입력하여 종료합니다");
						return;
					}	
				}
			}
			
			if(arr[arr.length - 1] != 0) {			// 만약 배열의 마지막 값이 0이 아니면(꽉 찼으면)
				System.out.printf("출력 (%d) : ", arr.length);	// 출력하기
				for (int i = 0; i < arr.length; i++) {	
					System.out.print(arr[i]);		
					if(i != arr.length - 1) 
						System.out.print(", ");	// 끝값이 아니면 ", " 를 출력
				}System.out.println("\n");
				
				tmp = new int[len + arr.length]; // tmp = new int[단위길이 + 기존길이];
				
				for(int i=0;i<arr.length;i++) 	// arr의 길이만큼 반복하여
					tmp[i] = arr[i];			// arr의 데이터를 모두 tmp에 복사
				
				arr = tmp;						// {1, 2, 3, 0, 0, 0}
			}	
	}

	int get(int i) {	// 배열의 값을 반
		return arr[i];
	}
	
	int size() {		// 배열의 길이를 반환
		return arr.length;
	}
	
	void add(int x) {	// 전달받은 n을 배열의 마지막 위치에 담아준다.
		if(arr[arr.length -1] != 0) {			//만약 배열의 마지막 값이 0이 아니면 (꽉 찼으면)
			
			tmp = new int[len + arr.length];	// tmp = new int[단위길이 + 기존길이]
			for(int i=0;i<arr.length;i++) {		// arr의 길이만큼 반복하
				tmp[i] = arr[i];				// arr의 데이터를 모두tmp 에 복
				}
			arr = tmp;							// {1, 2, 3, 0, 0, 0}
			}
		arr[arr.length -1] = x;
	}

}

public class Ex24_MyArrayList {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.input();

		System.out.println(al.get(0)); 		// al 에 있는 0번쨰 것을 get 하여라.
		
		// 위에 import java.util.ArrayList 라는 것을 추가 하지 않았을 경우,
		// 위의 내용이 어떻게해서 출력되는지를 설명하는 부분이다.
		java.util.ArrayList al2 = new java.util.ArrayList();
		
		al2.add(2);		// al2에 2 값을 더한다.
		System.out.println(al2.get(0));		// al2의 0번째 것을 get 하면 2가 출력이 된다. 
		
	}
}
