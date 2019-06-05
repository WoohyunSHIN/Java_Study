package Study;

class Pos2D{ 		// 2차원과 3차원 좌표를 출력하는 작업에서 중복....
	int x;
	int y;
	
	public void ShowPos() {
		System.out.println("x : " + x);
		System.out.println("y : " + y + "\n");
	}
	private void func1() {}
}

class Pos3D extends Pos2D{		// Pos2D class를 상속받는 자식 class Pos3D
	/*
	 * 부모 class의 내용 (class의 구성요소)
	 * field, method : 내용과 이름을 그대로 가져온다
	 * constructor : 부모 class 와 자식 class 이름이 다르므로, overloading된 경우 신경써야함
	 * 접근 제한자 : 부모 class에서 설정한 범위보다 더 넓게 설정하면 안된다.
	 * 		- Method overloading : 중복 정의
	 * 		- Method overriding : 부모에게 물려받은 함수를 새로 [재정의]
	 */
	
	int z;
	
	// Overriding : private -> protected -> package(=default) -> public
	@Override 
	// 컴파일러에게 내가 해당 method를 overriding 중이라고 알려줌
	// overriding 규칙에 어긋나면 경고를 전달함
	public void ShowPos() {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("z : " + z + "\n");
	}
	// method의 접근 범위와 반환형, 함수이름, 매개변수의 형태는 동일하게 가져가나
	// 내용이 다를 수 있다. (overriding  : 물려받은 method 변경, 상속에서만 발생)
}

public class Ex35_Inherit2 {

	public static void main(String[] args) {
	Pos2D ob1 = new Pos2D();
	ob1.x = 3;
	ob1.y = 4;
	ob1.ShowPos();
	
	Pos3D ob2 = new Pos3D();
	ob2.x = 11;
	ob2.y = 12;
	ob2.z = 14;
	ob2.ShowPos();

	}

}
