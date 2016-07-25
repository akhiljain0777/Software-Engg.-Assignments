import java.awt.EventQueue;
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
	static Contact_list_frame frame = new Contact_list_frame();
	static Total_info allInfo=new Total_info();
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame.setVisible(true);
					frame.button_3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							allInfo.setRelList(frame.getRelList());
							allInfo.setProfList(frame.getProfList());
							allInfo.setPersonalList(frame.getPersonalList());
							allInfo.setCasualList(frame.getCasualList());
							try
						      {
						         String filename="data.ser";
						         ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
						         out.writeObject(allInfo);
						         out.close();
						         //fileOut.close();
						      }
							  catch(IOException e)
						      {
						          e.printStackTrace();
						      }
						}
					});
					
					frame.button_4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							try {
								ObjectInputStream is=new ObjectInputStream(new FileInputStream("data.ser"));
								allInfo=(Total_info)is.readObject();
								frame.setRelList(allInfo.getRelList());
								frame.setProfList(allInfo.getProfList());
								frame.setPersonalList(allInfo.getPersonalList());
								frame.setCasualList(allInfo.getCasualList());
							} 
							catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} 
							catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							catch(ClassNotFoundException c)
						      {
						         System.out.println("Class not found");
						         c.printStackTrace();
						         return;
						      }
						}
					});
					
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
