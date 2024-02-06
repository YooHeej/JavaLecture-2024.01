package mysql.sec03_song;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		SongDao songDao = new SongDao();
		
		Song song = songDao.getSongBySid(101);
		System.out.println(song);
		
		song = songDao.getSongByTitle("별빛");
		System.out.println(song);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
//		song = new Song("Hypeboy", "하 하 하 하입보이");
//		songDao.insertSong(song);
		song = songDao.getSongBySid(122);
		song.setTitle("Hype boy");
		song.setLyrics(" 너 없이는 매일 매일이 yeah 재미없어 어쩌지");
		songDao.updateSong(song);
		
		songDao.deleteSong(123);
		songDao.deleteSong(124);
		
		List<Song> list = songDao.getSongListAll();
		list.forEach(x -> System.out.println(x));
		
		songDao.close();
	}

}
