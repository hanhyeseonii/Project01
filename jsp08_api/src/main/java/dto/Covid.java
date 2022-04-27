package dto;

public class Covid {
	private int seq;
	private String stateDt;
	private	String stateTime;
	private String decideCnt; //누적확진자수
	private int dailydecideCnt; //일일확진자수
	private int deathCnt;
	private String createDt;
	private String updateDt;
	
	public Covid() {
		super();
	}
	public Covid(int seq, String stateDt, String stateTime, String decideCnt, int dailydecideCnt, int deathCnt,
			String createDt, String updateDt) {
		super();
		this.seq = seq;
		this.stateDt = stateDt;
		this.stateTime = stateTime;
		this.decideCnt = decideCnt;
		this.dailydecideCnt = dailydecideCnt;
		this.deathCnt = deathCnt;
		this.createDt = createDt;
		this.updateDt = updateDt;
	}
	public int getSeq() {
		return seq;
	}
	public String getStateDt() {
		return stateDt;
	}
	public String getStateTime() {
		return stateTime;
	}
	public String getDecideCnt() {
		return decideCnt;
	}
	public int getDailydecideCnt() {
		return dailydecideCnt;
	}
	public int getDeathCnt() {
		return deathCnt;
	}
	public String getCreateDt() {
		return createDt;
	}
	public String getUpdateDt() {
		return updateDt;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public void setStateDt(String stateDt) {
		this.stateDt = stateDt;
	}
	public void setStateTime(String stateTime) {
		this.stateTime = stateTime;
	}
	public void setDecideCnt(String decideCnt) {
		this.decideCnt = decideCnt;
	}
	public void setDailydecideCnt(int dailydecideCnt) {
		this.dailydecideCnt = dailydecideCnt;
	}
	public void setDeathCnt(int deathCnt) {
		this.deathCnt = deathCnt;
	}
	public void setCreateDt(String createDt) {
		this.createDt = createDt;
	}
	public void setUpdateDt(String updateDt) {
		this.updateDt = updateDt;
	}
	@Override
	public String toString() {
		return "Covid [seq=" + seq + ", stateDt=" + stateDt + ", stateTime=" + stateTime + ", decideCnt=" + decideCnt
				+ ", dailydecideCnt=" + dailydecideCnt + ", deathCnt=" + deathCnt + ", createDt=" + createDt
				+ ", updateDt=" + updateDt + "]";
	}
	
}
	