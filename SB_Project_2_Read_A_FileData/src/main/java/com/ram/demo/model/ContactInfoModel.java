package com.ram.demo.model;


public class ContactInfoModel {

	private int contactId;
	private String Name;
	private String course;
	
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "ContactInfoModel [contactId=" + contactId + ", Name=" + Name + ", course=" + course + "]";
	}

	public ContactInfoModel(int contactId, String name, String course) {
		this.contactId = contactId;
		Name = name;
		this.course = course;
	}
	
	
	
}
