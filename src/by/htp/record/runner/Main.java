package by.htp.record.runner;
/*
Звукозапись. Определить иерархию музыкальных композиций. Записать 
на  диск сборку. Подсчитать продолжительность. Провести перестановку 
композиций диска на основе принадлежности к стилю. Найти композицию, 
соответствующую заданному диапазону длины треков.

.wav: an uncompressed format used on CDs etc. Audio quality is high, but files are very large.

.mp3: the commonest compressed format, used for most downloads and on digital media players.

.aac: a compressed format used mostly on Apple devices. It was designed to be the successor to mp3, but has never really caught on.

.flac: a lossless compressed format that allows exact restoration of the original.
Genre(String format, int length, int size, String genreName, String artist, String song)
 */

import java.util.Arrays;

import by.htp.record.Audio;
import by.htp.record.AudioFile;
import by.htp.record.AudioFilePlayer;
import by.htp.record.CdRecorder;
import by.htp.record.RecordedCd;
import by.htp.record.genre.BlackMetal;
import by.htp.record.genre.Genre;
import by.htp.record.genre.Metal;
import by.htp.record.genre.Rock;

public class Main {

	public static void main(String[] args) throws Exception {
		Genre metallica = new Genre("mp3", 3, 10, "Metal", "Metallica", "One");
		Genre slayer = new Metal("flac", 3, 10, "Slayer", "War");
		Genre muse = new Rock("mp3", 7, 20, "Muse", "New Born");
		Genre nirvana = new Rock("mp3", 7, 20, "Nirvana", "Lithium");
		Genre mayhem = new BlackMetal("wav", 7, 20, "Mayem", "Hammer");
		
		AudioFilePlayer winamp = new AudioFilePlayer("Winamp", 4);
		
		winamp.playAudioFile(metallica);
		winamp.playAudioFile(muse);
		winamp.playAudioFile(slayer);
		winamp.playAudioFile(nirvana);
		
		winamp.addSongToPlayer(metallica);
		winamp.countCommonSongLengthInAudioFilePlayer();
		
		Metal megadeth = new Metal("mp3", 2, 5, "Megadeth", "Killing is my business");
		
		AudioFilePlayer aimp = new AudioFilePlayer("AIMP", 4);
		
		aimp.addSongToPlayer(metallica);
		aimp.addSongToPlayer(slayer);
		aimp.addSongToPlayer(muse);
		aimp.addSongToPlayer(nirvana);
		
		aimp.countCommonSongLengthInAudioFilePlayer();
	
		metallica.checkFeelings();
		megadeth.checkFeelings();
		
		aimp.findSongInRange(3, 6);
		
		System.out.println(aimp);
		
		Object o = new Object();
		
		System.out.println(aimp.equals(12));
		
		System.out.println("");
		System.out.println("Now we're record the disk");
		
		CdRecorder recorder = new CdRecorder(500, 5);
		recorder.addToRecordList(metallica);
		recorder.addToRecordList(muse);
		recorder.addToRecordList(slayer);
		recorder.addToRecordList(nirvana);
		recorder.addToRecordList(mayhem);
	
		String[] recordedList = recorder.startRecord(recorder.getRecordings(), 5);
		System.out.println();
		System.out.println("Record finished: " + Arrays.toString(recordedList));
		
		RecordedCd cd1 = new RecordedCd("For Friend", 500, 5);
		cd1.playCd(recorder);
		
	}

}
