package assignment1_q1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Displaycourses_frame extends JFrame {
	private int i,j,temp;
	private JPanel contentPane;
	private JTextField textField;
	public JTextArea btnName;
	//public ArrayList<JButton>btn=new ArrayList<JButton>(15);
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	
	private boolean isExpired(List<create_course>A,int i){
		Date today=new Date();
		long diff=today.getTime()-((A.get(i)).date).getTime();
		int days = (int) (diff / (1000*60*60*24));
		if(days<=365*(temp) && days>=365*(temp-1)){
			return true;
		}
		else return false;
		
	}
	
	
	public Displaycourses_frame(ArrayList<create_course>A) {
		setTitle("Display Courses");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 618,890);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Display_years displayYear=new Display_years();
		displayYear.setVisible(true);
		
		displayYear.getBtnOk().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				temp=displayYear.getComboBox().getSelectedIndex();
				displayYear.setVisible(false);
				setDisplay(A);
				setVisible(true);
			}
		});
		
	/*	j=19;
		for(i=0;i<A.size();i++){	
			if(isExpired(A,i,temp)){
				btnName = new JTextArea("Course Name: "+A.get(i).getCname()+"\nCourse Fee: "+A.get(i).fee+"\nStart Date: "+A.get(i).getDate()+"\nDuration: "+A.get(i).getDuration());
				btnName.setFont(new Font("Tahoma", Font.PLAIN, 10));
				btnName.setBounds(75, j, 350, 60);
				btnName.setEditable(false);
				contentPane.add(btnName);
				j+=60;
			}
		}*/
		
	}
	
	void setDisplay(ArrayList<create_course> A){
		j=19;
		for(i=0;i<A.size();i++){	
			if(isExpired(A,i)){
				btnName = new JTextArea("Course Name: "+A.get(i).getCname()+"\nCourse Fee: "+A.get(i).fee+"\nStart Date: "+A.get(i).getDate()+"\nDuration: "+A.get(i).getDuration());
				btnName.setFont(new Font("Tahoma", Font.PLAIN, 10));
				btnName.setBounds(75, j, 350, 60);
				btnName.setEditable(false);
				contentPane.add(btnName);
				j+=60;
			}
		}
	}
}
