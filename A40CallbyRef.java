package partA.day10;

import java.util.Arrays;

public class A40CallbyRef {

	
	//call by value : 메소드 인자로 데이터 값을 전달. 메소드 인자가 원시타입
	//call by reference : 메소드 인자로 객체의 참조값을 전달 메소드 인자가 배열 또는 클래스 타입
	
	public static void main(String[] args) {
		int test = 100;
		changeTest(test);
		System.out.println("changeTest 실행후 Test = "+test);
		
		int[] intArr = {1,2,3,4,5};
				changeIntArr(intArr);
				System.out.println("changeIntArr 실행후 inAtt = "+Arrays.toString(intArr));
		
				
				
		String temp = "hello";
//		String temp = new String("hello");
		changeString(temp);
		System.out.println("changeString 실행 후 temp = "+temp);
				
		//String 불변객체 인가 확인
		String temp2="hello";
		
		System.out.println(temp.hashCode());
		System.out.println(temp2.hashCode());
		System.out.println("**temp==temp2 ?"+(temp==temp2));
		System.out.println("**temp.equals(temp2)?"+temp.equals(temp2));
		
		//"hello" 가 이미 있지만 그래도 새로 만들자
		String temp3 = new String("hello");
		System.out.println(temp.hashCode());
		System.out.println(temp3.hashCode());
		System.out.println("**temp==temp3 ?"+(temp==temp3));     	     //주소가 다름
		System.out.println("**temp.equals(temp3)?"+temp.equals(temp3));  //글자만 같으면 가능
//		문자열 해시코드값은 문자열 구성이 같으면 동일하도록 변경(override) 되어 있어  
//		객체는 다르지만 해시코드 값은 같습니다.
				
	}

	private static void changeString(String temp) {
		temp = temp.replace("ll", "**");
		//문자열은 문자열 내용이 바뀌면 객체의 의치가 바뀝니다. (불변 객체)
		//                ->  temp의 창조값이 바뀝니다.
		System.out.println("changeString  메소드 지역변수 temp = "+temp);
		
	}

	private static void changeIntArr(int[] temp) {
	//temp는 changeIntArr 메소드의 지역변수이다. 베소드가 changeIntArr(intArr); 실행될 떄
//	 IntArr 배열의 참조값을 temp 가 전달받아 저장합니다.
		temp[3] = 100;
		
	}

	private static void changeTest(int test) {
		test =200;
		
	}
	/*  참조타입과 메소드
	 * 메소드 인자의 타입에 따라 분류
	 * call by value : 로 데이터 값을 전달 메소드 인자가 원시타입
	 * call by reference : 메소드 인자로 객체의 참조값을 전달 메소드 인자가 배열 또는 클래스 타입 
	 * call by reference 예외 클래스 String
	 * String 은 불변 객체
	 * 문자열 객체의 내용을 바꾸지 않는다 문자열 메소드 또는 연결 연산으로 내용이 바뀌면 객체가 새로 생성된다.
	 * (문자열 리터럴로 String 선언할때)동일안 문자열을 한 번만 생성해서 상수 풀에 저장하여 사용하는 방식으로 효울을 높이는 장점이있다 . 단 메소드 또는 
	 * 연결 연산이 많아지면 새로운 문자열 객체가 계속 생성되는 단점도 있다.
	 * hashcode 값은 문자열 내용으로 만드는 방시긍로 변경되어 다른 클래스 객체와 다른점이 있다.
	 * new 연산으로 문자열 내용과 상관없이 객체를 새로 생성 할수있다
	 * 
	 * 참고 git 사용
	 * 1. 사용프로그램:github deskstop
	 * 2.  원격 저장소 github.com 에 계정만들기
	 * 3.  github deskstop 실행-email 선택해서 로그인
	 * 4. git 프로그램 소스코드를 관리하기 위한 목적
	 *   a.관리 ? 소스코드의 변화과정 추적 등등
	 *   b.공유 : 팀 작억할때 협업툴
	 *   
	 * 5.내컴퓨터의 폴더는 로컬 저장소(리포지토리)
	 * 6. github에 저장하는 폴더는 원격 저장소 
	 * 
	 *  로컬 저장소에서 원격 저장소로 보내기(push) 하면 관리와 공유가 시작됩니다.
	 *  로컬 저장소만 사용할때는 '나'의 코드만 관리
	 *  원격 저장소에 여러 팀원이 함꼐 공유하고 push하는 과정은 매우 신중하게 하는 작업
	 *  
	 *  로컬저장소를 만들면 .git 숨은 폴더가 생성됩니다.
	 *  
	 *  참고 :gitignore 파일은 git에 관리가 필요없는 파일(.class, .meta 폴더 등) 제외하기
	 * 
	 */

}

//오늘은 졸리고 배고프다
//언제 집가지

