package lec09_01_java_oop_encapsulation;

public class Tutee {
	private String stName;
	private int stId;
	private char stGender;
	private boolean fullTimeSt;
	private float stGrade;
	
	// Parameterized Constructor
	public Tutee(String stName, int stId, char stGender, boolean fullTimeSt, float stGrade) {
		this.stName = stName;
		this.stId = stId;
		this.stGender = stGender;
		this.fullTimeSt = fullTimeSt;
		this.stGrade = stGrade;
	}

	// Created Getters method only below
	public String getStName() {
		return stName;
	}

	public int getStId() {
		return stId;
	}

	public char getStGender() {
		return stGender;
	}

	public boolean isFullTimeSt() {
		return fullTimeSt;
	}

	public float getStGrade() {
		return stGrade;
	}

}
