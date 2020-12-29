import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSplitPane;


public class SecondWindow extends JFrame {

	private JPanel contentPane;
	private JTextField showF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondWindow frame = new SecondWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SecondWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "We are Here to Serve You. Own Your Proton Now", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Proton Models that Available", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(64, 278, 234, 115);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JList list = new JList();
		list.setBackground(Color.WHITE);
		list.setBounds(10, 23, 216, 81);
		panel.add(list);

		
		JButton btnChoose = new JButton("Click here to choose the Model you prefer to book");
		btnChoose.setFont(new Font("Constantia", Font.BOLD, 12));
		btnChoose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel DLM = new DefaultListModel();
				DLM.addElement("Proton Saga");
				DLM.addElement("Proton Persona");
				DLM.addElement("Proton X50");
				DLM.addElement("Proton X70");
				list.setModel(DLM);
			}
		});
		btnChoose.setBounds(10, 223, 350, 23);
		contentPane.add(btnChoose);
		
		JButton btnBooking = new JButton("Go for Booking");
		btnBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, 
			    "Booking is currently unavailable due to some issue. We apoligize for the inconvenience. Thank you");
			}
		});
		btnBooking.setBounds(94, 404, 175, 23);
		contentPane.add(btnBooking);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textPane.setBackground(Color.WHITE);
		textPane.setBounds(370, 30, 404, 466);
		contentPane.add(textPane);

		
		JButton SagaButton = new JButton("Saga");
		SagaButton.setBackground(Color.RED);
		SagaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Model : Proton Saga\r\n"
						+ "\nBasic Salary: RM 2,000\r\n"
						+ "\nMonthly Installment: RM 400\r\n"
						+ "\nMechanicals:\n 1) 3 litre VVT DOHC engine\r\n"
						+ " 2) 1,332 cc naturally-aspirated four-cylinder petrol\r\n"
						+ " 3) 95 PS at 5,750 rpm, 120 Nm at 4,000 rpm\r\n"
						+ " 4) Five-speed manual transmission\r\n"
						+ " 5) Ventilated brake discs (front), drums (rear)\r\n"
						+ "\nExterior:\n 1) Halogen reflector headlights\r\n"
						+ " 2) 14-inch steel wheels with 185/60-section tyres\r\n"
						+ " 3) Power-adjustable door mirrors with manual fold\r\n"
						+ " 4) Bee sting antenna\r\n"
						+ "\nInterior: \n 1) Urethane steering wheel\r\n"
						+ " 2) LCD multi-info display\r\n"
						+ " 3) Power windows\r\n"
						+ " 4) Black fabric seats with manual adjustment\r\n"
						+ "\nSafety: \n 1) Dual airbags\r\n"
						+ " 2) ABS with EBD and brake assist\r\n"
						+ " 3) Rear ISOFIX child seat anchors\r\n"
						+ " 4) Rear parking sensors");
			}
		});
		SagaButton.setForeground(Color.BLACK);
		SagaButton.setBounds(20, 65, 106, 49);
		contentPane.add(SagaButton);
		
		JButton PersonaButton = new JButton("Persona");
		PersonaButton.setBackground(Color.BLUE);
		PersonaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Model : Proton Persona\r\n"
						+ "\nBasic Salary: RM 4,000\r\n"
						+ "\nMonthly Installment: RM 600\r\n"
						+ "\nMechanicals:\n 1) 1.6 litre VVT four-cylinder engine\r\n"
						+ " 2) 1,597 cc naturally-aspirated four-cylinder petrol\r\n"
						+ " 3) 107 hp at 5,750 rpm, 150 Nm at 4,000 rpm\r\n"
						+ " 4) Five-speed manual gearbox\r\n"
						+ " 5) ECO Drive Assist light\r\n"
						+ " 6) MacPherson strut front suspension, torsion beam rear\r\n"
						+ "\nExterior:\n 1) Bootlid spoiler\r\n"
						+ " 2) Proton lettering on the bootlid\r\n"
						+ " 3) Unpainted side mirrors and door handles\r\n"
						+ " 4) Body-coloured B-pillars\r\n"
						+ "\nInterior: \n 1) Double-DIN radio/CD player with Bluetooth and USB connectivity\r\n"
						+ " 2) Two speakers\r\n"
						+ " 3) Two rear USB ports – 1.5 A and 2.1 A outputs\r\n"
						+ " 4) 510-litre boot with 14-inch space saver spare tyre\r\n"
						+ "\nSafety: \n 1) Electronic Stability Control\r\n"
						+ " 2) Traction Control System\r\n"
						+ " 3) Hill Hold Assist\r\n"
						+ " 4) Front and rear parking sensors");
			}
		});
		PersonaButton.setForeground(Color.BLACK);
		PersonaButton.setBounds(209, 65, 106, 49);
		contentPane.add(PersonaButton);
		
		JButton X50Button = new JButton("Proton X50");
		X50Button.setBackground(Color.MAGENTA);
		X50Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Model : Proton X50\r\n"
						+ "\nBasic Salary: RM 6,000\r\n"
						+ "\nMonthly Installment: RM 1,200\r\n"
						+ "\nMechanicals:\n 1) 1.5T PFI 1.5 litre engine\r\n"
						+ " 2) 1,477 cc multi-point injection, turbocharged three-cylinder\r\n"
						+ " 3) 150 PS at 5,500 rpm\r\n"
						+ " 4) 226 Nm from 1,500 to 4,000 rpm\r\n"
						+ " 5) Seven-speed wet dual-clutch automatic transmission with manual mode (no paddle shifters)\r\n"
						+ "\nExterior:\n 1) 17-inch silver alloy wheels with 215/60-profile tyres\r\n"
						+ " 2) LED projector headlamps\r\n"
						+ " 3) LED daytime running lights\r\n"
						+ " 5) Gloss black grille with red outline\r\n"
						+ "\nInterior: \n 1) 4G and WiFi, smartphone and Bluetooth connectivity\r\n"
						+ " 2) Four loudspeakers\r\n"
						+ " 3) Three USB ports (one data, two charging)\r\n"
						+ " 4) N95 cabin filter\r\n"
						+ " 5) 330 litres boot space\r\n"
						+ "\nSafety: \n 1)ABS, EBD, brake assist\r\n"
						+ " 2) Hill hold assist, hill descent control\r\n"
						+ "\nColours: \n 1) Snow White, Armour Silver, Ocean Blue ");
			}
		});
		X50Button.setForeground(Color.BLACK);
		X50Button.setBounds(20, 146, 106, 49);
		contentPane.add(X50Button);
		
		JButton X70Button = new JButton("Proton X70");
		X70Button.setBackground(Color.GREEN);
		X70Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Model : Proton X70\r\n"
						+ "\nBasic Salary: RM 7,000\r\n"
						+ "\nMonthly Installment: RM 1,800\r\n"
						+ "\nMechanicals:\n 1) Three drive modes – Normal, Eco and Sport\r\n"
						+ " 2) Electronic power assisted steering with Normal and Sport modes\r\n"
						+ " 3) Electronic parking brake\r\n"
						+ " 4) MacPherson struts (front), multi-link with stabiliser bar (rear)\r\n"
						+ " 5) Ventilated brake discs (front), solid discs (rear)\r\n"
						+ "\nExterior:\n 1) LED front fog lamps\r\n"
						+ " 2) 17-inch alloy wheels with 225/65 profile tyres\r\n"
						+ " 3) Electronic power-folding side mirrors\r\n"
						+ " 4) Keyless entry\r\n"
						+ "\nInterior: \n 1) Eight-inch touchscreen infotainment with voice command, online music streaming, navigation, smartphone connectivity, Bluetooth and 4G Wi-Fi hotspot\r\n"
						+ " 2) Proton Link App to check vehicle status, remote functionality\r\n"
						+ " 3) Six speakers\r\n"
						+ " 4) Six USB ports – one for data, five for charging\r\n"
						+ " 5) Tonneau cover\r\n"
						+ " 6) 18-inch steel spare wheel with 155/85 profile tyre\r\n"
						+ "\nSafety: \n 1) Hill Hold Assist (HHA)\r\n"
						+ " 2) Hill Descent Control (HDC)\r\n"
						+ " 3) Emergency Stop Signal (ESS)\r\n"
						+ " 4) Electronic Brake-Force Distribution (EBD)");
			}
		});
		X70Button.setForeground(Color.BLACK);
		X70Button.setBounds(209, 146, 106, 49);
		contentPane.add(X70Button);
		
		JLabel lblNewLabel = new JLabel("Click the model for features and requirements.");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setBounds(20, 30, 319, 23);
		contentPane.add(lblNewLabel);
			
		
	}
}
