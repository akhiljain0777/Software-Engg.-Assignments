package assignment1_q1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EditCourse_frame extends JFrame {
	private int i,j,k;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public EditCourse_frame(ArrayList<create_course>A) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 435, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Displaycourses_frame_comboBox courseFrame=new Displaycourses_frame_comboBox(A);
		courseFrame.setVisible(true);
		
		courseFrame.btnSelectCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				i=courseFrame.comboBox.getSelectedIndex();
				EditCourse_frame2 courseFrame2=new EditCourse_frame2(A,i);
			
			}
		});
	}

}
