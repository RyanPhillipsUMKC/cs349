package Controller;

import javax.swing.JOptionPane;

import View.LoginView;
import View.RegisterView;

public class LoginController {
	
	LoginView loginView;
	
	public LoginController(LoginView loginView) {
		super();
		this.loginView = loginView;
	}

	public void onLoginButtonClick() {
		JOptionPane.showMessageDialog(loginView, "Login Successful");
	}
	
	public void onRegisterButtonClick() {
			RegisterView registerView = new RegisterView();
			loginView.setVisible(false);
			registerView.setVisible(true);
	}
	
}
