package j10_클래스기본정리;

import j10_클래스기본정리.controller.UserManagementController;

public class UserManagementApplication {

	public static void main(String[] args) {
		
		UserManagementController userManagementController = new UserManagementController();
		userManagementController.createUser();
		
	}

}
