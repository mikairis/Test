
public class Person {
	private String surName;
	private String firstName;
	private String secondName;

	// constructor
	public Person(String surename, String fName, String sName) {
		this.surName = surename;
		this.firstName = fName;
		this.secondName = sName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	@Override
	public String toString() {
		String fullName = firstName;
		if (secondName != null) {
			fullName += " " + secondName;
		}
		fullName += " " + secondName;
		return (fullName);
	}

	public void show()
	{
		System.out.println(this);
	}
}
