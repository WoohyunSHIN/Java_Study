/*
		아래 결과를 만들어보세요

			[GALAXY S9]
			충전중...87%
	
			[USB 미니 선풍기]
			작동 시작 !!
	
			[USB STICK]
			용량 128 GB
			최대 전송속도 60MB/sec

		interface 필드 : static final (자동)
		interface 메서드 : public abstract (자동)
*/
package Study;
	// 2. 각 class가 interface를 구현(상속) 하도록 설정
class USB_Stick implements USB{

		@Override
		public void Act() {
			System.out.println("[USB STICK]\n용량 128 GB\n최대 전송속도 60MB/sec\n");
		}
}	// USB 메모리 스틱

class USB_Fan implements USB{

	@Override
	public void Act() {
		System.out.println("[USB 미니 선풍기]\n작동 시작 !!\n");
	}
}		// USB 미니 선풍기

class USB_Cable implements USB{

	@Override
	public void Act() {
		System.out.println("[GALAXY S9]\n충전중...87%\n");		
	}
}	// USB 휴대폰 케이블

interface USB{		// 인터페이스 USB
	// 1. 반응을 정의할 method의 형식을 지정
	void Act();
}		

class PC{			// PC
	public static void Connect(USB device) {	// USB형태를 연결할 수 있는 컴퓨터 기능
		// 3. 연결하면 device에 정의된 method 호출
		device.Act();
	}	
}

public class Ex41_USB_program {
	public static void main(String[] args) {
		
		USB_Cable u01 = new USB_Cable();
		USB_Fan u02 = new USB_Fan();
		USB_Stick u03 = new USB_Stick();
		
		PC.Connect(u01);		// 연결하자마자 반응이 나오도록 만들기
		PC.Connect(u02);		// 메인메서드에는 추가 내용 작성 없음
		PC.Connect(u03);
		
		USB u04 = () -> System.out.println("Mouse 연결!!");		// ==> Act Method 의 역활을 한다.
		PC.Connect(u04);
		/*
		 * 일반적으로 interface는 Object를 생성할 수 없으나, 
		 * 함수형 interface (interface 가 다른 멤버요소 없이 단 하나의 method만 가지는 경우)에는
		 * 람다식을 이용하여 객체를 생성할 수 있다. 해당 interface가 가지는 하나의 method의 
		 * 내용만 지정하여 객체를 생성할수 있다.
		 */

	}

}
