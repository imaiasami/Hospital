package com.example.vo;

public class Reservation {
	private long seq_res;
	private int seq_pat;
	private int seq_doc;
	private String time;
	
	
	public Reservation () {
	}

	public Reservation(int seq_pat, int seq_doc, String time) {
		this.seq_pat = seq_pat;
		this.seq_doc = seq_doc;
		this.time = time;
	}
	public Reservation(int seq_doc, String time) {
		this.seq_doc = seq_doc;
		this.time = time;
	}
	
	public long getSeq_res() {
		return seq_res;
	}
	public void setSeq_res(long seq_res) {
		this.seq_res = seq_res;
	}
	public int getSeq_pat() {
		return seq_pat;
	}
	public void setSeq_pat(int seq_pat) {
		this.seq_pat = seq_pat;
	}
	public int getSeq_doc() {
		return seq_doc;
	}
	public void setSeq_doc(int seq_doc) {
		this.seq_doc = seq_doc;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "Reservation [seq_res=" + seq_res + ", seq_pat=" + seq_pat + ", seq_doc=" + seq_doc + ", time=" + time
				+ "]";
	}


}