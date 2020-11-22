package day4.exam5;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	public Song() {
		this("i can't stop", "Ʈ���̽�", "�̹��ٹ�", "������", 2020,1);
		System.out.println("song ����");
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
		System.out.printf("%s %s ( %s, %d, %d�� track, %s �۰�)", artist, title, getAlbum(), getYear(), getTrack(),
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
//		song.setArtist("������");
//		song.setTitle("������");
//		song.setAlbum("Real");
//		song.setYear(2010);
//		song.setTrack(3);
//		song.setComposer("�̹μ�");
//		song.show();
//	}

}
