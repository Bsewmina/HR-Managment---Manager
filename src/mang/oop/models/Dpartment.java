package mang.oop.models;

public class Dpartment {
	
	
	private int did;
	private String depTitle;
	private String description;
	private String location;
	private String depManagerID;

	//depatment's default constructor
	public Dpartment(int did, String depTitle, String description, String location, String depManagerID) {
	
		this.did = did;
		this.depTitle = depTitle;
		this.description = description;
		this.location = location;
		this.depManagerID = depManagerID;
	}
	
	
	//methods to get department data
	
	public int getDid() {
		return did;
	}
	
	public void setDid(int did) {
		this.did = did;
	}
	
	public String getDepTitle() {
		return depTitle;
	}
	
	public void setDepTitle(String depTitle) {
		this.depTitle = depTitle;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getDepManagerID() {
		return depManagerID;
	}
	
	public void setDepManagerID(String depManagerID) {
		this.depManagerID = depManagerID;
	}
	

}
