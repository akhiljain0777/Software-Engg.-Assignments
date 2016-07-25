import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Display_By_Title extends JFrame {

	private JPanel contentPane;
	private String[] temp=new String[10];
	private int i;
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public Display_By_Title(ArrayList<info> imageList) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		for(i=0;i<imageList.size();i++){
			temp[i]=imageList.get(i).getTitle();
		}
		
		JComboBox comboBox = new JComboBox(temp);
		comboBox.setBounds(98, 43, 236, 33);
		contentPane.add(comboBox);
		
		JButton btnView = new JButton("View Image");
		btnView.setBackground(Color.BLACK);
		btnView.setForeground(Color.WHITE);
		btnView.setBounds(138, 132, 159, 23);
		contentPane.add(btnView);
		
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				i=comboBox.getSelectedIndex();
				Display_by_index byIndex=new Display_by_index(i,imageList);
				byIndex.setVisible(true);
			}
		});
		
	}
}
