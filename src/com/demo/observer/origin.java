package com.demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 성적을 출력하는 프로그램
 * @author hsoo3
 * @date 20181017
 */
public class origin {
	public static class ScoreRecord {
		private List<Integer> scores = new ArrayList<Integer>();
		private DataSheetView dataSheetView;
		
		public void setDataSheetView(DataSheetView dataSheetView) {
			this.dataSheetView = dataSheetView;
		}
		
		public void addScore(int score) {
			scores.add(score);
			dataSheetView.update();
		}
		
		public List<Integer> getScoreRecord() {
			return scores;
		}
	}
	
	public static class DataSheetView {
		private ScoreRecord scoreRecord;
		private int viewCount;
		
		public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
			this.scoreRecord = scoreRecord;
			this.viewCount = viewCount;
		}
		
		public void update() {
			List<Integer> record = scoreRecord.getScoreRecord();
			displayScores(record, viewCount);
		}

		private void displayScores(List<Integer> record, int viewCount) {
			System.out.println("List of "+viewCount+" entries: ");
			record.subList(0, Math.min(viewCount, record.size())).forEach(System.out::println);
			System.out.println();
		}
	}
	
	public static class Client {
		public static void main (String[] args) {
			ScoreRecord scoreRecord = new ScoreRecord();
			DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);
			scoreRecord.setDataSheetView(dataSheetView);
			
			for (int i=1; i< 5; i++) {
				int score = i * 10;
				System.out.println("Adding: "+score);
				scoreRecord.addScore(score);
			}
		}
	}
}
