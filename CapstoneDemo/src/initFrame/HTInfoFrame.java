package initFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;

public class HTInfoFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HTInfoFrame frame = new HTInfoFrame();
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
	public HTInfoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 941, 633);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(216, 10, 2, 2);
		scrollPane.setToolTipText("hijhbkfjytf\r\ng\r\ng\r\ng\r\ng\r\ng\r\ng\r\ng\r\ng\r\ng\r\ng\r\ng\r\ngg\r\ngf\r\n");
		contentPane.add(scrollPane);
		
		JButton btnNewButton = new JButton("Report Human Traficking!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				contentPane.setVisible(false);;
				ReportFormFrame reportFrame;
				reportFrame = new ReportFormFrame();
				reportFrame.setVisible(true);
			}
		});
		btnNewButton.setBounds(732, 560, 183, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<- Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				initFrame initscreen = new initFrame();
				initscreen.main(null);
			}
		});
		btnNewButton_1.setBounds(10, 560, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JTextArea txtrHumanTraffickingAlso = new JTextArea();
		txtrHumanTraffickingAlso.setFont(new Font("Monospaced", Font.PLAIN, 10));
		txtrHumanTraffickingAlso.setText("Human trafficking, also known as trafficking in persons, is a crime that involves compelling or coercing a \r\nperson to provide labor or services, or to engage in commercial sex acts. The coercion can be subtle or overt, \r\nphysical or psychological.  Exploitation of a minor for commercial sex is human trafficking, regardless of\r\nwhether any form of force, fraud, or coercion was used.\r\n\r\nVictim-Survivors\r\nThere is no single profile of a trafficking victim. Victims of human trafficking can be anyone—regardless\r\nof race, color, national origin, disability, religion, age, gender, sexual orientation, gender identity,\r\nsocioeconomic status, education level, or citizenship status.  But as is the case in many crimes of exploitation\r\nand abuse, human traffickers often prey upon members of marginalized communities and other vulnerable\r\nindividuals, including children in the child welfare system or children in the child welfare system or children\r\nwho have been involved in the juvenile justice system; runaway and homeless youth; unaccompanied\r\nchildren; persons who do not have lawful immigration status in the United States; Black people and other\r\npeople of color; American Indians, Alaska Natives, Native Hawaiians, Pacific Islanders, and other indigenous\r\npeoples of North America; Lesbian, Gay, Bisexual, Transgender, Queer, and Intersex (LGBTQI+)\r\nindividuals; migrant laborers; persons with disabilities; and individuals with substance use disorder.\r\n\r\nVulnerabilities\r\nAlthough there is no defining characteristic that all human trafficking victims share, traffickers around the\r\nworld frequently prey on individuals whose vulnerabilities, including poverty, limited English proficiency, or\r\nlack of lawful immigration status, are exacerbated by lack of stable, safe housing, and limited economic and\r\neducational opportunities. Trafficking victims are deceived by false promises of love, a good job, or a stable life\r\nand are lured or forced into situations where they are made to work under deplorable conditions with little or\r\nno pay.  In the United States, trafficking victims can be American or foreign citizens.\r\n\r\nLocations\r\nVictims can be found in legal and illegal labor industries, including child care, elder care, the drug trade, massage\r\nparlors, nail and hair salons, restaurants, hotels, factories, and farms. In some cases, victims are hidden behind doors\r\nin domestic servitude in a home. Others are in plain view, interact with people on a daily basis, and are forced to\r\nwork under extreme circumstances in exotic dance clubs, factories, or restaurants. Victims can be exploited for commercial sex in numerous contexts,\r\nincluding on the street, in illicit massage parlors, cantinas, brothels, or through escort services and online advertising. Trafficking situations can\r\nbe found across the United States.\r\n\r\n");
		txtrHumanTraffickingAlso.setBounds(10, 81, 904, 453);
		contentPane.add(txtrHumanTraffickingAlso);
		
		JLabel lblLearnMoreAbout = new JLabel("Learn More About Human Trafficking");
		lblLearnMoreAbout.setForeground(Color.BLACK);
		lblLearnMoreAbout.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblLearnMoreAbout.setBounds(28, 23, 807, 17);
		contentPane.add(lblLearnMoreAbout);
		
	

	}

}
