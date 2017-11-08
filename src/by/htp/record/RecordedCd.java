package by.htp.record;

import java.util.Iterator;

public class RecordedCd extends CdRecorder {
	
	private String cdName;
	
	public RecordedCd(String cdName, int recordSpeed, int numberOfRecords) {
		super(recordSpeed, numberOfRecords);
		this.cdName = cdName;
	}

	public void playCd (CdRecorder recordedList) {
		System.out.println("Playing CD with name " + cdName + ". Playlist:");
		for ( String i : recordedList.getRecordedList()) {
			System.out.println(i);
		}
		System.out.println("CD info:");
		System.out.println("Record speed is " + getRecordSpeed() + "mS, number of records is " +  getRecordings().length);
	}
}
