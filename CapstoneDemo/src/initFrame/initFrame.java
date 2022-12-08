package initFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;

public class initFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initFrame window = new initFrame();
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
	public initFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 941, 633);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("How was your bathroom experience?");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Modern No. 20", Font.BOLD, 27));
		lblNewLabel.setBounds(171, 28, 484, 138);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				BathroomSurveyThankYou BathroomThankYou = null;
				try {
					BathroomThankYou = new BathroomSurveyThankYou();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				BathroomThankYou.setVisible(true);
				
				main(null);
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\naira\\Downloads\\smiley.png"));
		btnNewButton.setBounds(97, 287, 105, 101);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				BathroomSurveyThankYou BathroomThankYou = null;
				try {
					BathroomThankYou = new BathroomSurveyThankYou();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				BathroomThankYou.setVisible(true);
				
				main(null);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\naira\\Downloads\\medium.png"));
		btnNewButton_1.setBounds(394, 287, 105, 101);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				BathroomSurveyThankYou BathroomThankYou = null;
				try {
					BathroomThankYou = new BathroomSurveyThankYou();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				BathroomThankYou.setVisible(true);
				
				main(null);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\naira\\Downloads\\frowny.png"));
		btnNewButton_2.setBounds(675, 287, 105, 101);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Learn More About Human Traficking | Más información sobre la trata de personas");
		lblNewLabel_1.setForeground(new Color(206, 9, 9));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		lblNewLabel_1.setBounds(441, 564, 326, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_3 = new JButton("Learn More!");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				HTInfoFrame HTInfo;
				HTInfo = new HTInfoFrame();
				HTInfo.setVisible(true);
				
			}
		});
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setForeground(new Color(206, 9, 9));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_3.setBounds(777, 567, 100, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}
