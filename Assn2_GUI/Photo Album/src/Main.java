import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class Main {
	static ArrayList<info> imageList=new ArrayList<info>(10);
	public static void main(String[] args){
		Main_frame mainFrame=new Main_frame();
		mainFrame.setVisible(true);
		
	
		mainFrame.getBtnNewButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(imageList.size()>=10){
					Error newErr=new Error("Max 10 Photos Allowed");
					newErr.setVisible(true);
				}
				else{
					Image_frame imgFrame=new Image_frame(imageList);
					imgFrame.setVisible(true);
				}
			}
		});
		
		mainFrame.getBtnDisplayImage().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Display_image yo = new Display_image(imageList);
				yo.setVisible(true);
			}
		});
		
		mainFrame.getBtnDisplayImagesbyTitle().addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Display_By_Title displayByTitle=new Display_By_Title(imageList);
				displayByTitle.setVisible(true);
			}
		});
		
		mainFrame.getBtnSaveDataTo().addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			try{
				String filename="data.ser";
		         ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
		         out.writeObject(imageList);
		         out.close();
		         //fileOut.close();
		      }
			  catch(IOException arg0)
		      {
		      }
			}
		});
		
		mainFrame.getBtnReadDataFrom().addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try {
					ObjectInputStream is=new ObjectInputStream(new FileInputStream("data.ser"));
					imageList=(ArrayList<info>)is.readObject();
				} 
				catch (FileNotFoundException arg0) {
					// TODO Auto-generated catch block
					
				} 
				catch (IOException arg1) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
				catch(ClassNotFoundException c)
			      {
			         //System.out.println("Class not found");
			         //c.printStackTrace();
			         return;
			      }
			}
		});
	
	}
}
