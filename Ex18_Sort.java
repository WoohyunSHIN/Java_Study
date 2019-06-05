package Study;

import java.util.Scanner;

public class Ex18_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 5명의 이름과 나이를 입력받아서 출력하는 코드를 작성하세요.
		// 배열과 for 문을 이용하여 작성하세요.
		
		String []name = new String[5];
		int []age = new int[name.length];
		
		for(int i=0;i<name.length;i++) {
			System.out.printf("(%d)이름을 입력해 주세요 : ",i+1);
			name[i] = sc.nextLine();
			System.out.printf("%s의 나이를 입력해 주세요 : ",name[i]);
			age[i] = Integer.parseInt(sc.nextLine());
			System.out.println();
		}
		
		for(int i=0;i<name.length;i++) {
			System.out.printf("이름 : %s\t\t나이 : %2d\n",name[i],age[i]);
		}
		
		sc.close();

		// Quiz. 선택정력 알고리즘을 이용하여, 나이가 많은 순서대로 정렬 하고 다시 출력하세요.
		System.out.println();
		
		for(int i=0;i<name.length;i++) {
			for(int j=i;j<name.length;j++) {
				if (age[i]>age[j]) {
					int tmp = age[i];
					String tmp_name = name[i];
					
					age[i] = age[j];
					name[i] = name[j];
					
					age[j] = tmp;
					name[j] = tmp_name;
				}
			}
		}

		for(int i=0;i<name.length;i++) {
			System.out.printf("이름 : %s\t\t나이 : %2d\n",name[i],age[i]);
		}
		
	}
}
