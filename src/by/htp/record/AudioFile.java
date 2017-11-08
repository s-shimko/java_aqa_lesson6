package by.htp.record;

public class AudioFile extends Audio{
	private String format;
	private int length;
	private int size;
	
	public AudioFile(String format, int length, int size) {
		this.format = format;
		this.length = length;
		this.size = size;
	}
	
	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
