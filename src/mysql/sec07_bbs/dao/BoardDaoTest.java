package mysql.sec07_bbs.dao;

import java.util.List;

import mysql.sec07_bbs.entity.Board;

public class BoardDaoTest {

	public static void main(String[] args) {
		BoardDao bDao = new BoardDao();
		String sessionUid = "james";			// james가 로그인 한 것으로 가정
		
		Board b = bDao.getBoard(12);
		if  (!b.getUid().equals(sessionUid))		// james가 작성한 글이 아니면 
			bDao.increaseCount("view", 12);
		System.out.println(b);
		
//		b = new Board("제목 12", "본문 12", "james");
//		bDao.insertBoard(b);
//		
//		b = new Board("제목 13", "본문 13", "james");
//		bDao.insertBoard(b);
//		
//		b = new Board("제목 14", "본문 14", "maria");
//		bDao.insertBoard(b);
//		
//		b = new Board("제목 15", "본문 15", "sarah");
//		bDao.insertBoard(b);
//		
//		b = new Board("제목 16", "본문 16", "brian");
//		bDao.insertBoard(b);

		List<Board> list = bDao.getBoardList("title", "%", 10, 0);
		list.forEach(x -> System.out.println(x.listForm()));
//		System.out.println("==============================================");
//		list = bDao.getBoardList("b.uid", "james", 10, 0);
//		list.forEach(x -> System.out.println(x.listForm()));
//		System.out.println("==============================================");
//		list = bDao.getBoardList("uname", "마리아", 10, 0);
//		list.forEach(x -> System.out.println(x.listForm()));
		
		
	}

}
