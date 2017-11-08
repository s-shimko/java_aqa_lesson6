package by.htp.record.genre;

import by.htp.record.AudioFile;

public class Genre extends AudioFile {

	private String genreName;
	private String artist;
	private String song;
	
	public Genre(String format, int length, int size, String genreName, String artist, String song) {
		super(format, length, size);
		this.genreName = genreName;
		this.artist = artist;
		this.song = song;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}
	
	public void checkFeelings() {
		System.out.println(getArtist() + " sounds good!");
	}
}
