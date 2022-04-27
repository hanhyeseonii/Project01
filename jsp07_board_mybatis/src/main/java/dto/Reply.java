package dto;

import java.util.Date;

public class Reply {
	private int rnum;
	private int bnum;
	private int restep;
	private int relevel;
	private String content;
	private Date regidate;
	
	public Reply() {
		super();
	}
	public Reply(int rnum, int bnum, int restep, int relevel, String content, Date regidate) {
		super();
		this.rnum = rnum;
		this.bnum = bnum;
		this.restep = restep;
		this.relevel = relevel;
		this.content = content;
		this.regidate = regidate;
	}
	public int getRnum() {
		return rnum;
	}
	public int getBnum() {
		return bnum;
	}
	public int getRestep() {
		return restep;
	}
	public int getRelevel() {
		return relevel;
	}
	public String getContent() {
		return content;
	}
	public Date getRegidate() {
		return regidate; 
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	public void setRestep(int restep) {
		this.restep = restep;
	}
	public void setRelevel(int relevel) {
		this.relevel = relevel;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setRegidate(Date regidate) {
		this.regidate = regidate;
	}
	@Override
	public String toString() {
		return "Reply [rnum=" + rnum + ", bnum=" + bnum + ", restep=" + restep + ", relevel=" + relevel + ", content="
				+ content + ", regidate=" + regidate + "]";
	}
	
}
