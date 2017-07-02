package exe03;

public class ProfessorView extends UserView{
	@Override
	public void printUserDetails(String studentName, String studentRollNo) {
		System.out.println("Professor: ");
		System.out.println("Name: " + studentName);
		System.out.println("Roll No: " + studentRollNo);
	}
}
