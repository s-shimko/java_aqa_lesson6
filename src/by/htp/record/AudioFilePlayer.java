package by.htp.record;

import java.util.Arrays;

import by.htp.record.genre.Genre;

public class AudioFilePlayer extends Audio {

	public String playerName;
	public Genre songs[];
	private int songCount;

	public AudioFilePlayer(String playerName) {
		this.playerName = playerName;
		System.out.println(playerName + " is ON");
	}

	public AudioFilePlayer(String playerName, int songCount) {
		this.playerName = playerName;
		songs = new Genre[songCount];
		System.out.println(playerName + " is ON");
	}

	public void play(Genre genre) {
		System.out.println("Now playing: " + genre.getArtist());
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Genre[] getSongs() {
		return songs;
	}

	public void setSongs(Genre[] songs) {
		this.songs = songs;
	}

	public int getSongCount() {
		return songCount;
	}

	public void setSongCount(int songCount) {
		this.songCount = songCount;
	}

	public void playAudioFile(Genre genre) {
		System.out.println(getPlayerName() + " playing: " + genre.getArtist() + " - " + genre.getSong() + " - "
				+ genre.getLength() + "min");
	}

	public void addSongToPlayer(Genre genre) {
		songs[songCount] = genre;
		songCount++;
		// System.out.println(Arrays.toString(songs));
	}

	public void countCommonSongLengthInAudioFilePlayer() {
		int commonLength = 0;
		for (int i = 0; i < songCount; i++) {
			commonLength = commonLength + songs[i].getLength();
		}
		System.out.println("Common song length in " + getPlayerName() + " is: " + commonLength + " Min");
	}

	public void findSongInRange(int lengthMin, int lengthMax) {
		int result = 0;
		System.out.println("Songs in range:");
		for (int i = 0; i < songCount; i++) {
			if (lengthMin <= songs[i].getLength() && lengthMax >= songs[i].getLength()) {
				System.out.println(songs[i].getSong());
				result ++;
			} 
		}
		if (result == 0) {
			 System.out.println("No songs in the range!");
		}
	}
	
	public String toString() {
		System.out.println("This is toString() redefine!");
		return this.playerName;
	}
	
	public boolean equals(int a) {
		System.out.println("This is equals() redefine!");
		return super.equals(a);
	}
}
