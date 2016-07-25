package assignment1_q1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.ScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Deletecourse_frame extends JFrame {
	private int i;
	private JPanel contentPane;
	String[] courseName = new String[65];

	/**
	 * Launch the application.
	 */

	
	/**
	 * Create the frame.
	 */
	
	
	public Deletecourse_frame(ArrayList<create_course> A) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		
		for(i=0;i<A.size();i++){
			courseName[i]=A.get(i).getCname();
		}
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox(courseName);
		comboBox.setBounds(118, 38, 177, 34);
		contentPane.add(comboBox);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				A.remove(comboBox.getSelectedIndex());
				setVisible(false);
			}
		});
		
		btnDelete.setBounds(10, 172, 399, 58);
		contentPane.add(btnDelete);
		
	}
}
