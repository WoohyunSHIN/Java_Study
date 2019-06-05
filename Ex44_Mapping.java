package Study;

import java.util.Hashtable;		
/*
 * 순번이 없고, key와 value의 1:1 맵핑을 이용하여 저장하는 자료형
 * 배열의 index 대신 key 라는 객체를 내가 지정하여 사용할 수 있다.
 * key -> value (O), value -> key (X)
 */
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Ex44_Mapping {
	public static void main(String[] args) {
		Hashtable <String, String> ht = new Hashtable<String, String>();
		// 사전(Dictionary)

		ht.put("iu930516", "아이유");		// (key,value)
		System.out.println(ht.get("iu930516"));
		System.out.println(ht.get("아이유"));
		
		ht.put("1234","3만원");		// 비밀번호 1234를 넣었을 때 3만원이라는 값을 얻을 수 있다.
		System.out.println(ht.get("1234"));
		System.out.println(ht.get("123"));		// null : 값을 반환하지 않는다.
		System.out.println(ht.get("234"));		// null
		
		ht.put("바늘", "실");
		
		//모든 key와 value 를 확인하고 싶을 경우, 모든 key 값이 필요하다.
		Enumeration <String> enu = ht.keys(); 		// enu에는 ht의 key값들만 순번없이 모여있다.
		
		while(enu.hasMoreElements()) {			// 접근하지 않은 값을 하나라도 가지고 있으면 true를 반환
			String key = enu.nextElement();		// 그 값중 하나를 key에 저장
			String value = ht.get(key);			// 방금 얻은 key를 이용하여 value를 저장
			System.out.println("key : " + key + ", value : " + value);
		}
		System.out.println("값만 추출하기");
//		======================================================================
		Enumeration <String> enu2 = ht.elements();
		
		while(enu2.hasMoreElements()) {			// 다음 값을 가지고 있으면
			System.out.println("값 : " + enu2.nextElement());	// 그 값을 출력한다.
		}
//		======================================================================
		Set<Entry<String, String>> set = ht.entrySet();
		
		Iterator it = set.iterator();
		System.out.println();
		while(it.hasNext()) {
			System.out.println("아무 값 : " + it.next());
		}
	
	}
}
