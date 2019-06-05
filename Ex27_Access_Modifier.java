package Study;

class Member{
	private String name;
	private int age;
	private String id;
	private String pw;

	/*
	 *  접근 제한자 : Class, Member Field, Member Method에 대해 외부로 부터 접근을 제외하기 위한 Keyword이다.
	 *  [ 통상적 ]
	 *  Field = private 
	 *  Method = public
	 *  
	 *  [ 접근 제한자 종류 ]
	 *  private : Class 내부에서만 접근 가능
	 *  protected : 상속 관계에 대해서만 접근 허용
	 *  package (default) : 같은 package 내의 class에 대해서 접근 허용 ex_) Ex02, Ex01에 있는 거에 접근가능
	 *  public : 모든 외부로 부터의 접근을 허용
	 *  
	 *  Method 를 이용하여 private 에 접속하여 사용할 수 있게 한다.
	 */
	
	// private field 에 대해서 값을 setting 하거나, 값을 얻어 올수 있는 Method 가 필요해진다.
	// < getter > , < setter >
	public void setId(String id) {		// setter	
		this.id = id;
	}
	
	public String getId() {				// getter
		return id;
	} 
	
	// pw 필드에 대한 < getter >  와 < setter > 를 작성하기
	
	public void setPw(String pw) {		// setter
		this.pw = pw;
	}
	
	public String getPw() {				// getter
		return pw;
	}
	
}

public class Ex27_Access_Modifier {
	public static void main(String[] args) {
		Member m1 = new Member();
//		m1.id = "itbank";
//		m1.pw = "it";

//		System.out.println("m1의 비밀번호 : " + m1.pw);
		// 외부에서 Member 의 field 값에 접근 해서 보여준다 따라서 보안상 좋지않다.
		// 따라서 private 를 Member의 자료형 앞에 붙인다.
		
		m1.setId("itbank"); 		
		// setter를 활용하여 private field에 값을 세팅
		System.out.println("m1의 ID : " + m1.getId());
		// getter를 활용하여 private field의 값을 얻어오고, 그 값을 출력
		
		m1.setPw("babo");
		
		System.out.println("m1의 PW : " + m1.getPw());
	}
}
