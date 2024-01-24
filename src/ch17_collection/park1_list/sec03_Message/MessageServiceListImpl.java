package ch17_collection.park1_list.sec03_Message;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MessageServiceListImpl implements MessageService {
	List<Message> list = new ArrayList<>();
	
	
	public MessageServiceListImpl() {
	Message message = new Message(1, "자바 세계에 오신걸 환영합니다.", "제임스", LocalDateTime.now(),0);
	list.add(new Message(2, "안녕하세요? 반갑습니다.", "마리아", LocalDateTime.now(),0));
	list.add(new Message(3, "좋은 하루 되세요.", "브라이언", LocalDateTime.now(),0));
	list.add(new Message(4, "휴먼교육센터에서 강의를 들어보세요.", "엠마", LocalDateTime.now(),0));
	list.add(new Message(5, "스프링부트도 함께 배워요.", "찰리", LocalDateTime.now(),0));
	
	
	}
	
	
	@Override
	public Message findByMid(int mid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> getMessageListAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> getMessageListByWriter(String writer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertMessage(Message message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMessage(Message message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMessage(Message message) {
		// TODO Auto-generated method stub
		
	}

}
