package assignment1_q1;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;

public class EditCoordi_frame extends JFrame {

	public JPanel contentPane;
	public JTextField textFieldCoordi_name;
	public JTextField textFieldCoordi_dept;
	public JTextField textField_Coordi_address;
	public JLabel lblMobile;
	public JTextField textFieldCoordi_mobile;
	public JLabel lblEmailAddress;
	public JTextField textFieldCoordi_email;
	public JButton btnSave;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public EditCoordi_frame(ArrayList<create_course>A,int i) {
		setTitle("Coordinator");
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
		
		textFieldCoordi_name = new JTextField();
		textFieldCoordi_name.setBounds(188, 21, 153, 24);
		textFieldCoordi_name.setText(A.get(i).coordiObj.name);
		contentPane.add(textFieldCoordi_name);
		textFieldCoordi_name.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDepartment.setBounds(75, 73, 119, 25);
		contentPane.add(lblDepartment);
		
		textFieldCoordi_dept = new JTextField();
		textFieldCoordi_dept.setColumns(10);
		textFieldCoordi_dept.setBounds(188, 75, 153, 24);
		textFieldCoordi_dept.setText(A.get(i).coordiObj.dept);
		contentPane.add(textFieldCoordi_dept);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAddress.setBounds(75, 120, 119, 25);
		contentPane.add(lblAddress);
		
		textField_Coordi_address = new JTextField();
		textField_Coordi_address.setColumns(10);
		textField_Coordi_address.setBounds(188, 124, 153, 24);
		textField_Coordi_address.setText(A.get(i).coordiObj.address);
		contentPane.add(textField_Coordi_address);
		
		lblMobile = new JLabel("Mobile No.");
		lblMobile.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMobile.setBounds(75, 167, 119, 25);
		contentPane.add(lblMobile);
		
		textFieldCoordi_mobile = new JTextField();
		textFieldCoordi_mobile.setColumns(10);
		textFieldCoordi_mobile.setBounds(188, 169, 153, 24);
		textFieldCoordi_mobile.setText(A.get(i).coordiObj.mobile);
		contentPane.add(textFieldCoordi_mobile);
		
		lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmailAddress.setBounds(75, 214, 119, 25);
		contentPane.add(lblEmailAddress);
		
		textFieldCoordi_email = new JTextField();
		textFieldCoordi_email.setColumns(10);
		textFieldCoordi_email.setBounds(188, 218, 153, 24);
		textFieldCoordi_email.setText(A.get(i).coordiObj.email);
		contentPane.add(textFieldCoordi_email);
		
		btnSave = new JButton("Save");
		btnSave.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSave.setBounds(157, 272, 134, 32);
		contentPane.add(btnSave);
		
		setVisible(true);
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				A.get(i).coordiObj.name=textFieldCoordi_name.getText();
				A.get(i).coordiObj.dept=textFieldCoordi_dept.getText();
				A.get(i).coordiObj.address=textField_Coordi_address.getText();
				A.get(i).coordiObj.mobile=textFieldCoordi_mobile.getText();
				A.get(i).coordiObj.email=textFieldCoordi_email.getText();
				setVisible(false);
			}
		});
	}
}
