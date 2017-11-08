package by.htp.record.genre;

public class BlackMetal extends Metal {
	static public String subGenre = "BlackMetal";
	
	public BlackMetal(String format, int length, int size, String artist, String song) {
		super(format, length, size, artist, song);
	}


	
//	public BlackMetal(String format, int length, int size, String artist, String song) {
//		super(format, length, size, subGenre, artist, song);
//	}

	public static String getSubGenre() {
		return subGenre;
	}

	public static void setSubGenre(String subGenre) {
		BlackMetal.subGenre = subGenre;
	}


}
