package mysql.sec05_message;

import java.util.List;

public class MessageTest {

	public static void main(String[] args) {
		MessageDao msgDao = new MessageDao();
		
		Message msg = msgDao.getMessageByMid(102);
		System.out.println(msg);

//		msg = new Message("집에 가고 싶어.", "브라이언");
//		msgDao.insertMessage(msg);
		
//		msg = msgDao.getMessageByMid(107);
//		msg.setContent("MessageDao 프로그램을 완성하자.");
//		msgDao.updateMessage(msg);
		
//		msgDao.deleteMessage(106);
		
		List<Message> list = msgDao.getMessageListByWriter("브라이언");
		list.forEach(x -> System.out.println(x));
		
		msgDao.close();
	}

}
