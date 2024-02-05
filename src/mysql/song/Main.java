package mysql.song;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		SongDao songDao = new SongDao();
		
		Song song = songDao.getSongBySid(101);
		System.out.println(song);
		
		List<Song> list = songDao.getSongListAll();
		
//		list = songDao.getSongListAll();
		list.forEach(x -> System.out.println(x));
	}

}
