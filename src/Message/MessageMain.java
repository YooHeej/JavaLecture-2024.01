package Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MessageMain {

	public static void main(String[] args) {
		int id = 0;
		Scanner sc = new Scanner(System.in);
		List<Message> mList = new ArrayList<>();
		MessageServiceArrayImpl ms = new MessageServiceArrayImpl();
		boolean run = true;
		
		while(run) {
			System.out.println("1. 글쓰기  |  2. 목록  |  3. 글 찾기  |  4. 글 수정  |  5. 글 삭제  |  6. 종료");
			int chk = Integer.parseInt(sc.nextLine());
			
			if(chk == 1) {				//글 작성
				Message nMs = ms.insertMessage(id);
				id++;
				mList.add(nMs);
			}
			
			else if(chk == 2) {			//글 전체 목록
				ms.messageList(mList);
			}
			
			else if(chk == 3) {			//작성자로 글 찾기
				System.out.print("찾고자 하는 글의 작성자를 입력해 주세요 > ");
				String chkWriter = sc.nextLine();
				ms.messageListByWriter(chkWriter,mList);
			}
			
			else if(chk == 4) {			//글 수정
				System.out.print("수정하고자 하는 글의 작성자를 입력해 주세요 > ");
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
					System.out.print("몇 번째 글을 수정하시겠습니까? > ");
					int check = Integer.parseInt(sc.nextLine());
					nMessage = ms.updateMessage(mList.get(mIndexList.get(check-1)));
					mList.get(mIndexList.get(check-1)).setContent(nMessage.getContent());
				}
				else {								//작성글이 하나일 때
					nMessage = ms.updateMessage(mList.get(mIndexList.get(0)));
					mList.get(mIndexList.get(0)).setContent(nMessage.getContent());
				}
				
				System.out.println("수정이 완료되었습니다. ");
			}
			
			else if(chk == 5) {						//글 삭제
				int deleteIdx = ms.deleteMessage(mList);
				mList.remove(deleteIdx);
				System.out.println("삭제가 완료되었습니다. ");
			}
			else {
				System.out.println("종료되었습니다.");
				run = false;
			}
			
		}
		
	}

}
