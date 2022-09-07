package interface_assignment;

public class SmartPhone extends Mobile implements Testable {
	private String networkGeneration;

	public SmartPhone(String name, String brand, String operatingSystemName, String operationgSystemVersion,
			String networkGeneration) {
		super(name, brand, operatingSystemName, operationgSystemVersion);
		this.networkGeneration = networkGeneration;
	}

	public String getNetworkGeneration() {
		return networkGeneration;
	}

	public void setNetworkGeneration(String networkGeneration) {
		this.networkGeneration = networkGeneration;
	}

	@Override
	public boolean testCompatibility() {
		if(getOperatingSystemName().equals("Saturn")) {
			
			if(getNetworkGeneration().equals("3G") && 
						(getOperationgSystemVersion().equals("1.1")||getOperationgSystemVersion().equals("1.2")|| 
								getOperationgSystemVersion().equals("1.2"))) {
					return true;
				}
				if(getNetworkGeneration().equals("4G") && (getOperationgSystemVersion().equals("1.2")||getOperationgSystemVersion().equals("1.3"))){
					return true;
				}
				if(getNetworkGeneration().equals("5G") && (getOperationgSystemVersion().equals("1.3"))){
					return true;
				}
			}
			if(getOperatingSystemName().equals("Gara")) {
				
				if(getNetworkGeneration().equals("3G") && 
						(getOperationgSystemVersion().equals("EXRT.1")||getOperationgSystemVersion().equals("EXRT.2")|| 
								getOperationgSystemVersion().equals("EXRU.1"))) {
					return true;
				}
				if(getNetworkGeneration().equals("4G") && (getOperationgSystemVersion().equals("EXRT.2")||getOperationgSystemVersion().equals("EXRU.1"))){
					return true;
				}
				if(getNetworkGeneration().equals("5G") && (getOperationgSystemVersion().equals("EXRU.1"))){
					return true;
				}
			}
			return false;
		}
	public void display(SmartPhone phone) {
		if(phone.testCompatibility()){
			
			System.out.println(phone.getOperatingSystemName()+ " is compatible with "+ phone.getNetworkGeneration());
		}
		else {

			System.out.println(phone.getOperatingSystemName()+ " is not compatible with "+ phone.getNetworkGeneration());

		}
	}
	}
