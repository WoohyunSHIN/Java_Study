package Study;

import java.util.HashSet; // [특징]순번이 없고 중복을 허용하지 않는다. 달려있는 번호가 없으니까 보따리 안에 다 들어있다고 생각하면된다.		
import java.util.Iterator; // [특징]순번이 없는 집합 내에서 각 자료를 순환할때 사용

public class Ex43_Set {
	public static void main(String[] args) {
		HashSet hs = new HashSet(); 	// 기본형은 Object 처리한다.
		
		hs.add("ITBANK");
		hs.add(3.14);
		hs.add(new Integer(10));
		hs.add(3.14);

		System.out.print("hs내의 멤버 : ");
		for(Object ob : hs) {		// [해석] hs 내의 모든 멤버중 하나를 ob라고 할 때
			System.out.print(ob + " "); // ob의 값을 출력해라.
		}System.out.println();
		
		System.out.println("hs의 크기 " + hs.size());
//		============================================================
		Iterator it = hs.iterator();	// Set을 Iterator 형으로 변환
		/* 
		 * Iterator는 보따리 안에 있는 Object들 중 내가 접근 했던 값은 체크를 해놓는다.
		 * 내가 한번도 접근 하지 않아 체크 되지 않는 값이 있으면 it.hasNext가 true를 반환한다.
		 * 여러 데이터를 순환할 수 있도록 만들어진 자료형
		 */
		System.out.print("Iterfator it의 값들 : ");
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}System.out.println();
		
	}
}
