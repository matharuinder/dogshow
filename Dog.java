package ca.sheridancollege.Beans;

public class Dog {
	
	private String name;
	
	private String ownerName;
	
	private String breed;
	
	private String group;
	
	private String gender;
	
	private String type;
	
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Dog(String name, String ownerName, String breed, String group, String gender, String type) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.breed = breed;
		this.group = group;
		this.gender = gender;
		this.type = type;
	}

	public Dog() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", ownerName=" + ownerName + ", breed=" + breed + ", group=" + group + ", gender="
				+ gender + ", type=" + type + ", id=" + id + "]";
	}

	
	
	

}
