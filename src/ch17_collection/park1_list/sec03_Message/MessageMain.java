package ch17_collection.park1_list.sec03_Message;

import java.util.List;
import java.util.Scanner;

public class MessageMain {
	private static MessageService messageService = new MessageServiceListImpl();
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		List<Message> list = null;
		String writer = null, content = null;
		Message message = null;
		int mid = 0;
		boolean run = true;
		
		while (run) {
			System.out.println("+=============+=================+==========+==========+==========+========+");
			System.out.println("| 1. 전체목록 | 2.Writer별 목록 | 3.글쓰기 | 4.글수정 | 5.글삭제 | 6.종료 |");
			System.out.println("+=============+=================+==========+==========+==========+========+");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1:
					list = messageService.getMessageListAll();
					list.forEach(x -> System.out.println(x));
					System.out.println();
					break;
			case 2:
					System.out.println("------------");
					System.out.println("Writer별 목록");
					System.out.println("------------");
					System.out.println("Writer 이름> ");
					writer = scan.nextLine();
					list = messageService.getMessageListByWriter(writer);
					list.forEach(x -> System.out.println(x));
					System.out.println();
					break;
			case 3:
					System.out.println("------------");
					System.out.println(" 메세지 쓰기");
					System.out.println("------------");
					System.out.println("Writer 이름> ");
					writer = scan.nextLine();
					System.out.println("메세지 내용> ");
					content = scan.nextLine();
					message = new Message(content, writer);
					messageService.insertMessage(message);
					break;
			case 4: 
					System.out.println("------------");
					System.out.println(" 메세지 수정");
					System.out.println("------------");
					System.out.println("메세지 ID> ");
					mid = Integer.parseInt(scan.nextLine());
					message = messageService.findByMid(mid);
					System.out.println("Writer 이름(" + message.getWriter() + ")> ");
					writer = scan.nextLine();
					System.out.println("메세지 내용(" + message.getContent() + ")> ");
					content = scan.nextLine();
					message.setWriter(writer);
					message.setContent(content);
					messageService.updateMessage(message);
					break;
			case 5:
					System.out.println("-----------");
					System.out.println(" 메세지 삭제");
					System.out.println("-----------");
					System.out.println("메세지 ID> ");
					mid = Integer.parseInt(scan.nextLine());
					break;
			case 6: 
					run = false;
					break;
			default:
				System.out.println("Warning: 1 ~ 6 사이의 숫자만 입력하세요.");
				
			}
			
		}
		System.out.println("프로그램 종료");
		scan.close();

	}

}
