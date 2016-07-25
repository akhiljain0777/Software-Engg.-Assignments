package assignment1_q1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class DisplayCoordinator_frame extends JFrame {
	private int i,j,k;
	private JPanel contentPane,contentPane1;
	String[] courseName = new String[65];
	private JTextArea btnName;
	String temp;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public DisplayCoordinator_frame(ArrayList<create_course> A) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		Displaycourses_frame_comboBox courseFrame=new Displaycourses_frame_comboBox(A);
		courseFrame.setTitle("Coordinator");
		courseFrame.setVisible(true);;
		
		courseFrame.btnSelectCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				k=courseFrame.comboBox.getSelectedIndex();
				btnName = new JTextArea("\nCOORDINATOR" +"\nName :"+A.get(k).coordiObj.name+"\nDepartment: "+A.get(k).coordiObj.dept+"\nAddress: "+A.get(k).coordiObj.address+"\nMobile: "+A.get(k).coordiObj.mobile+"\nEmail Address: "+A.get(k).coordiObj.email);
				btnName.setFont(new Font("Tahoma", Font.PLAIN, 16));
				btnName.setEditable(false);
				btnName.setBounds(75, j, 350, 200);
				contentPane.add(btnName);
				
				setVisible(true);
				courseFrame.setVisible(false);
			}
		});
		
	}
}
