package Message;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MessageServiceArrayImpl implements MessageService {
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public Message findByMid(List<Message> mList) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void messageList(List<Message> mList) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < mList.size() ; i++) {
			System.out.println("작성자 :\t" + mList.get(i).getWriter());
			System.out.println("내용 :\t" + mList.get(i).getContent());
			System.out.println("작성 시간 :\t" + mList.get(i).getGenTime());
		}
	}
	@Override
	public void messageListByWriter(String writer, List<Message> mList) {
		// TODO Auto-generated method stub
		int chkWriter = 0;		//작성자 확인용 변수
		
		for(int i = 0 ; i < mList.size() ; i++) {
			if(mList.get(i).getWriter().equals(writer)) {
				System.out.println("작성자 :\t" + mList.get(i).getWriter());
				System.out.println("내용 :\t" + mList.get(i).getContent());
				System.out.println("작성 시간 :\t" + mList.get(i).getGenTime());
				chkWriter++;
			}
		}
		
		if(chkWriter == 0) {
			System.out.println("찾고자 하는 작성자가 존재하지 않습니다. 다시 확인 부탁드립니다. ");
		}
		
		
	}
	@Override
	public Message insertMessage(int id) {
		// TODO Auto-generated method stub
		Message ms = new Message();
		
		System.out.print("작성자를 입력해 주세요 >  ");
		String nWriter = sc.nextLine();
		System.out.print("내용를 입력해 주세요 >  ");
		String nContent = sc.nextLine();
		LocalDate nLd = LocalDate.now();
		
		ms.setMid(id);
		ms.setWriter(nWriter);
		ms.setContent(nContent);
		ms.setGenTime(nLd);
		
		return ms;
	}
	@Override
	public Message updateMessage(Message message) {
		// TODO Auto-generated method stub
		System.out.println("수정하고자 하는 글 내용을 작성해 주세요. ");
		String nContent = sc.nextLine();
		message.setContent(nContent);
		return message;
	}
	@Override
	public int deleteMessage(List<Message> mList) { //글 삭제 
		// TODO Auto-generated method stub			//리스트의 인덱스 값 리턴 해서 메인에서 글 삭제
		System.out.print("삭제하고자 하는 글의 작성자를 입력해 주세요 > ");
		String chkWirter = sc.nextLine();
		List<Integer> mIndexList = new ArrayList<>();
		int chkIndex = 1;
		Message nMessage = new Message();
		
		System.out.println("해당 작성자의 작성 목록을 출력하겠습니다 . ");
		
		for(int i = 0 ; i < mList.size() ; i++) {
			if(mList.get(i).getWriter().equals(chkWirter)) {
				System.out.println("\t" + chkIndex +"번째 글 ");
				System.out.println("작성자 :\t" + mList.get(i).getWriter());
				System.out.println("내용 :\t" + mList.get(i).getContent());
				System.out.println("작성 시간 :\t" + mList.get(i).getGenTime());
				mIndexList.add(i);
				chkIndex++;
			}
		}
		if(mIndexList.size() > 1) {			//작성글이 여러개일 때
			System.out.print("몇 번째 글을 삭제하시겠습니까? > ");
			int check = Integer.parseInt(sc.nextLine());
			
			return mIndexList.get(check-1);
		}
		else {								//작성글이 하나일 때
			
			return mIndexList.get(0);
		}
	}

	

}
