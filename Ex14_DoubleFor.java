package Study;

public class Ex14_DoubleFor {

	public static void main(String[] args) {
		
		//for 문 안에 다른 for 문을 넣어서 중첩하여 처리 가능하다.
		
		int num=1;
		
		for(int j=0;j<5;j++) {
			for(int i=0;i<5;i++) {
				System.out.printf("%2d ", num++);
			}
			System.out.println();
		}
		
		System.out.println();
		
	
		/*
		 * System.out.printf("%d x %d = %d\n",dan, mul, dan*mul);
		 */
		
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.printf("%d x %d = %d\n",i, j, i*j);
			}
		}
		
		for(int i=1;i<10;i++) {
			for(int j=2;j<6;j++) {
				System.out.printf("%d x %d = %2d\t",j,i,j*i);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<10;i++) {
			for(int j=6;j<10;j++) {
				System.out.printf("%d x %d = %2d\t",j,i,j*i);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==0||i==4||j==0||j==4) System.out.print(" * ");
				else System.out.print("   ");
			}System.out.println();
		}System.out.println();
		
		/*
		 * 		*
		 * 		* *
		 * 		* * *
		 * 		* * * *
		 * 		* * * * * 
		 */
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" * ");
			}System.out.println();
		}System.out.println();
		
		
	}
}


// 구구단 만들기

	
