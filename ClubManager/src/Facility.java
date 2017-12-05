
public class Facility {
	private String name;
	private String description;
	
	public Facility(String nm, String desc) {
		this.name = nm;
		this.description = desc;
	}
	
	public Facility(String nm) {
		this (nm, null);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		String fullName = name;
		if (description != null) {
			fullName += "(" + description + ")";
		}
		return fullName;
	}

	public void show() {
		System.out.println(this);
	}
}