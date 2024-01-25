package ch12_interface.sec21_message;

import java.util.Scanner;

public class MessageMain {
	private static MessageService messageService = new MessageServiceArrayImpl();
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String writer = null, content = null;
		Message message = null;
		int mid = 0;
		boolean run = true;
		
		while (run) {
			System.out.println("");
			System.out.println("| 1. 전체 목록 | 2. Writer별 목록 | 3. 글 쓰기 | 4. 글 수정 | 5. 글 삭제 | 6. 종료 |");
			System.out.println("");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1:
					messageService.messageList();
					break;
			case 2:
				System.out.println("");
				System.out.println("Writer별 목록");
				System.out.println("");
				System.out.println("Writer 이름");
				writer = scan.nextLine();
				messageService.messageListByWriter(writer);
				break;
			}
		}
	}

}
