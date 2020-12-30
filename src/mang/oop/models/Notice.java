package mang.oop.models;

public class Notice {

	private String id;
	private String title;
	private String content;
	
	//notice default constructor
	public Notice(String nid, String title,String content) {
		this.id = nid;
		this.title = title;
		this.content = content;
	}
	
	public String getID() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
}
