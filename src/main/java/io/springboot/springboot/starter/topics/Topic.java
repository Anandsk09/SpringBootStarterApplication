package io.springboot.springboot.starter.topics;

public class Topic {
	
	
	private String id;
	private String name;
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Topic(String id,String name,String description) {
		this.name = name;
		this.id = id;
		this.description = description;
	}
	public Topic() {
	
	}
	@Override
	public String toString() {
		return "Topic [name=" + name + ", id=" + id + ", description=" + description + "]";
	}
	
	
	

}
