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
//		나이는 따로 계산하지 않고, 클래스에 만들어둔 메쏘드 활용.
		System.out.println("나이 : " + getKoreanAge(2021) + "세");
		System.out.println("보유 포인트 : " + point + "P");
		System.out.println("====================");
		
	}
	
//	기능 2. 사용자 나이 계산 기능.
//	결과자료형 : int
//	이름 : getKoreanAge
//	실행 시 필요한 재료? 몇년도에 대한 나이가 궁금한지, 년도를 받아서 계산.
	int getKoreanAge(int year) {
		
		int myAge = year - birthYear + 1;
		
//		계산 결과를 이 메쏘드의 결과로 지정.
		return myAge;
		
	}
	
//	기능 3. 책을 한권 빌려가는 기능.
//	결과자료형 : boolean => 대여 성공 / 실패 여부 결과로 지정.
//	이름 : rentBook
//	필요한 재료? : 빌려가려는 책을 재료로.
	boolean rentBook(Book book) {
		
//		돈이 충분한지? => 돈이 모자라면, 대여 실패로 결과 처리.
		if (point < book.rentFee) {
//			돈이 모자라서 대여 실패.
			System.out.println("포인트가 부족합니다. 대여에 실패했습니다.");
			return false;
		}
		
//		돈이 충분한건 확인된 상태로, 추가 검사.
//		나이가 대여 가능한 나이(2021)인지?
		if (getKoreanAge(2021) < book.limitAge) {
//			나이가 안되서 대여 실패.
			System.out.println("나이가 어려서 빌릴 수 없습니다.");
			return false;
		}
		
//		이 코드는 언제 실행? => 돈이 충분히 있어야. 모자라면 위에서 return 처리. (메쏘드 강제 종료)
//		위의 if문에 들어가지 않아야만 => 밑의 코드가 실행됨.
//		대여 실패조건이 하나도 없었다. => 대여 성공으로 처리.
		System.out.println("대여 성공");
		return true;
		
	}

}











