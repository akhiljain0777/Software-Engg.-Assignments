package assignment1_q1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start_frame extends JFrame {

	public JPanel contentPane;
	public JButton btnCreate_course,btnDisplayCourse;
	public JButton btnDeleteACourse,btnDisplayParticipants;
	public JButton btnEditCourseDetails;
	public JButton btnDeleteParticipant;
	public JButton btnDeleteAFaculty;
	public JButton btnSaveDataTo;
	public JButton btnReadDataFrom;
	public JButton btnDisplayFaculty;
	public JButton btnDisplayCoordinator;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Start_frame() {
		super("Short Term Course Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCreate_course = new JButton("Create Course");
		btnCreate_course.setBounds(36, 21, 220, 23);
		contentPane.add(btnCreate_course);
		
		btnDisplayCourse = new JButton("Display Course");
		btnDisplayCourse.setBounds(36, 59, 220, 23);
		contentPane.add(btnDisplayCourse);
		
		btnDeleteACourse = new JButton("Delete a Course");
		
		btnDeleteACourse.setBounds(36, 97, 220, 23);
		contentPane.add(btnDeleteACourse);
		
		btnDisplayParticipants = new JButton("Display Participants");
		btnDisplayParticipants.setBounds(36, 134, 220, 23);
		contentPane.add(btnDisplayParticipants);
		
		btnEditCourseDetails = new JButton("Edit Course Details");
		btnEditCourseDetails.setBounds(36, 245, 220, 23);
		contentPane.add(btnEditCourseDetails);
		
		btnDeleteParticipant = new JButton("Delete a Participant");
		btnDeleteParticipant.setBounds(36, 282, 220, 23);
		contentPane.add(btnDeleteParticipant);
		
		btnDeleteAFaculty = new JButton("Delete a Faculty");
		btnDeleteAFaculty.setBounds(36, 319, 220, 23);
		contentPane.add(btnDeleteAFaculty);
		
		btnSaveDataTo = new JButton("Save  Data to a file");
		btnSaveDataTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSaveDataTo.setBounds(36, 356, 220, 23);
		contentPane.add(btnSaveDataTo);
		
		btnReadDataFrom = new JButton("Read data from saved file");
		btnReadDataFrom.setBounds(36, 388, 220, 23);
		contentPane.add(btnReadDataFrom);
		
		btnDisplayFaculty = new JButton("Display Faculty");
		btnDisplayFaculty.setBounds(36, 171, 220, 23);
		contentPane.add(btnDisplayFaculty);
		
		btnDisplayCoordinator = new JButton("Display Coordinator");
		btnDisplayCoordinator.setBounds(36, 208, 220, 23);
		contentPane.add(btnDisplayCoordinator);
	}
}
