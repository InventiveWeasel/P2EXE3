package exe03;

public class StudentView extends UserView{
	@Override
	public void printUserDetails(String studentName, String studentRollNo) {
		System.out.println("Student: ");
		System.out.println("Name: " + studentName);
		System.out.println("Roll No: " + studentRollNo);
	}

}
