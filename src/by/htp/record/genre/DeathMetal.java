package by.htp.record.genre;

public class DeathMetal extends Metal{

	static public String subGenre = "DeathMetal";
	private String growl;
	
	public DeathMetal(String format, int length, int size, String artist, String song) {
		super(format, length, size, artist, song);
	}

	public static String getSubGenre() {
		return subGenre;
	}

	public static void setSubGenre(String subGenre) {
		DeathMetal.subGenre = subGenre;
	}

	

}
