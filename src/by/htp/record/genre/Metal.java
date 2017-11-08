package by.htp.record.genre;

public class Metal extends Genre {
	private int levelOfHeaviness;
	public static String genreName = "Metal";
	
	public Metal(String format, int length, int size, String artist, String song) {
		super(format, length, size, genreName, artist, song);
	}

	@Override
	public void checkFeelings() {
		super.checkFeelings();
		System.out.println("But too loud!");
	}
	
}