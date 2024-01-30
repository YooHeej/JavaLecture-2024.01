package Message;

import java.time.LocalDate;

public class Message {
	private int mid;			//작성번호?
	private String content;		//내용
	private String writer;		//작성자
	private LocalDate genTime;	//작성 시간

	
	


	public int getMid() {
		return mid;
	}


	public void setMid(int mid) {
		this.mid = mid;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public LocalDate getGenTime() {
		return genTime;
	}


	public void setGenTime(LocalDate genTime) {
		this.genTime = genTime;
	}
}
