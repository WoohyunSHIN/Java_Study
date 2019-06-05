package Study;

class Pos2D{
	private int x;
	private int y;
	// Hy) 시작점은 (0,0)이 아니라 (-9,-9) 라고 합시다.
	
	public Pos2D(){
		System.out.println("기본 생성자 호출 !!");	// -> 공통처리 부분이 여러줄이면 
		x = -9;									// 생성자 마다 작성하면 효율이 떨어진다.
		y = -9;
	}
	public Pos2D(int x, int y){
//		System.out.println("기본 생성자 호출 !!");  // -> 공통처리 부분이 여러줄이면
//		Pos2D();		// 생성자 내부에서는 자기 자신의 이름을 사용할 수 없다.
		this();			// 생성자 내부에서 또다른 생성자를 호출하고 싶을 때 "this()"의 형식을 쓴다.
		this.x = x;		// this() 는 각 생성자의 첫번째 줄에서만 호출이 가능하다.
		this.y = y;
	}
	
	/*
	 * this.Member 	(Field 또는 Method)
	 * this()	   	(또 다른 생성자 호출)
	 * this			(객체 자기 자신의 Method의 인자값으로 전달하고 싶을 때)
	 */
	
	public void ShowPos() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		System.out.println();
	}
	
}

public class Ex33_Inherit {

	public static void main(String[] args) {
		Pos2D ob1 = new Pos2D(3,4);		
		ob1.ShowPos();
		
		Pos2D ob2 = new Pos2D();
		ob2.ShowPos();

	}

}
