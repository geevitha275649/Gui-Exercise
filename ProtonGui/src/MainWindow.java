import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;

public class MainWindow {

	private JFrame frame;
	private JLabel Label;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnLogin;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 587, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/plogo.png")).getImage();
		Label.setIcon(new ImageIcon(img));
		Label.setBounds(181, 11, 195, 180);
		frame.getContentPane().add(Label);
		
		JLabel userText = new JLabel("Username");
		userText.setFont(new Font("Tahoma", Font.BOLD, 14));
		userText.setBounds(125, 241, 84, 17);
		frame.getContentPane().add(userText);
		
		textField = new JTextField();
		textField.setBounds(219, 239, 157, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel pwdText = new JLabel("Password");
		pwdText.setFont(new Font("Tahoma", Font.BOLD, 14));
		pwdText.setBounds(125, 289, 84, 17);
		frame.getContentPane().add(pwdText);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(219, 287, 157, 20);
		frame.getContentPane().add(passwordField);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener (new ActionListener () {
			
			public void actionPerformed (ActionEvent e) {
				
				String userText = textField.getText();
				String pwdText = passwordField.getText();
				
				if(userText.equals("name") && pwdText.equals("password"))
				{		
						JOptionPane.showMessageDialog(frame, "You're logined successfully");
						//create object
						
						SecondWindow secondPage = new SecondWindow();
						secondPage.setVisible(true);
				}
				else
				{
				JOptionPane.showMessageDialog(frame, "Invalid Password");
				}								
			}
			
		});
		btnLogin.setBounds(259, 342, 89, 23);
		frame.getContentPane().add(btnLogin);
	}
}
