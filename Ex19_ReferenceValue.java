package Study;

public class Ex19_ReferenceValue {

	public static void main(String[] args) {
			
		int []arr = new int[] {1,2,3,4,5};
		/*
		 * 배열을 선언하고 값을 할당한 경우
		 * arr는 배열 자체를 담고 있지 않고,
		 * 배열이 위치하고 있는 곳의 참조값을 가지고 있다.
		 * 
		 * 같은 자료형의 다른 변수를 선언하고, arr의 값을 대입하면
		 * 새로 생성한 변수도 똑같이 arr의 대상을 바라보게 된다.
		 */
		
		int []tmp = arr;
		
		System.out.print("tmp : ");	
		for(int i=0;i<tmp.length;i++) {
			System.out.print(tmp[i] + " ");		
		}
		System.out.println();

		tmp = new int[] {10,20,30,40,50,60,70};

		System.out.print("arr : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");		
		}
		System.out.println();
		
		arr = tmp;
		
		System.out.print("arr : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");		
		}
		System.out.println();
        
        // 1. 참조변수는 데이터 자체가 아니라, 데이터의 위치를 참조하는 주소값을 저장하는 변수
        
        // 2. 하나의 참조변수가 바라보는 방향(대상, 데이터)을 바꿀 수 있다.
        
        // 3. 배열은 생성 당시의 길이를 변경할 수 없는 정적 데이터 타입이지만, 새로운 배열을 생성하고
        //       기존 데이터를 복사하는 형식으로 길이가 늘어나는 것과 같은 효과를 만들어 낼 수 있다.
        
        int [] arr = {1,2,3};
        
        System.out.println("arr : " + arr);
        System.out.print("arr : ");                // arr 배열 출력하기
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        int [] tmp = new int[arr.length + 3];    // tmp를 arr보다 3길게 생성하
        
        for(int i=0;i<arr.length;i++) {            // arr에 있는 모든 값을 tmp에 복
            tmp[i] = arr[i];
        }
        
        for(int i=0;i<tmp.length;i++) {            // tmp의 길이가 더 길기 때문에
            if(tmp[i]==0) {                            // 비어있는 칸에는 i+1 값을 대
                tmp[i] = i + 1;
            }
        }
        
        arr = tmp;        // 기존 arr는 버리고, tmp가 가리키는 배열을 새로운 arr가 됨
        
        System.out.println("arr : " + arr);
        System.out.print("arr : ");                // 새로운 arr 배열 출력
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
	}
}
