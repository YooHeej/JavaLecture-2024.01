package ch17_collection.qna.q7_list;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for (Board b: list)
				System.out.println(b);
	}

}
