package codes;

public class MainDrive {
	
	public static void main(String[] args) {
		
		User u1 = new User();
		
//		첫 사용자. 이름 : 김민수 , 출생년도 : 1995, 보유 포인트 : 10000P
		u1.name = "김민수";
		u1.birthYear = 1995;
		u1.point = 10000;
		
//		사용자 정보 출력
		u1.printUserInfo();
		
		
//		두번째 사용자. 이름 : 이수민, 출생년도 : 2010, 보유 포인트 : 2000P
		User u2 = new User();
		u2.name = "이수민";
		u2.birthYear = 2010;
		u2.point = 2000;
		
//		사용자 정보 출력
		u2.printUserInfo();
		
		
//		첫번째 책 생성.
		Book b1 = new Book();
//		먼나라 이웃나라 / 전체이용가 / 3000원
		b1.title = "먼나라 이웃나라";
		b1.limitAge = 0;
		b1.rentFee = 3000;
		
		
//		이수민은 이 책을 빌릴 수 있는가?
		boolean u2Result = u2.rentBook(b1);
		System.out.println(u2Result);
		
		
//		두번째 책.
//		베르세르크 / 19세 이용가 / 1000원
		Book b2 = new Book();
		b2.title = "베르세르크";
		b2.limitAge = 19;
		b2.rentFee = 1000;
		
		
//		이수민은 베르세르크를 빌릴 수 있을까?
		boolean u2B2Result = u2.rentBook(b2);
		System.out.println(u2B2Result);
		
		
	}

}










