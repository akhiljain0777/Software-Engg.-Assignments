package assignment1_q1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Displaycourses_frame_comboBox extends JFrame {

	private int i,j;
	private JPanel contentPane;
	String[] courseName = new String[65];
	public JButton btnSelectCourse;
	public JComboBox comboBox;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	
	
	
	public Displaycourses_frame_comboBox(ArrayList<create_course>A) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 435, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		

		for(i=0;i<A.size();i++){
			courseName[i]=A.get(i).getCname();
		}
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		comboBox = new JComboBox(courseName);
		comboBox.setBounds(118, 38, 177, 34);
		contentPane.add(comboBox);
		
		btnSelectCourse = new JButton("Select a Course");
		btnSelectCourse.setBounds(80, 148, 258, 23);
		contentPane.add(btnSelectCourse);
		
		
	}

}
