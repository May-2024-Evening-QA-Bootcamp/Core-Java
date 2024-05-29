package lec08_01_java_oop_encapsulation;

public class Tutee {
	private String stName;
	private int stId;
	private char stGender;
	private boolean fullTimeSt;
	private float stGrade;
	
	// Parameterized Constructor
	public Tutee(String stName, int stId, char stGender, boolean fullTimeSt, float stGrade) {
		super();
		this.stName = stName;
		this.stId = stId;
		this.stGender = stGender;
		this.fullTimeSt = fullTimeSt;
		this.stGrade = stGrade;
	}

	// Created Getters method only below by selecting "Select Getters", before we say, "Select All"
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
