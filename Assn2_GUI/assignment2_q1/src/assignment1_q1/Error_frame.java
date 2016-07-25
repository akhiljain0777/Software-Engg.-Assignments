package assignment1_q1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Error_frame extends JFrame {

	private JPanel contentPane;
	public JButton btnNewButton;

	public Error_frame(String errMsg) {
		setTitle("Error");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 520, 129);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(errMsg);
		lblNewLabel.setBounds(50, 11, 406, 25);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("OK");
		btnNewButton.setBounds(177, 47, 89, 23);
		contentPane.add(btnNewButton);
		setVisible(true);
	}

}
