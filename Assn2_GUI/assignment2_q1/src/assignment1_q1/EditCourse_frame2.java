package assignment1_q1;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class EditCourse_frame2 extends JFrame {

	private int j;
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
	private JButton btneditCoordinator;
	private JButton btnEditFaculty;
	private JButton btnEditParticipants;
	public SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public EditCourse_frame2(ArrayList<create_course>A,int i) {
		setTitle("Edit Course");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 435, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldCname = new JTextField();
		textFieldCname.setBounds(175, 27, 179, 25);
		textFieldCname.setText(A.get(i).getCname());
		contentPane.add(textFieldCname);
		textFieldCname.setColumns(10);
		
		lblCourseName = new JLabel("Course Name");
		lblCourseName.setBounds(46, 27, 119, 25);
		lblCourseName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblCourseName);
		
		lblCourseFee = new JLabel("Course Fee");
		lblCourseFee.setBounds(46, 74, 119, 25);
		lblCourseFee.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblCourseFee);
		
		textFieldCfee = new JTextField();
		textFieldCfee.setBounds(175, 76, 179, 25);
		textFieldCfee.setColumns(10);
		String temp=Integer.toString(A.get(i).getFee());
		textFieldCfee.setText(temp);
		contentPane.add(textFieldCfee);
		
		lblStartDate = new JLabel("Start Date");
		lblStartDate.setBounds(46, 121, 119, 25);
		lblStartDate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblStartDate);
		
		textFieldCdate = new JTextField();
		textFieldCdate.setBounds(175, 123, 179, 25);
		textFieldCdate.setColumns(10);
		textFieldCdate.setText(A.get(i).getDate());
		contentPane.add(textFieldCdate);
		
		lblDuration = new JLabel("Duration");
		lblDuration.setBounds(46, 168, 119, 25);
		lblDuration.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblDuration);
		
		textFieldCduration = new JTextField();
		textFieldCduration.setBounds(175, 170, 179, 25);
		textFieldCduration.setColumns(10);
		textFieldCduration.setText(A.get(i).getDuration());
		contentPane.add(textFieldCduration);
		
		btnAddCoordi = new JButton("Add Coordinator");
		btnAddCoordi.setBounds(10, 256, 141, 41);
		btnAddCoordi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(btnAddCoordi);
		
		btnAddFaculty = new JButton("Add Faculty");
		btnAddFaculty.setBounds(10, 308, 141, 41);
		btnAddFaculty.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(btnAddFaculty);
		
		btnAddParticipants = new JButton("Add Participants");
		btnAddParticipants.setBounds(10, 360, 141, 41);
		btnAddParticipants.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(btnAddParticipants);
		
		btnSave = new JButton("Save");
		
		btnSave.setBounds(175, 207, 96, 41);
		btnSave.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(btnSave);
		
		btneditCoordinator = new JButton("Edit Coordinator");
		btneditCoordinator.setBounds(268, 256, 141, 41);
		contentPane.add(btneditCoordinator);
		
		btnEditFaculty = new JButton("Edit Faculty(s)");
		btnEditFaculty.setBounds(268, 308, 141, 41);
		contentPane.add(btnEditFaculty);
		
		btnEditParticipants = new JButton("Edit Participant(s)");
		btnEditParticipants.setBounds(268, 360, 141, 41);
		contentPane.add(btnEditParticipants);
		
		JLabel lblddmmyyyy = new JLabel("(DD.MM.YYYY)");
		lblddmmyyyy.setBounds(46, 141, 70, 14);
		contentPane.add(lblddmmyyyy);
		
		setVisible(true);
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 int flag=0;
				A.get(i).cname=textFieldCname.getText();
				try{
					A.get(i).fee=Integer.parseInt(textFieldCfee.getText());
					flag++;
				}
				catch(Exception e){
					Error_frame errFrame=new Error_frame("Fee must be an integer");
					errFrame.btnNewButton.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent arg0){
							errFrame.setVisible(false);
						}
					});
				}
				A.get(i).duration=textFieldCduration.getText();
				try {
					A.get(i).date=ft.parse(textFieldCdate.getText());
					flag++;
				}
				catch (ParseException e) {
					Error_frame errFrame=new Error_frame("Date format incorrect");
					errFrame.btnNewButton.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent arg0){
							errFrame.setVisible(false);
						}
					});
				}
				if(flag==2)setVisible(false);
			}
		});
		
		btnAddCoordi.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				coordinator_frame coordiframeObj=new coordinator_frame();
				coordiframeObj.setVisible(true);
				coordiframeObj.btnSave.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent arg0){
						A.get(i).coordiObj.name=coordiframeObj.textFieldCoordi_name.getText();
						A.get(i).coordiObj.dept=coordiframeObj.textFieldCoordi_dept.getText();
						A.get(i).coordiObj.address=coordiframeObj.textField_Coordi_address.getText();
						A.get(i).coordiObj.mobile=coordiframeObj.textFieldCoordi_mobile.getText();
						A.get(i).coordiObj.email=coordiframeObj.textFieldCoordi_email.getText();
						coordiframeObj.setVisible(false);
						setVisible(false);
					}
			});
			}
		});
		
		btnAddFaculty.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				faculty_frame facFrame=new faculty_frame();
				facFrame.setVisible(true);
				facFrame.btnSave.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent arg0){
						info2 facObj=new info2();
						facObj.name=facFrame.textFieldFaculty_name.getText();
						facObj.dept=facFrame.textFieldFaculty_dept.getText();
						facObj.address=facFrame.textFieldFaculty_address.getText();
						facObj.mobile=facFrame.textFieldFaculty_mobile.getText();
						facObj.email=facFrame.textFieldFaculty_email.getText();
						if(A.get(i).facList.size()>=5){
							Error_frame errFrame=new Error_frame("Max. 5 Faculty Allowed");
							errFrame.setVisible(true);
							errFrame.btnNewButton.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent arg0){
									errFrame.setVisible(false);
									facFrame.setVisible(false);
								}
							});
						}
						else A.get(i).facList.add(facObj);
						facFrame.setVisible(false);
						//setVisible(false);
					}
				});
			}
		});
		
		
		btnAddParticipants.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				participants_frame partiFrame=new participants_frame();
				partiFrame.setVisible(true);
				partiFrame.btnSave.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent arg0){
						info2 studObj=new info2();
						studObj.name=partiFrame.textFieldParticipant_name.getText();
						studObj.organisation=partiFrame.textFieldParticipant_organisation.getText();
						studObj.address=partiFrame.textFieldParticipant_address.getText();
						studObj.mobile=partiFrame.textFieldParticipant_mobile.getText();
						studObj.email=partiFrame.textFieldParticipant_email.getText();
						if(A.get(i).studList.size()>=5){
							Error_frame errFrame=new Error_frame("Max. 5 Participants Allowed");
							errFrame.setVisible(true);
							errFrame.btnNewButton.addActionListener(new ActionListener(){
								public void actionPerformed(ActionEvent arg0){
									errFrame.setVisible(false);
									partiFrame.setVisible(false);
								}
							});
						}
						else A.get(i).studList.add(studObj);
						partiFrame.setVisible(false);
						//setVisible(false);
					}
				});
			}
		});
		
		btneditCoordinator.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				EditCoordi_frame editCoordi=new EditCoordi_frame(A,i);
				//setVisible(false);
			}
		});
		
		btnEditParticipants.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					Display_participants_frame_combBox partiFrame=new Display_participants_frame_combBox(A,i);
					partiFrame.setVisible(true);	
					partiFrame.btnOk.addActionListener(new ActionListener(){
						
						public void actionPerformed(ActionEvent arg0){
							j=partiFrame.comboBox.getSelectedIndex();
							Edit_participants_frame editpartiFrame=new Edit_participants_frame(A,i,j);
							partiFrame.setVisible(false);
							//setVisible(false);
						}
					});
			}
		});
		
		btnEditFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					Display_frame_faculty_comboBox facultyFrame=new Display_frame_faculty_comboBox(A,i);
					facultyFrame.setVisible(true);	
					facultyFrame.btnOk.addActionListener(new ActionListener(){
						
						public void actionPerformed(ActionEvent arg0){
							j=facultyFrame.comboBox.getSelectedIndex();
							Edit_faculty_frame editfacultyFrame=new Edit_faculty_frame(A,i,j);
							facultyFrame.setVisible(false);
							//setVisible(false);
						}
					});
			}
		});
		
		
	}
}
