package Type_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class TN_Cineplex {

	private JFrame frame;
	private JLabel lblMembership;
	private JRadioButton rdbtnYes;
	private JRadioButton rdbtnNo;
	private JButton btnContinue;
	private JTextField textField_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TN_Cineplex window = new TN_Cineplex();
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
	public TN_Cineplex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBackground(Color.GRAY);
		frame.setBounds(100, 100, 628, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/HaiThong/Desktop/Cineplex_logo.svg copy.png"));
		
		JLabel label = new JLabel("Full Name");
		
		lblMembership = new JLabel("Membership?");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		rdbtnYes = new JRadioButton("Yes");
		
		btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Frame2 tf2 =new Frame2();
				tf2.setVisible(true);
			}
		});
		
		rdbtnNo = new JRadioButton("No");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(85)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
									.addGap(89)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(rdbtnYes)
											.addGap(102)
											.addComponent(btnContinue))
										.addComponent(rdbtnNo)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(179)
									.addComponent(lblMembership))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(235)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(106)
							.addComponent(label)))
					.addContainerGap(98, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblMembership)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(23)
							.addComponent(rdbtnYes)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNo))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnContinue)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(93))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
