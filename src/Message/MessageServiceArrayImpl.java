package Message;

import java.time.LocalDate;
import java.util.*;

public class MessageServiceArrayImpl implements MessageService {
	private static Message[] messageArray = new Message[10];
	private static Scanner sc = new Scanner(System.in);

	public MessageServiceArrayImpl() {
		LocalDate t = LocalDate.now();
		messageArray[0] = new Message(1000, "메세지 1번", "김찰일", t);
		messageArray[1] = new Message(1001, "메세지 2번", "김찰이", t);
		messageArray[2] = new Message(1002, "메세지 3번", "김찰삼", t);
		messageArray[3] = new Message(1003, "메세지 4번", "김찰사", t);
		messageArray[4] = new Message(1004, "메세지 5번", "김찰오", t);
	}

	@Override
	public Message findByMid(int mid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void messageList() {
		// TODO Auto-generated method stub

	}

	@Override
	public void messageListByWriter(String writer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertMessage(Message message) {
		System.out.println("");
		System.out.println("입력");
		System.out.println("");
		
		System.out.println("");
		String mid = sc.nextLine();
		System.out.println("");
		String writer = sc.nextLine();
		Message message = findMessage(mid);
		if (message == null) {
			System.out.println("메시지를 확인하세요.");
			return;
		}
		message.setContent(writer + message.getContent());
		System.out.println("");
		
		

	}

	private Message findMessage(String mid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMessage(Message message) {
		System.out.println("");
		System.out.println("수정");
		System.out.println("");
		
		System.out.println("");
		String mid = sc.nextLine();
		Message message = findMessage(mid);
		if (message == null) {
			System.out.println("메시지를 확인하세요.");
			return;
		}
		if (message.)
	}

	@Override
	public void deleteMessage(int mid) {
		// TODO Auto-generated method stub

	}

}
