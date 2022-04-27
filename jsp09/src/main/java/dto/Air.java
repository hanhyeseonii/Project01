package dto;

import java.util.Date;

public class Air {
	private int sn;
	private String moveName;
	private String districtName;
	private Date dataDate;
	private String issueGbn;
	private int issueVal;
	private String issueTime;
	private Date clearDate;
	private String clearTime;
	private int clearVal;
	
	public Air() {
		super();
	}

	public Air(int sn, String moveName, String districtName, Date dataDate, String issueGbn, int issueVal,
			String issueTime, Date clearDate, String clearTime, int clearVal) {
		super();
		this.sn = sn;
		this.moveName = moveName;
		this.districtName = districtName;
		this.dataDate = dataDate;
		this.issueGbn = issueGbn;
		this.issueVal = issueVal;
		this.issueTime = issueTime;
		this.clearDate = clearDate;
		this.clearTime = clearTime;
		this.clearVal = clearVal;
	}

	public int getSn() {
		return sn;
	}

	public String getMoveName() {
		return moveName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public Date getDataDate() {
		return dataDate;
	}

	public String getIssueGbn() {
		return issueGbn;
	}

	public int getIssueVal() {
		return issueVal;
	}

	public String getIssueTime() {
		return issueTime;
	}

	public Date getClearDate() {
		return clearDate;
	}

	public String getClearTime() {
		return clearTime;
	}

	public int getClearVal() {
		return clearVal;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public void setMoveName(String moveName) {
		this.moveName = moveName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public void setDataDate(Date dataDate) {
		this.dataDate = dataDate;
	}

	public void setIssueGbn(String issueGbn) {
		this.issueGbn = issueGbn;
	}

	public void setIssueVal(int issueVal) {
		this.issueVal = issueVal;
	}

	public void setIssueTime(String issueTime) {
		this.issueTime = issueTime;
	}

	public void setClearDate(Date clearDate) {
		this.clearDate = clearDate;
	}

	public void setClearTime(String clearTime) {
		this.clearTime = clearTime;
	}

	public void setClearVal(int clearVal) {
		this.clearVal = clearVal;
	}

	@Override
	public String toString() {
		return "Air [sn=" + sn + ", moveName=" + moveName + ", districtName=" + districtName + ", dataDate=" + dataDate
				+ ", issueGbn=" + issueGbn + ", issueVal=" + issueVal + ", issueTime=" + issueTime + ", clearDate="
				+ clearDate + ", clearTime=" + clearTime + ", clearVal=" + clearVal + "]";
	}
	
}
