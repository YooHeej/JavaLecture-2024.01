package mysql.sec07_bbs.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import mysql.sec07_bbs.entity.Board;


public class BoardDao {
	private String connStr;
	private String user;
	private String password;
	private Connection conn;
	
	public BoardDao() {
		String path = "C:/Workspace/Java/Lesson/src/mysql/mysql.properties";
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream(path));
			
			String host = prop.getProperty("host");
			String port = prop.getProperty("port");
			String database = prop.getProperty("database");
			this.connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			this.user = prop.getProperty("user");
			this.password = prop.getProperty("password");
			this.conn = DriverManager.getConnection(connStr, user, password);
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void close() {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public Board getBoard(int bid) {
			String sql = "select * from board where bid=?";
			Board board = null;
			try {
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, bid);
				
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					board = new Board(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							LocalDateTime.parse(rs.getString(5)), rs.getInt(6),
							rs.getInt(7), rs.getInt(8));
				}
				rs.close(); pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return board;
		}
		// field 값은 title, content, uid 등 attribute name
		// query 값은 검색어
		public List<Board> getBoardList(String field, String query, int num, int offset) {
			String sql = "select * from board where isDeleted=0" 
						+ " title ? uid limit ? offset ?";
			return null;
		}
		
		public void insertBoard(Board board) {
			
		}
		
		public void updateBoard(Board board) {
			
		}
		
		public void deleteBoard(int bid) {
			
		}
		
		// field 값은 view 또는 reply
		public void increaseCount(String field, int bid) {
			
		}
		
}