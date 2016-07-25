import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Choose_frame extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea_1;
	public JFileChooser chooser;
	private File file;
	private JLabel label;
	BufferedImage img;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Choose_frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		chooser = new JFileChooser();
	    FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
	    chooser.setFileFilter(filter);
		
	    JFileChooser filechooser= new JFileChooser();
	    filechooser.setDialogTitle("Choose Your File");
	    filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
	    //below codes for select  the file 
	    int returnval=filechooser.showOpenDialog(this);
	    if(returnval==JFileChooser.APPROVE_OPTION)
	    {
	        File file = filechooser.getSelectedFile();
	        BufferedImage bi;
	        try
	        {   //display the image in jlabel
	            bi=ImageIO.read(file);
	            label.setIcon(new ImageIcon(bi));
	        }
	        catch(IOException e)
	        {
	        	System.out.print("asm");
	        }
	        this.pack();
	    }
	    
	    
	}

}
