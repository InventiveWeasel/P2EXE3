package exe03;

public class MVCPatternDemo {
	public static void main(String[] args) {

		// fetch student record based on his roll no from the database
		Student model = retriveStudentFromDatabase();

		// Create a view : to write student details on console
		StudentView view = new StudentView();

		Controller controller = (StudentController) ControllerFactory.buildController(ControllerType.STUDENT, model, view);

		controller.updateView();

		// update model data
		controller.setUserName("John");

		controller.updateView();
		
		//Repetindo os mesmos testes para o caso de um professor
		Professor prof = retriveProfessorFromDatabase();
		UserView profView = new ProfessorView();
		controller = (ProfessorController) ControllerFactory.buildController(ControllerType.PROFESSOR, prof, profView);
		controller.updateView();
		controller.setUserName("Rafael");
		controller.updateView();
	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
	
	private static Professor retriveProfessorFromDatabase() {
		Professor professor = new Professor();
		professor.setName("Gabriel");
		professor.setRollNo("99");
		return professor;
	}

}
