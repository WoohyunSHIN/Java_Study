package Study;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

class Member{
	// 회원 정보를 담고 있는 class
	private String id;
	private String pw;
	private String name;
	private String age;
	private String gender;
	// getter, setter 자동 생성
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}

class Server{
	private Scanner sc = new Scanner(System.in);
	private ArrayList <Member> memberList = new ArrayList<Member>();
	
	public void Join(){
		String id, pw, name, age, gender;
		System.out.print("이름 입력 : "); name = sc.nextLine();
		System.out.print("ID 입력 : "); id = sc.nextLine();
		System.out.print("PW 입력 : "); pw = sc.nextLine();
		System.out.print("나이 입력 : "); age = sc.nextLine();
		System.out.print("성별 입력 : "); gender = sc.nextLine();
		Member tmp = new Member();
		// 생성한 tmp 객체에 필드값을 Setter로 전달.
		tmp.setName(name);
		tmp.setId(id);
		tmp.setPw(pw);
		tmp.setAge(age);
		tmp.setGender(gender);
		memberList.add(tmp);	// Data를 모두 입력한 tmp를 MemberList 에 저장
	}
	
	public Hashtable <String, String> getInfo(String id){
		Hashtable <String,String> ht = new Hashtable<String,String>();
		// MemberList 내에서 매개변수 id와 일치하는 id를 찾으면
		for(int i=0;i<memberList.size();i++) {
			if(id.equals(memberList.get(i).getId())) {
				ht.put("name", memberList.get(i).getName());
				ht.put("id", memberList.get(i).getId());
				ht.put("pw", memberList.get(i).getPw());
				ht.put("age", memberList.get(i).getAge());
				ht.put("gender", memberList.get(i).getGender());
				return ht;
			}
		}
		return null;
	}
}

public class Ex45_HashTable_Member {		// Client의 Web Browser 역활
	public static void main(String[] args) {
		// 회원 가입 2회
		Server Tabu = new Server();
		Scanner sc = new Scanner(System.in);
	
		for(int i=0;i<2;i++) {
		System.out.printf("[%d] 회원가입 \n",i+1); Tabu.Join();
		}
		
		// 특정 회원의 정보를 검색하여 정보를 확인하는 동작을 2회
		// 1. 검색이 안되는 경우  -> 회원 정보를 찾을 수 없습니다.
		// 2. 검색이 되는 경우 -> 표의 형식으로 회원 정보를 출력 할 수 있도록.
		
		for(int i=0;i<2;i++) {
			System.out.printf("회원 정보를 검색합니다(%d)\n", i+1);
			System.out.print("검색할 ID 입력 : ");
			String find = sc.next();
			Hashtable<String, String> ht = Tabu.getInfo(find);
			// 아래와 같은 형식이면 된다.
//			public Hashtable<String, String> getInfo(String id)			// getInfo는 method 이름
//			int Add(int a, int b)
//			처음 보는 method에서도 반환형을 알고 있으면 적절한 사용 방법을 익힐 수 있다.
			
			if(ht == null) {
				System.out.printf("검색한 ID [%s]를 찾을 수 없습니다.\n",find);
			}
			else {
				Enumeration<String> enu = ht.keys();
				while(enu.hasMoreElements()) {			// key 가 남아있으면 또 진행하여라.
					String key = enu.nextElement();
					String value = ht.get(key);
					System.out.printf("%10s : %10s\n",key, value);
				}
			}
			
		}
	}
}
