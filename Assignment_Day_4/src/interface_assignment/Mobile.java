package interface_assignment;

public class Mobile {

	private String name;
	private String brand;
	private String operatingSystemName;
	private String operationgSystemVersion;
	public Mobile(String name, String brand, String operatingSystemName, String operationgSystemVersion) {
		super();
		this.name = name;
		this.brand = brand;
		this.operatingSystemName = operatingSystemName;
		this.operationgSystemVersion = operationgSystemVersion;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOperatingSystemName() {
		return operatingSystemName;
	}
	public void setOperatingSystemName(String operatingSystemName) {
		this.operatingSystemName = operatingSystemName;
	}
	public String getOperationgSystemVersion() {
		return operationgSystemVersion;
	}
	public void setOperationgSystemVersion(String operationgSystemVersion) {
		this.operationgSystemVersion = operationgSystemVersion;
	}
	
	
}
