package ch17_collection.qna.q7_list;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Board> list = new ArrayList<>();
	
	public BoardDao() {
		this.list.add(new Board("제목 1", "내용 1"));
		this.list.add(new Board("제목 2", "내용 2"));
		this.list.add(new Board("제목 3", "내용 3"));
	}

	public List<Board> getBoardList() {
		return list;
	}
}
