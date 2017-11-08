package by.htp.record.genre;

public class Rock extends Genre {
	
	public static String genreName = "Rock";
	
	public Rock(String format, int length, int size, String artist, String song) {
		super(format, length, size, genreName, artist, song);
	}
	
	public void checkFeelings(Rock rock) {
		System.out.println(rock.getArtist() + " sounds softly!");
	}

	@Override
	public void checkFeelings() {
		super.checkFeelings();
	}

	
}
