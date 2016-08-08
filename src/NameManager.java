//version 7d
public class NameManager {

	private static String fullName;

	public void setName(String newName) {
		fullName = newName;
	}
	
	public String getFirstName() {
		int spacePosition = fullName.indexOf(" ");
		return fullName.substring(0,spacePosition);
	}
	
	public String getSurname() {
		int spacePosition = fullName.indexOf(" ");
		return fullName.substring(spacePosition+1);
	}
	
	
}



