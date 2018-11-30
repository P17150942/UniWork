package lib;

public class Module {
	//fields
	private String code;
	private String name;
	private int examWeight;
	private int cwkWeight;
	
	//constructors
	public Module() {
		this.code = "";
		this.name = "";
		this.examWeight = 0;
		this.cwkWeight = 0;
	}
	
	public Module(String code, String name, int examWeight, int cwkWeight) {
		this.code = code;
		this.name = name;
		this.examWeight = examWeight;
		this.cwkWeight = cwkWeight;
	}
	
	public Module(String code, String name) {
		this.code = code;
		this.name = name;
		this.examWeight = 50;
		this.cwkWeight = 50;
	}
	
	public Module(String code, String name, int examWeight) {
		this.code = code;
		this.name = name;
		this.examWeight = examWeight;
		this.cwkWeight = 100-examWeight;
	}
	
	//Methods
	
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public int getExamWeight() {
		return examWeight;
	}
	
	public int getCwkWeight() {
		return cwkWeight;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setExamWeight(int examWeight) {
		this.examWeight = examWeight;
	}
	
	public void setCwkWeight(int cwkWeight) {
		this.cwkWeight = cwkWeight;
	}
	
	public String toString() {
		return "Module:[code =" + code +
				" name =" + name +
				" examWeight =" + examWeight +
				" cwkWeight =" + cwkWeight + "]";
	}
	
	public boolean equals(Object obj) {
		if (this.getClass() != obj.getClass() || obj == null) {
			return false;
		}
		
		Module object = (Module) obj;
		
		return this.code == object.code && 
				this.name == object.name &&
				this.examWeight == object.examWeight &&
				this.cwkWeight == object.cwkWeight;
	}

}
