package codes;

public class Book {
	
	String title = "미입력";
	int limitAge = 0; // 0이면 전체이용가로 취급.
	int rentFee = 500; // 따로 설정 안하면 기본 대여료 500원.
	
	User rentUser = null; // 책을 빌려간사람은 처음에는 없다고 명시.

}
