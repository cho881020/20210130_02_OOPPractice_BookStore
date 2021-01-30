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
		
		
	}

}










