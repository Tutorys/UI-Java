import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JPanel {

	JPanel logoPanel;
	JLabel logoLabel;
	JPanel centerPanel;
	JLabel emailLabel;
	JTextField emailField;
	JLabel passwordLabel;
	JPasswordField passwordField;
	JPanel buttonsPanel;
	JButton loginButton;


	public LoginPanel(){
		setLayout(new BorderLayout());
		this.add(getHeader(), BorderLayout.NORTH);
		this.add(getTextArea(), BorderLayout.CENTER);
		this.add(getButtonPanel(), BorderLayout.SOUTH);
	}

	protected JComponent getHeader() {
		logoPanel = new JPanel();
		logoLabel = new JLabel("", JLabel.CENTER);
		add(logoLabel);  
		ImageIcon logo = new ImageIcon("logo-tutorys.png");   
		logoLabel.setIcon(logo);
		return logoLabel;  
	} 

	protected JComponent getTextArea() {
		centerPanel = new JPanel();
		centerPanel.setLayout(new FlowLayout());
		emailLabel = new JLabel("Email: ");
		emailField = new JTextField(33);
		passwordLabel = new JLabel("Password: ");
		passwordField = new JPasswordField(33);
		centerPanel.add(emailLabel);
		centerPanel.add(emailField);
		centerPanel.add(passwordLabel);
		centerPanel.add(passwordField);
		return centerPanel;
	}
	
	protected JComponent getButtonPanel() {
		buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new FlowLayout());
		loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginButton.setText("You have clicked on the button");
			}
		});
		buttonsPanel.add(loginButton);
		return buttonsPanel;
	}
}
