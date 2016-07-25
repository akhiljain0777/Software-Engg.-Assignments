package assignment1_q1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Display_frame_faculty_comboBox extends JFrame {
	
	private int j;
	private JPanel contentPane;
	private String[] temp=new String[65];
	public JButton btnOk;
	public JComboBox comboBox;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Display_frame_faculty_comboBox(ArrayList<create_course>A,int i) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 435, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		btnOk = new JButton("Select a Participant");
		btnOk.setBounds(123, 210, 166, 23);
		contentPane.add(btnOk);
		
		for(j=0;j<A.get(i).facList.size();j++){
			temp[j]=A.get(i).facList.get(j).name;
			
		}
		comboBox = new JComboBox(temp);
		comboBox.setBounds(69, 64, 279, 26);
		contentPane.add(comboBox);
		
		
		
	}
}
