package codes;

public class User {
	
//	멤버변수에 값 대입 안할경우, 기본값 대입.
//	ex. String - null, int - 0, boolean - false 등.
	
	String name="미입력";
	int birthYear = 0; // 생년이 0이면 미입력으로 간주.
	int point = 0; // 기본값은 충전 포인트 없는 상태. 0원.
	
	
//	기능 1. 사용자 기본 정보 출력
//	결과자료형 : 없음.
//	이름 : printUserInfo
//	실행 시 필요한 재료? 없다.
	
	void printUserInfo() {
		
//		=======사용자정보======
//		이름 : 조경진
//		나이 : 34세 (2021년 기준)
//		보유 포인트 : 10000P
//		=====================
		
		
		System.out.println("======사용자정보======");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + "??세");
		System.out.println("보유 포인트 : " + point + "P");
		System.out.println("====================");
		
	}

}



