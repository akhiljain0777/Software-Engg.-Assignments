package assignment1_q1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class createcourse_frame extends JFrame {

	public JPanel contentPane;
	public JTextField textFieldCname;
	public JLabel lblCourseName;
	public JLabel lblCourseFee;
	public JTextField textFieldCfee;
	public JLabel lblStartDate;
	public JTextField textFieldCdate;
	public JLabel lblDuration;
	public JTextField textFieldCduration;
	public JButton btnAddCoordi;
	public JButton btnAddFaculty;
	public JButton btnAddParticipants;
	public JButton btnSave;

	/**
	 * Launch the application.
	
	/**
	 * Create the frame.
	 */
	public createcourse_frame() {
		setTitle("Course");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldCname = new JTextField();
		textFieldCname.setBounds(175, 27, 179, 25);
		contentPane.add(textFieldCname);
		textFieldCname.setColumns(10);
		
		lblCourseName = new JLabel("Course Name");
		lblCourseName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCourseName.setBounds(46, 27, 119, 25);
		contentPane.add(lblCourseName);
		
		lblCourseFee = new JLabel("Course Fee");
		lblCourseFee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCourseFee.setBounds(46, 74, 119, 25);
		contentPane.add(lblCourseFee);
		
		textFieldCfee = new JTextField();
		textFieldCfee.setColumns(10);
		textFieldCfee.setBounds(175, 76, 179, 25);
		contentPane.add(textFieldCfee);
		
		lblStartDate = new JLabel("Start Date");
		lblStartDate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblStartDate.setBounds(46, 121, 119, 25);
		contentPane.add(lblStartDate);
		
		textFieldCdate = new JTextField();
		textFieldCdate.setColumns(10);
		textFieldCdate.setBounds(175, 123, 179, 25);
		contentPane.add(textFieldCdate);
		
		lblDuration = new JLabel("Duration");
		lblDuration.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDuration.setBounds(46, 168, 119, 25);
		contentPane.add(lblDuration);
		
		textFieldCduration = new JTextField();
		textFieldCduration.setColumns(10);
		textFieldCduration.setBounds(175, 170, 179, 25);
		contentPane.add(textFieldCduration);
		
		btnAddCoordi = new JButton("Add Coordinator");
		btnAddCoordi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		
		btnAddCoordi.setBounds(94, 204, 260, 41);
		contentPane.add(btnAddCoordi);
		
		btnAddFaculty = new JButton("Add Faculty");
		btnAddFaculty.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddFaculty.setBounds(94, 256, 260, 41);
		contentPane.add(btnAddFaculty);
		
		btnAddParticipants = new JButton("Add Participants");
		btnAddParticipants.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddParticipants.setBounds(94, 308, 260, 41);
		contentPane.add(btnAddParticipants);
		
		btnSave = new JButton("Save");
		btnSave.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSave.setBounds(313, 360, 96, 41);
		contentPane.add(btnSave);
		
		JLabel lblddmmyyyy = new JLabel("(DD.MM.YYYY)");
		lblddmmyyyy.setBounds(46, 141, 70, 14);
		contentPane.add(lblddmmyyyy);
	}
}
