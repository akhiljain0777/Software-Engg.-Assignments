package assignment1_q1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Cursor;

public class participants_frame extends JFrame {

	public JPanel contentPane;
	public JTextField textFieldParticipant_name;
	public JTextField textFieldParticipant_organisation;
	public JTextField textFieldParticipant_address;
	public JLabel lblMobile;
	public JTextField textFieldParticipant_mobile;
	public JLabel lblEmailAddress;
	public JTextField textFieldParticipant_email;
	public JButton btnSave;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public participants_frame() {
		setTitle("Participants");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 435, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(75, 19, 119, 25);
		contentPane.add(lblName);
		
		textFieldParticipant_name = new JTextField();
		textFieldParticipant_name.setBounds(188, 21, 153, 24);
		contentPane.add(textFieldParticipant_name);
		textFieldParticipant_name.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Organisation Name");
		lblDepartment.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDepartment.setBounds(75, 73, 153, 25);
		contentPane.add(lblDepartment);
		
		textFieldParticipant_organisation = new JTextField();
		textFieldParticipant_organisation.setColumns(10);
		textFieldParticipant_organisation.setBounds(219, 75, 153, 24);
		contentPane.add(textFieldParticipant_organisation);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAddress.setBounds(75, 120, 119, 25);
		contentPane.add(lblAddress);
		
		textFieldParticipant_address = new JTextField();
		textFieldParticipant_address.setColumns(10);
		textFieldParticipant_address.setBounds(188, 124, 153, 24);
		contentPane.add(textFieldParticipant_address);
		
		lblMobile = new JLabel("Mobile No.");
		lblMobile.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMobile.setBounds(75, 167, 119, 25);
		contentPane.add(lblMobile);
		
		textFieldParticipant_mobile = new JTextField();
		textFieldParticipant_mobile.setColumns(10);
		textFieldParticipant_mobile.setBounds(188, 169, 153, 24);
		contentPane.add(textFieldParticipant_mobile);
		
		lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmailAddress.setBounds(75, 214, 119, 25);
		contentPane.add(lblEmailAddress);
		
		textFieldParticipant_email = new JTextField();
		textFieldParticipant_email.setColumns(10);
		textFieldParticipant_email.setBounds(188, 218, 153, 24);
		contentPane.add(textFieldParticipant_email);
		
		btnSave = new JButton("Save");
		btnSave.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSave.setBounds(157, 272, 134, 32);
		contentPane.add(btnSave);
	}

}
