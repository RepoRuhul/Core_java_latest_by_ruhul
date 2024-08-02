package lec09_01_java_oop_encapsulation;

public class Student {
	private String stName;
	private int stId;
	private char stGender;
	private boolean fullTimeSt;
	private float stGrade;
	// There are many ways to encapsulate the data. 
	// By making method and variable private, then the access limits to the class user only
	
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	
	public char getStGender() {
		return stGender;
	}
	public void setStGender(char stGender) {
		this.stGender = stGender;
	}
	
	public boolean isFullTimeSt() {
		return fullTimeSt;
	}
	public void setFullTimeSt(boolean fullTimeSt) {
		this.fullTimeSt = fullTimeSt;
	}
	
	public float getStGrade() {
		return stGrade;
	}
	public void setStGrade(float stGrade) {
		this.stGrade = stGrade;
	}
	
	
	// By using getter and setter method private data can be accessed
	
	
	
	
	
	

}
