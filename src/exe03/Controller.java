package exe03;

public class Controller {
	private User model;
	private UserView view;

	public Controller(User model, UserView view) {
		this.model = model;
		this.view = view;
	}

	public void setUserName(String name) {
		model.setName(name);
	}

	public String getUserName() {
		return model.getName();
	}

	public void setUserRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getUserRollNo() {
		return model.getRollNo();
	}

	public void updateView() {
		view.printUserDetails(model.getName(), model.getRollNo());
	}
}
