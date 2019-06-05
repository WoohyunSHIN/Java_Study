package Study;

import java.util.Scanner;		// Scanner라는 
import java.util.ArrayList;

public class Ex20_ArrayList {

	public static void main(String[] args) {

		Scanner sc;
		sc = new Scanner(System.in);

		ArrayList al = new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(3);
		
		System.out.print("al : ");
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("al.size() : " + al.size());
		/*
		 * import java.util.ArrayList 라는 Class 안에 ArrayList 라는 자료형이 이미 만들어 져 있다.
		 */
		
	}

}
