package by.htp.record;

import by.htp.record.genre.Genre;

public class CdRecorder extends Audio {

	private int recordSpeed = 0;
	private int recordCount = 0;
	private Genre[] recordings;
	private String[] recordedList;
	

	public CdRecorder(int recordSpeed, int numberOfRecords) {
		this.recordSpeed = recordSpeed;
		recordings = new Genre[numberOfRecords];
	}
	
	public String[] getRecordedList() {
		return recordedList;
	}

	public Genre[] getRecordings() {
		return recordings;
	}

	public int getRecordSpeed() {
		return recordSpeed;
	}

	public void setRecordSpeed(int recordSpeed) {
		this.recordSpeed = recordSpeed;
	}

	public int getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public void addToRecordList(Genre genre) {
		recordings[recordCount] = genre;
		recordCount++;
	}

	public String[] startRecord(Genre[] recordList, int numberOfRecords) throws Exception {
		recordedList = new String[numberOfRecords];
		if (recordSpeed == 0) {
			System.out.println("Can't start record. Create CD Recorder with recorf speed > 0.");
		} else {
			System.out.println("Start recording:");
			for (int i = 0; i < recordList.length; i++) {
				recordedList[i] = (i + 1) + ". " + recordList[i].getArtist() + " " + recordList[i].getSong();
				System.out.print(".");
				Thread.sleep(recordSpeed);
			}
		}
		return recordedList;
	}

}
