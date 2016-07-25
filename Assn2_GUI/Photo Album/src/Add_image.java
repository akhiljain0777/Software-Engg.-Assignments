import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add_image extends JFrame {

	private JPanel contentPane;
	public JFileChooser chooser;
	private JLabel label;
	private JButton btnOk;
	private ImageIcon image;
	/**
	 * Launch the application.
	 */

	
	public void setImage(ImageIcon image) {
		this.image = image;
	}
	
	public ImageIcon getIcon(){
		return image;
	}

	/**
	 * Create the frame.
	 */
	
	public Add_image() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 406, 136);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 chooser= new JFileChooser();
         chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
         //filter the files
         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
         chooser.addChoosableFileFilter(filter);
         contentPane.add(chooser);
         
       
           
        
        
         int result = chooser.showSaveDialog(null);
         
         if(result == JFileChooser.APPROVE_OPTION){
             File selectedFile = chooser.getSelectedFile();
             String ImagePath = selectedFile.getAbsolutePath();
           
             ImageIcon MyImage = new ImageIcon(ImagePath); 
             Image img1 = MyImage.getImage(); 
             
             
             label = new JLabel("No Image Added, User cancelled the operation");
             label.setBounds(20, 220, 450, 250);
             Image newImg = img1.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH); 
             image = new ImageIcon(newImg);
             label.setIcon(image);
             
             //contentPane.add(label);
         }
      
         setVisible(false);
         
         
      }
		
	public JLabel getImage(){
		return  label;
	}
	
}
