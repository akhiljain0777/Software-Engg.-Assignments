import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class Display_image extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JTextArea textAreaTitle;
	private JTextArea textAreaAnnotation;
	private int i;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Display_image(ArrayList<info>imageList) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 535, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Title");
		lblNewLabel.setBounds(63, 21, 138, 27);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblNewLabel);
		
		textAreaTitle = new JTextArea();
		textAreaTitle.setBounds(174, 24, 152, 22);
		
		
		JLabel lblAnnotations = new JLabel("Annotation");
		lblAnnotations.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblAnnotations.setBounds(52, 104, 138, 27);
		contentPane.add(lblAnnotations);
		
		JButton btnNext = new JButton("Next");
		btnNext.setForeground(Color.WHITE);
		btnNext.setBackground(Color.BLACK);
		btnNext.setBounds(393, 501, 116, 44);
		contentPane.add(btnNext);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.WHITE);
		btnBack.setBackground(Color.BLACK);
		btnBack.setBounds(25, 501, 116, 44);
		contentPane.add(btnBack);
		
		textAreaAnnotation = new JTextArea();
		textAreaAnnotation.setBounds(174, 77, 192,100);
		
		
		label=new JLabel();
		label.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		label.setBounds(20, 220, 450, 250);
		
		textAreaTitle.setText(imageList.get(i).getTitle());
		textAreaAnnotation.setText(imageList.get(i).getAnnotation());
		label.setIcon(imageList.get(i).getIcon());
		contentPane.add(label);
		contentPane.add(textAreaAnnotation);
		contentPane.add(textAreaTitle);
		
		
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(imageList.size() <= i+1){
					setVisible(false);
				}
				else{
					i++;
					textAreaTitle.setText(imageList.get(i).getTitle());
					textAreaAnnotation.setText(imageList.get(i).getAnnotation());
					label.setIcon(imageList.get(i).getIcon());
				}
			}
		});
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(i==0){
					setVisible(false);
				}
				
				else{
					i--;
					textAreaTitle.setText(imageList.get(i).getTitle());
					textAreaAnnotation.setText(imageList.get(i).getAnnotation());
					label.setIcon(imageList.get(i).getIcon());
				}
			}
		});
	}
	
	void setImage()
	{
	
	}
}
