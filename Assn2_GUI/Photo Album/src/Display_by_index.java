import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Display_by_index extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Display_by_index(int i,ArrayList<info> imageList) {
		setForeground(Color.WHITE);
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
		
		JTextArea textAreaTitle = new JTextArea();
		textAreaTitle.setBounds(174, 24, 152, 22);
		
		
		JLabel lblAnnotations = new JLabel("Annotation");
		lblAnnotations.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblAnnotations.setBounds(52, 104, 138, 27);
		contentPane.add(lblAnnotations);
		
		/*JButton btnNext = new JButton("Next");
		btnNext.setBackground(Color.BLACK);
		btnNext.setBounds(393, 362, 116, 44);
		contentPane.add(btnNext);*/
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.WHITE);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnBack.setBackground(Color.BLACK);
		btnBack.setBounds(209, 518, 116, 44);
		contentPane.add(btnBack);
		
		JTextArea textAreaAnnotation = new JTextArea();
		textAreaAnnotation.setBounds(174, 77, 192,100);
		
		
		JLabel label=new JLabel();
		label.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		label.setBounds(20, 220, 450, 250);
		
		
		textAreaTitle.setText(imageList.get(i).getTitle());
		textAreaAnnotation.setText(imageList.get(i).getAnnotation());
		label=imageList.get(i).getImage();
		contentPane.add(label);
		contentPane.add(textAreaAnnotation);
		contentPane.add(textAreaTitle);
		
	}

}
