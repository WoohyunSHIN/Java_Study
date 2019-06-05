package Study;

import java.util.Scanner;

public class Ex06_Operator {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		System.out.println("a + b = "+(a+b));
		System.out.println("a - b = "+(a-b));
		System.out.println("a * b = "+(a*b));
		System.out.println("a / b = "+(a/b));
		// 정수와 정수의 연산은 정수가 되고, 연산 과정 중에 실수가 포함되면 결과가 실수가 된다.
		System.out.println("a / b = "+(a/(double)b));
		System.out.println("a % b = "+(a%b));
	
		// 관계 연산 (크기비교)
		System.out.println("a > b : " +(a>b));
		System.out.println("a >= b : " +(a>=b));
		System.out.println("a < b : " +(a<b));
		System.out.println("a <= b : " +(a<=b));
		System.out.println("a == b : " +(a==b));
		System.out.println("a != b : " +(a!=b));
		
		// 단항 연산 (부호 및 증감)
		int num = 10;
		System.out.println("++num : " + ++num);
		System.out.println("--num : " + --num);
		
		System.out.println("num++ : " + num++);
		System.out.println("num : " + num);
		
		System.out.println("num-- : " + num--);
		System.out.println("num : " + num);
		
		/* 
		 * 배정 대입 연산자 (or 복합 대입 연산자)
		 * 
		 * 연산자			식			의미
		 * +=			a+=b		a = a + b
		 * -=			a-=b		a = a - b
		 * *=			a*=b		a = a * b
		 * /=			a/=b		a = a / b
		 * %=			a%=b		a = a % b
		 * 
		 * 대입을 할 때 기존의 값을 덮어씌우지 않고, 유지한 상태에서 b 의 값을 연산한다.
		 */
		int view = 0;
		view += 100;
		System.out.println("view : " + view);
		
		// 논리 연산 (AND, OR, NOT)
		boolean bo1 = true;
		boolean bo2 = false;
		
		System.out.println("bo1 && bo2 : "+ (bo1&&bo2));
		System.out.println("bo1 || bo2 : "+ (bo1||bo2));
		
		System.out.println("bo1 && bo2 && true || false : " + (bo1 && bo2 && true || false));
		System.out.println("!ture : " + !true);
		
		// 삼항 연산자, if else 로도 처리가 가능하지만 두가지의 선택지를 가지는 경우에 주로 사용 가능 ex) 있다 없다, 크다 작다.
		// 구문(문장) 이 아니라 연산자이기 때문에 활용 범위가 더 넓다.
		int n1 = 10;
		int n2 = 20;
		
		int n3 = (n1 > n2) ? n1 : n2;
		System.out.println("n3 : " + n3);
		
		boolean login = true;
		System.out.println((login) ? "로그아웃" : "로그인");
		
		//Q.1 삼항 연자를 이용하여, 나이를 입력받아 성인/미년자를 구분하는 코드를 작성해보자.
		Scanner sc = new Scanner(System.in);
		int age=0;
		
		System.out.print("나이를 입력해 주세요 : ");
		age = sc.nextInt();	sc.nextLine();
		
		String result = (age > 19) ? "당신은 성인입니다." : "당신은 미성년자입니다.";
		System.out.println(result);
		
		System.out.println((age>19)? "당신은 성인입니다." : "당신은 미성년자입니다.");		
	
        // '.' 연산자 : 객체 혹은 클래스 내부의 값에 접근한다. 객체 안에는 필드(변수), 메서드(함수,기능), 2가지가 존재한다.
        int[] arr = {1,2,3,4,5};
        System.out.println("배열의 길이: "+arr.length);         // 내부 변수 접근
        // 배열'의'길
        System.out.println("배열의 해시코드를 알려주는 기능"+arr.hashCode());
        
        int num = Integer.parseInt("99");
        // 문자열에서 숫자를 추출하여 int형으로 변환시켜주는 Integer 클래스'의' 기능에 접
        System.out.println(num+1);
        
        // '[]' 연산자 : 배열의 특정 위치를 참조할 때 사용하는 연산자이다. 배열의 순번을 나타낼 때 사용한다.
        System.out.println("arr[0] :"+arr[0]);
        System.out.println("arr[1] :"+arr[1]);
        System.out.println("arr[2] :"+arr[2]);
        
        // '!' 연산자 : 논리 부정 (True -> False, False -> True)
        boolean bo1 = true;
        System.out.println("!bo1 :"+!bo1);
        
        // '~' 연산자 : 비트를 부정
        /*
         * 컴퓨터는 bit 단위로 데이터를 전송하거나 처리한다. 1이나 0의 값으로 나타낸다.
         *
         * 8bit => 1Byte
         * 1024 Btye => 1 KB
         * 1024 KB => 1 MB
         * 1024 MB => 1 GB
         * 1024 GB => 2 TB
         *
         */
        
        num = 11;
        System.out.println("num(10) : "+num);
        System.out.println("num(02) : "+Integer.toBinaryString(num));
        
        // '<< or >>' = Bit shift : 2의 배수로곱하거나 나눌 경우 빠른 내부 처리를 위해 사용한다. 컴퓨터한테는 이렇게 speak 해주는게 더욱 효율적이다.
        System.out.println("num >> 2"+(num >> 2));    // 1011 -> 0000 0010 오른쪽으로 2칸
        System.out.println("num << 2"+(num << 2));    // 1011 -> 0010 1100 왼쪽으로 2칸
        
        num = 3;
        System.out.println("num : 3");                        //3
        System.out.println("num << 1 : " + (num <<1));        //6
        System.out.println("num << 2 : " + (num <<2));        //12
        System.out.println("num << 3 : " + (num <<3));        //24
        System.out.println("num << 4 : " + (num <<4));        //48
        
        
	}
}
