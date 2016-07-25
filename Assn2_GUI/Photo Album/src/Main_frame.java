import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main_frame extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnDisplayImage;
	private JButton btnDisplayImagesbyTitle;
	private JButton btnSaveDataTo;

	public JButton getBtnSaveDataTo() {
		return btnSaveDataTo;
	}



	public void setBtnSaveDataTo(JButton btnSaveDataTo) {
		this.btnSaveDataTo = btnSaveDataTo;
	}



	public JButton getBtnReadDataFrom() {
		return btnReadDataFrom;
	}



	public void setBtnReadDataFrom(JButton btnReadDataFrom) {
		this.btnReadDataFrom = btnReadDataFrom;
	}

	private JButton btnReadDataFrom;
	/**
	 * Launch the application.
	 */
	
	

	public JButton getBtnNewButton() {
		return btnNewButton;
	}



	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}



	public JButton getBtnDisplayImage() {
		return btnDisplayImage;
	}



	public void setBtnDisplayImage(JButton btnDisplayImage) {
		this.btnDisplayImage = btnDisplayImage;
	}

	public JButton getBtnDisplayImagesbyTitle() {
		return btnDisplayImagesbyTitle;
	}



	public void setBtnDisplayImagesbyTitle(JButton btnDisplayImagesbyTitle) {
		this.btnDisplayImagesbyTitle = btnDisplayImagesbyTitle;
	}

	/**
	 * Create the frame.
	 */
	public Main_frame() {
		setTitle("Album");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Add Image");
		btnNewButton.setBounds(80, 11, 244, 30);
		contentPane.add(btnNewButton);
		
		btnDisplayImage = new JButton("Display Image");
		btnDisplayImage.setBounds(80, 53, 244, 30);
		contentPane.add(btnDisplayImage);
		
		btnDisplayImagesbyTitle = new JButton("Display Images(By Title)");
		btnDisplayImagesbyTitle.setBounds(80, 96, 244, 30);
		contentPane.add(btnDisplayImagesbyTitle);
		
		btnSaveDataTo = new JButton("Save Data to a file");
		btnSaveDataTo.setBounds(80, 139, 244, 30);
		contentPane.add(btnSaveDataTo);
		
		btnReadDataFrom = new JButton("Read Data from a file");
		btnReadDataFrom.setBounds(80, 182, 244, 30);
		contentPane.add(btnReadDataFrom);
	}



	

}
