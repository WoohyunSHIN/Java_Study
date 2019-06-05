package Study;

public class Ex17_Swap {

	public static void main(String[] args) {
		
		String ph1 = "갤럭시 S4";
		String ph2 = "iPhone 6";
		
		System.out.println("ph1 : " + ph1);
		System.out.println("ph2 : " + ph2);
		System.out.println();
		
		// 두 변수의 값을 서로 교환하기
		
		String tmp;
		tmp = ph1;
		ph1 = ph2;
		ph2 = tmp;
		
		System.out.println("ph1 : " + ph1);
		System.out.println("ph2 : " + ph2);
		System.out.println();
		
		// 배열을 선택정렬로 오름차순 정렬하기 
		int []arr = {2,7,4,8,6};
		
		System.out.print("arr : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {			//기준
			for(int j=i;j<arr.length;j++) {		//비교대상
				if(arr[i]> arr[j]) {
					int tmp2 = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp2;
				}
			}
		}
		
		System.out.print("arr : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
