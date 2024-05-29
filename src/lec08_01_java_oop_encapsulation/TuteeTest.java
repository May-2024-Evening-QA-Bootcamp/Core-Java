package lec08_01_java_oop_encapsulation;

public class TuteeTest {

	public static void main(String[] args) {
		Tutee tutee = new Tutee("Alex", 218760, 'M', false, 3.8389f);
		System.out.println("Student Name: " + tutee.getStName()  + "\nStudent Id: " + tutee.getStId() + "\nGender: "
				+ tutee.getStGender() + "\nFull Time student? : " + tutee.isFullTimeSt() + "\nGrade: " + tutee.getStGrade());

	}

}
