package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controller.LoginController;

public class LoginView extends JFrame {
	JTextField txtUsername;
	JPasswordField txtPassword;
	JButton btnLogin, btnRegister;
	JLabel lblStatus;
	
	LoginController controller;
	
	public LoginView() {
		super();
		controller = new LoginController();
		buildUI();
		setTitle("Login");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	
	private void buildUI() {
		setLayout(new BorderLayout());
		
		// login form
		JPanel formPanel = new JPanel(new GridLayout(2, 2, 8, 8));
		formPanel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
		formPanel.add(new JLabel("Username"));
		txtUsername = new JTextField(20);
		formPanel.add(txtUsername);
		formPanel.add(new JLabel("Password"));
		txtPassword = new JPasswordField();
		formPanel.add(txtPassword);
		
		// bottom comps
		JPanel bottomPanel = new JPanel(new BorderLayout());
		lblStatus = new JLabel("Enter username and password or register a new account.");
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(e -> controller.onLoginButtonClick());
		btnRegister = new JButton("Register");
		btnRegister.addActionListener(e -> controller.onRegisterButtonClick());
		bottomPanel.add(lblStatus, BorderLayout.WEST);
		bottomPanel.add(btnLogin, BorderLayout.CENTER);
		bottomPanel.add(btnRegister, BorderLayout.EAST);
		
		add(formPanel, BorderLayout.NORTH);
		add(bottomPanel, BorderLayout.CENTER);
	}
	
}
