package Study;
/*
 * 이미 부모 class를 가진 상태의 Child 가 thread 개념을 넣어 주고 싶을 때 
 * interface를 사용하여 추가 한다. 
 * 
 * < 예시 >
 * 10 초 안에 정답을 기입 하는 문제 : Thread 개념이 들어가 있다.
 */

class Parent{}

class Child extends Parent implements Runnable{	// Runnable : Thread의 내용을 interface로 구현
	// Thread로 구성하여 작동시킬 class
	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.print(i + " ");
		}
		
	}
}

public class Ex50_Runnable {
	public static void main(String[] args) {
		Child ob1 = new Child();		// 바로 ob1.start(); 할려니까 안된다. 따라서,
		Thread th1 = new Thread(ob1);	// Thread class의 생성자 overloading.
										// Thread() 또는 Thread(Runnable arg)
		th1.start();
		for(char ch = 'A'; ch <= 'Z'; ch ++) {
			System.out.print(ch + " ");
		}

	}
}
