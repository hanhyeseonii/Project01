package dto;

public class iso {
	private String code;
	private String name;

	public iso() {
		super();
		
	}

	public iso(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "iso [code=" + code + ", name=" + name + "]";
	}
}	