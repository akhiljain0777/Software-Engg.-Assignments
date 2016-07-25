import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Image_frame extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Image_frame(ArrayList<info>imageList) {
		setTitle("New Image");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Title");
		lblNewLabel.setBounds(63, 21, 138, 27);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblNewLabel);
		
		JTextField textAreaTitle = new JTextField();
		textAreaTitle.setBounds(174, 24, 199, 22);
		contentPane.add(textAreaTitle);
		
		JLabel lblAnnotations = new JLabel("Annotations");
		lblAnnotations.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblAnnotations.setBounds(63, 74, 138, 27);
		contentPane.add(lblAnnotations);
		
		JTextArea textAreaAnnotation = new JTextArea();
		textAreaAnnotation.setBounds(174, 77, 199, 90);
		contentPane.add(textAreaAnnotation);
		
		JLabel lblmax = new JLabel("(Max 20 chars )");
		lblmax.setBounds(63, 47, 85, 14);
		contentPane.add(lblmax);
		
		JLabel lblmaxChars = new JLabel("(Max 100 chars )");
		lblmaxChars.setBounds(63, 101, 85, 14);
		contentPane.add(lblmaxChars);
		
		JButton btnBrowse = new JButton("Browse and Save");
		btnBrowse.setBounds(117, 203, 183, 47);
		contentPane.add(btnBrowse);
	
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int flag=0;
				Add_image addImage=new Add_image();
				addImage.setVisible(false);
				info newImage=new info();
				if(textAreaTitle.getText().length()>20){
					Error newErr=new Error("Max. 20 characters are allowed in title");
					newErr.setVisible(true);
				}
				else{
					newImage.setTitle(textAreaTitle.getText());
					flag++;
				}
				if(textAreaAnnotation.getText().length()>100){
					Error newErr=new Error("Max. 100 characters are allowed in Annotation");
					newErr.setVisible(true);
				}
				else{
					newImage.setAnnotation(textAreaAnnotation.getText());
					flag++;
				}
				newImage.setImage(addImage.getImage());
				newImage.setIcon(addImage.getIcon());
				if(flag==2){
					imageList.add(newImage);
					setVisible(false);
				}
			}
		});
		
		
	}
}
