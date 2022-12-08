package initFrame;

public class EntryData {
	
	private String firstName;
	private String lastName;
	private String age;
	boolean needHelp;
	private String locationData;
	private String additionalInfoData;

	public EntryData(String first_name, String last_name, String age_num, boolean need_help, String location_data, String additional_data)
	{
		firstName = first_name;
		lastName = last_name;
		age = age_num;
		needHelp = need_help;
		locationData = location_data;
		additionalInfoData = additional_data;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getAge() {
		return age;
	}
	
	public boolean getNeedHelp() {
		return needHelp;
	}
	
	public String getLocationData() {
		return locationData;
	}
	
	public String getAdditionalInfoData() {
		return additionalInfoData;
	}
	
	public boolean entryIsEmpty()
	{
		if(firstName.isBlank() && lastName.isBlank() && age.isBlank() && locationData.isBlank() && additionalInfoData.isBlank())
		{
			return true;
		}
		
		return false;
	}
	
	
	
	

}
