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

public class faculty_frame extends JFrame {

	public JPanel contentPane;
	public JTextField textFieldFaculty_name;
	public JTextField textFieldFaculty_dept;
	public JTextField textFieldFaculty_address;
	public JLabel lblMobile;
	public JLabel lblEmailAddress;
	public JTextField textFieldFaculty_email;
	public JButton btnSave;
	public JTextField textFieldFaculty_mobile;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public faculty_frame() {
		setTitle("Faculty");
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
		
		textFieldFaculty_name = new JTextField();
		textFieldFaculty_name.setBounds(188, 21, 153, 24);
		contentPane.add(textFieldFaculty_name);
		textFieldFaculty_name.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDepartment.setBounds(75, 73, 119, 25);
		contentPane.add(lblDepartment);
		
		textFieldFaculty_dept = new JTextField();
		textFieldFaculty_dept.setColumns(10);
		textFieldFaculty_dept.setBounds(188, 75, 153, 24);
		contentPane.add(textFieldFaculty_dept);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAddress.setBounds(75, 120, 119, 25);
		contentPane.add(lblAddress);
		
		textFieldFaculty_address = new JTextField();
		textFieldFaculty_address.setColumns(10);
		textFieldFaculty_address.setBounds(188, 124, 153, 24);
		contentPane.add(textFieldFaculty_address);
		
		lblMobile = new JLabel("Mobile No.");
		lblMobile.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMobile.setBounds(75, 167, 119, 25);
		contentPane.add(lblMobile);
		
		textFieldFaculty_mobile = new JTextField();
		textFieldFaculty_mobile.setColumns(10);
		textFieldFaculty_mobile.setBounds(188, 169, 153, 24);
		contentPane.add(textFieldFaculty_mobile);
		
		lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmailAddress.setBounds(75, 214, 119, 25);
		contentPane.add(lblEmailAddress);
		
		textFieldFaculty_email = new JTextField();
		textFieldFaculty_email.setColumns(10);
		textFieldFaculty_email.setBounds(188, 218, 153, 24);
		contentPane.add(textFieldFaculty_email);
		
		btnSave = new JButton("Save");
		btnSave.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSave.setBounds(157, 272, 134, 32);
		contentPane.add(btnSave);
	}

}
