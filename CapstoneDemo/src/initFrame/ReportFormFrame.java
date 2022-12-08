package initFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.Checkbox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class ReportFormFrame extends JFrame {

	private JPanel contentPane;
	private HumanTraffickingData hData = new HumanTraffickingData();
	private JTextField ageField;
	private JTextField firstNameField;
	private JTextField lastNameField;
	JTextArea locationArea;
	JTextArea additionalArea;
	Checkbox helpBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReportFormFrame frame = new ReportFormFrame();
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
	public ReportFormFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 941, 633);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton_1 = new JButton("<- Back");
		btnNewButton_1.setBounds(38, 560, 109, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				HTInfoFrame HTInfo;
				HTInfo = new HTInfoFrame();
				HTInfo.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton_1);
		
		JButton btnSubmitform = new JButton("Submit Form");
		btnSubmitform.setBounds(712, 560, 183, 23);
		btnSubmitform.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EntryData personData = new EntryData(firstNameField.getText(), lastNameField.getText(), ageField.getText(), true, locationArea.getText(), additionalArea.getText());
				
				if(!personData.entryIsEmpty())
				{
					hData.addEntry(personData);
				}
				hData.displayData();
				

				contentPane.setVisible(false);
				BathroomSurveyThankYou BathroomThankYou = null;
				try {
					BathroomThankYou = new BathroomSurveyThankYou();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				BathroomThankYou.setVisible(true);
				
				initFrame initscreen = new initFrame();
				initscreen.main(null);
			}
		});
		contentPane.add(btnSubmitform);
		
		ageField = new JTextField();
		ageField.setBackground(new Color(232, 226, 254));
		ageField.setBounds(61, 131, 86, 20);
		contentPane.add(ageField);
		ageField.setColumns(10);
		
		firstNameField = new JTextField();
		firstNameField.setBackground(new Color(232, 226, 254));
		firstNameField.setBounds(96, 74, 86, 20);
		contentPane.add(firstNameField);
		firstNameField.setColumns(10);
		
		lastNameField = new JTextField();
		lastNameField.setBackground(new Color(232, 226, 254));
		lastNameField.setBounds(308, 74, 86, 20);
		contentPane.add(lastNameField);
		lastNameField.setColumns(10);
		
		locationArea = new JTextArea();
		locationArea.setBackground(new Color(232, 226, 254));
		locationArea.setBounds(308, 172, 587, 133);
		contentPane.add(locationArea);
		
		additionalArea = new JTextArea();
		additionalArea.setBackground(new Color(232, 226, 254));
		additionalArea.setBounds(309, 332, 586, 194);
		contentPane.add(additionalArea);
		
		helpBox = new Checkbox("Yes");
		helpBox.setBackground(new Color(232, 226, 254));
		helpBox.setBounds(764, 129, 95, 22);
		contentPane.add(helpBox);
		
		JTextArea txtrWhatIsGoing = new JTextArea();
		txtrWhatIsGoing.setText("Please enter your address \r\nor any landmarks or \r\ninformationwhich can \r\nhelp us identify your location");
		txtrWhatIsGoing.setBounds(10, 222, 245, 76);
		contentPane.add(txtrWhatIsGoing);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(Color.BLACK);
		lblFirstName.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblFirstName.setBounds(10, 74, 86, 17);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Check this box if you would like to receive help from authorities");
		lblLastName.setForeground(Color.BLACK);
		lblLastName.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblLastName.setBounds(206, 132, 530, 17);
		contentPane.add(lblLastName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setForeground(Color.BLACK);
		lblAge.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblAge.setBounds(10, 134, 36, 17);
		contentPane.add(lblAge);
		
		JLabel lblLastName_1 = new JLabel("Last Name");
		lblLastName_1.setForeground(Color.BLACK);
		lblLastName_1.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblLastName_1.setBounds(220, 77, 86, 17);
		contentPane.add(lblLastName_1);
		
		JTextArea txtrPleaseEnterAny = new JTextArea();
		txtrPleaseEnterAny.setText("Please enter any additional\r\ninformation. This includes but\r\nis not limited to contact\r\ninformation for family or \r\nfriends you may want to notify\r\nas well as information which\r\nmay be used in an attempt to\r\nhelp you.");
		txtrPleaseEnterAny.setBounds(17, 375, 289, 164);
		contentPane.add(txtrPleaseEnterAny);
		
		JLabel lblPleaseFillOut = new JLabel("Please fill out this form to send your information to authorities");
		lblPleaseFillOut.setForeground(Color.BLACK);
		lblPleaseFillOut.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblPleaseFillOut.setBounds(17, 11, 807, 17);
		contentPane.add(lblPleaseFillOut);
		
		JLabel lblNoteAuthoritiesWill = new JLabel("Note: Authorities will only try to extend help if you indicate that you would like help in this form");
		lblNoteAuthoritiesWill.setForeground(Color.BLACK);
		lblNoteAuthoritiesWill.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblNoteAuthoritiesWill.setBounds(17, 39, 852, 17);
		contentPane.add(lblNoteAuthoritiesWill);
	}
}
