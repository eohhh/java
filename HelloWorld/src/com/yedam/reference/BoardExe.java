package com.yedam.reference;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *  실행클래스.
 *  1.글목록 2.글등록 3.삭제 9.종료
 */
public class BoardExe {
	static Board[] boardRepo = new Board[100]; // 게시글등록 배열.
	static Scanner scn = new Scanner(System.in);
	static String loginId; // 로그인 아이디를 저장하기 위한 변수선언.
	
	public static void initDate() throws ParseException {
		// 배열의 샘플데이터.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		boardRepo[0] = new Board("게시글제목1", "내용입니다1", "user01", sdf.parse("2025-01-27"));
		boardRepo[1] = new Board("게시글제목2", "내용입니다2", "user02", sdf.parse("2025-01-27"));
		boardRepo[2] = new Board("게시글제목3", "내용입니다3", "user03", sdf.parse("2025-01-27"));
		boardRepo[3] = new Board("게시글제목4", "내용입니다4", "user04", sdf.parse("2025-01-27"));
		boardRepo[4] = new Board("게시글제목5", "내용입니다5", "user05", sdf.parse("2025-01-27"));
		
		boardRepo[5] = new Board("게시글제목6", "내용입니다6", "user06", sdf.parse("2025-01-27"));
		boardRepo[6] = new Board("게시글제목7", "내용입니다7", "user07", sdf.parse("2025-01-27"));
		boardRepo[7] = new Board("게시글제목8", "내용입니다8", "user08", sdf.parse("2025-01-27"));
		boardRepo[8] = new Board("게시글제목9", "내용입니다9", "user09", sdf.parse("2025-01-27"));
		boardRepo[9] = new Board("게시글제목10", "내용입니다10", "user10", sdf.parse("2025-01-27"));
		
		boardRepo[10] = new Board("게시글제목11", "내용입니다11", "user11", sdf.parse("2025-01-27"));
		boardRepo[11] = new Board("게시글제목12", "내용입니다12", "user12", sdf.parse("2025-01-27"));
		boardRepo[12] = new Board("게시글제목13", "내용입니다13", "user13", sdf.parse("2025-01-27"));
	}
	
	public static void boardList() {
		// 글목록.	
		// 1페이지: 0~4, 2페이지: 5~9, 3페이지 10~14
		int page = 1;
		int lastPage = (int) Math.ceil(getMaxCount() / 5.0); // 13/5 => 2.6 , Math.ceil => 반올림 (매스.씰)
		// Math.ceil(getMaxCount() / 5.0) 은 실수타입이여서 오류 => (int)를 사용해서 캐스팅한다. int lastPage와 같은 정수로 만듦.
		while(true) {			
			int firstIdx = (page - 1) * 5; // 1페이지: 0~4를 불러오기 위한 식. (page = 1; 일때 대입해보면 0. page: 2 => 5, page =3; 도 마찬가지)
			int lastIdx = (page * 5) - 1;  // 1페이지: 0~4를 불러오기 위한 식. (page = 1; 일때 대입해보면 4 page:2 => 9.)
			for(int i = firstIdx; i <= lastIdx; i++) {
				if (boardRepo[i] != null) {
					System.out.println(boardRepo[i].showBoard());
				}
			} // 5건씩 출력이 되도록. ???
			
			System.out.println("이전페이지: p, 이후페이지: n, 종료: q 를 입력하세요.");
			String paging = scn.nextLine();
			if(paging.equals("n")) { 	// 이후페이지 n 을 입력시 page++로 다음페이지를 보여줌.
				// 마지막 페이지보다는 작은값.
				if(page < lastPage) { // 조건문을 써서 마지막 페이지보다는 작은값일 경우에만 다음페이지를 보여줌
					page++;					
				}
			} else if (paging.equals("p")) { // 이전페이지 p를 입력시 page--로 이전페이지를 보여줌.
				// 1보다는 큰 페이지.
				if(page > 1) { // 조건문을 써서 첫번째 페이지 이전의 경우는 보여주지 않음
					page--;					
				}
			} else if (paging.equals("q")) { // return;으로 페이지를 종료.
				return;
			
			}
		} // end of while.
	} // end of boardList().
	
	// 배열을 매개값으로 전달하면 건수가 몇건인지 반환. (마지막 페이지를 찾아서 알려주기 위함.)
	public static int getMaxCount() {
		int count = 0; // 전체건수가 몇건인지 반환하기 위해서
		for(int i = 0; i <boardRepo.length; i++) {
			if(boardRepo[i] != null) {
				count++;
			}
		}
		return count; // 전체건수반환.
	}
	
	public static void addBoard() {
		// 글등록.
		// 제목: 5글자 이상 ~  15글자 이하. 콘솔출력("등록불가합니다.");
		// 똑같은 글제목이 있으면 콘솔출력("이미 등록된 제목입니다.");
		
		System.out.print("제목을 입력 >> ");
		String title = scn.nextLine();
		System.out.print("내용을 입력 >> ");
		String content = scn.nextLine();
//		System.out.print("작성자를 입력 >> ");
//		String writer = scn.nextLine();
//		System.out.print("작성일시를 입력 >> ");
//		String writeDate = scn.nextLine();
		//배열의 빈공간에 등록.

			if(title.length() >= 5 && title.length() <= 15 ) {
				for (int i = 0; i < boardRepo.length; i++) {
					if (boardRepo[i] == null) {
						boardRepo[i] = new Board(title, content, loginId, new Date());
						System.out.println("등록불가합니다..");
						break; // 한건만 등록.
					} else if (boardRepo[i] != null && boardRepo[i].getTitle().equals(title)) {
						System.out.println("이미 등록된 제목입니다.");
						break;
					}
				}
			} 
			System.out.println("등록불가합니다.");
			return;
	}
	
	public static void removeBoard() {
		// 글삭제. 글제목을 입력 => 삭제 (삭제는 null 대입.)
		String title = scn.nextLine();
		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] != null && boardRepo[i].getTitle().equals(title)) { // 사용자가 입력한 값과 데이터에 값이 같은지 확인
				boardRepo[i] = null; // 값이 같으면 삭제.
				break;
			}
		}
	}
	
	public static void main(String[] args) {
//		MemberExe exe = new MemberExe(); // 인스턴스.
		
		while(true) {
		// id, password 일치하면 글목록기능 사용.
		System.out.println("아이디 입력>");
		String id = scn.nextLine();
		System.out.println("비밀번호 입력>");
		String pw = scn.nextLine();
		
		String name = MemberExe.login(id, pw);
		if(name != null) { 
			// 환영메세지!! "홍길동님, 환영합니다"
			loginId = id; // 여러메소드 공용사용.
			System.out.println(name + "님, 환영합니다.");
			break; // while 반복 종료.
		} else {
			System.out.println("아이디와 비번을 확인하세요.");
		}
	} // end of while.
		
		boolean run = true;
		try {
			initDate();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		while(run) {
			System.out.println("1.글목록 2.글등록 3.삭제 9.종료");
			System.out.println("선택 >> ");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1: // 목록
				boardList();
				break;
			case 2: // 등록
				addBoard();
				break;
			case 3: // 삭제
				removeBoard();
				break;
			case 9: // 종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				
				default: // 1,2,3,9 외의 경우.
					System.out.println("메뉴를 확인하세요.");
			}
		} // end of while.
		System.out.println("end of prog.");
	} // end of main.
	
}
