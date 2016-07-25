package assignment1_q1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Display_years extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Display_years() {
		setTitle("Year Select");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] temp = new String[5];
		temp[4]="2012-2013";
		temp[3]="2013-2014";
		temp[2]="2014-2015";
		temp[1]="2015-2016";
		temp[0]="2016-2017";
		
		comboBox = new JComboBox(temp);
		comboBox.setBounds(120, 39, 182, 29);
		contentPane.add(comboBox);
		
		btnOk = new JButton("OK");
		btnOk.setBounds(171, 125, 89, 23);
		contentPane.add(btnOk);
		
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JButton getBtnOk() {
		return btnOk;
	}

	public void setBtnOk(JButton btnOk) {
		this.btnOk = btnOk;
	}
}
