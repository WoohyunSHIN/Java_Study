package Study;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

public class Ex42_Collection {

	public static void main(String[] args) {
		// 여러 데이터를 다룰때에, 목적에 맞게 편리하게 사용할 수 있도록 만들어진
		// 자료 저장하는 구조 : Collection Framework
		
		int []arr = new int[] {1,2,3};
		/*
		 * 배열은 가운데 멤버가 탈락하면 그 자리가 null이나 쓰레기 값으로 대체되면서
		 * 위치 이동이 발생하지 않기 때문에, 직접 위치를 변경해주어야 하고
		 * 길이보다 더 많은 데이터를 받으려면 새로운 객체를 생성해야 하는 번거로움이 있다.
		 * 
		 * 대표 적인 Java의 Collection
		 * List, Set, Map
		 */ 
		 
		 // <List> : 중복을 허용하고, 순번에 의해서 데이터를 저장하는 방식
		 // 장점 : Java에 존재하는 모든 Object를 다 넣을 수 있.
		 // 단점 : Down-casting을 다 해줘야하는 번거로움이 있다.
		
		 ArrayList al = new ArrayList();
		 al.add("String");
		 al.add("1");
		
		 System.out.println("al의 길이 : " + al.size());
		 
		 for(int i=0;i<al.size();i++) {
			 System.out.print(al.get(i) + " ");
		 }System.out.println();
		 // 이 때, 길이는 2 이다 
		 
		 al.remove("1"); 	// 1을 삭제
		 
		 System.out.println("al의 길이 : " + al.size());
		 
		 for(int i=0;i<al.size();i++) {
			 System.out.print(al.get(i) + " ");
		 }System.out.println();
		 

		 al.add(3.14);		// Object 를 매개변수로 전달받음
		 // 전체 출력
		 for(int i=0;i<al.size();i++) {
			 System.out.print(al.get(i) + " ");
		 }System.out.println();
		 
		 // 전체 중 문자열에 대해서만 문자열의 길이를 구하기
		 for(int i=0;i<al.size();i++) {
			 if(al.get(i) instanceof String) {
				 System.out.println("문자열의 내용 : " + al.get(i));
				 System.out.println("문자열의 길이 : " + ((String)al.get(i)).length());
			 }
		 }
		 
		 ArrayList<String> al2 = new ArrayList<String>();
		 // 기본적으로 Collection은 Object를 추가 할 수 있지만 
		 // < > 사이에 원하는 Class를 지정하여, 지정된 Class만 받도록 할 수 있다.
		 // 이것은 Generic type 지정 이라는 방법이다.
		 // 따라서, al2.add(3.14); 를 추가 할려고 하면 불가능 하다 왜냐하면 
		 // 이제 al2는 String만 처리하기 때문이다.
		  
		 al2.add("3.14");
		 al2.add("ITBANK");
		 al2.add("Java");
		 
		 for(int i=0;i<al2.size();i++) {
			 	// instanceof 를 사용 할 필요가 없다.
				 System.out.println("문자열의 내용 : " + al2.get(i));
				 System.out.println("문자열의 길이 : " + al2.get(i).length());
				 // down-casting이 필요하지 않다.
			 }
		 }
		 
		 
	 }
}
