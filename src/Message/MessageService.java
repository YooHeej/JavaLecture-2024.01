package Message;

import java.util.List;

public interface MessageService {
	int DELETED = 1;

	Message findByMid(List<Message> mList);

	void messageList(List<Message> mList);

	void messageListByWriter(String writer, List<Message> mList);

	Message insertMessage(int id);

	Message updateMessage(Message message);

	int deleteMessage(List<Message> mList);
}
