package day4.exam5;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	public Song() {
		this("i can't stop", "트와이스", "이번앨범", "박진영", 2020,1);
		System.out.println("song 생성");
	}

	public Song(String title,
			String artist,
			String album,
			String composer,
			int year,
			int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public void show() {
		System.out.printf("%s %s ( %s, %d, %d번 track, %s 작곡)", artist, title, getAlbum(), getYear(), getTrack(),
				getComposer());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

//	public static void main(String[] args) {
//		Song song = new Song();
//		song.setArtist("아이유");
//		song.setTitle("좋은날");
//		song.setAlbum("Real");
//		song.setYear(2010);
//		song.setTrack(3);
//		song.setComposer("이민수");
//		song.show();
//	}

}
