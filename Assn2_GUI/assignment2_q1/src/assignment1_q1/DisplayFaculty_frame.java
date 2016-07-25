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

public class DisplayFaculty_frame extends JFrame {
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
	public DisplayFaculty_frame(ArrayList<create_course> A) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 558, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		Displaycourses_frame_comboBox courseFrame=new Displaycourses_frame_comboBox(A);
		courseFrame.setVisible(true);;
		
		courseFrame.btnSelectCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				k=courseFrame.comboBox.getSelectedIndex();
				j=19;
				for(i=0;i<A.get(k).facList.size();i++){
					btnName = new JTextArea("Name :"+A.get(k).facList.get(i).name+"\nDepartment: "+A.get(k).facList.get(i).dept+"\nAddress: "+A.get(k).facList.get(i).address+"\nMobile: "+A.get(k).facList.get(i).mobile+"\nEmail Address: "+A.get(k).facList.get(i).email);
					btnName.setFont(new Font("Tahoma", Font.PLAIN, 14));
					btnName.setEditable(false);
					btnName.setBounds(75, j, 350, 95);
					contentPane.add(btnName);
					j+=120;
				}
				setVisible(true);
				courseFrame.setVisible(false);
			}
		});
		
	}
}
