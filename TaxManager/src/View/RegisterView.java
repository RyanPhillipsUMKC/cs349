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

public class RegisterView extends JFrame {
	JTextField txtFullname, txtEmail, txtUsername;
	JPasswordField txtPassword, txtConfirmPassword;
	JButton btnLogin, btnRegister;
	JLabel lblStatus;
	
	public RegisterView() {
		super();
		buildUI();
		setTitle("Register");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	
	private void buildUI() {
		setLayout(new BorderLayout());
		
		// login form
		JPanel formPanel = new JPanel(new GridLayout(5, 2, 8, 8));
		formPanel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
		
		formPanel.add(new JLabel("Fullname"));
		txtFullname = new JTextField(20);
		formPanel.add(txtFullname);
		
		formPanel.add(new JLabel("Username"));
		txtUsername = new JTextField(20);
		formPanel.add(txtUsername);
		
		formPanel.add(new JLabel("Email"));
		txtEmail = new JTextField(20);
		formPanel.add(txtEmail);
		
		formPanel.add(new JLabel("Password"));
		txtPassword = new JPasswordField();
		formPanel.add(txtPassword);
		
		formPanel.add(new JLabel("Confrim Password"));
		txtConfirmPassword = new JPasswordField();
		formPanel.add(txtConfirmPassword);
		
		// bottom comps
		JPanel bottomPanel = new JPanel(new BorderLayout());
		lblStatus = new JLabel("Fill out details.");
		btnLogin = new JButton("Login");
		btnRegister = new JButton("Register");
		bottomPanel.add(lblStatus, BorderLayout.WEST);
		bottomPanel.add(btnLogin, BorderLayout.CENTER);
		bottomPanel.add(btnRegister, BorderLayout.EAST);
		
		add(formPanel, BorderLayout.NORTH);
		add(bottomPanel, BorderLayout.CENTER);
	}
}
