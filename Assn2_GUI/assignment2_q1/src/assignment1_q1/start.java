package assignment1_q1;


import java.util.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class start {
	Date date=new Date();
	public static int tmp,i,j,cnt,temp;
	private int flag=1;
	public static ArrayList<create_course> A = new ArrayList<create_course>(65);
	
	public static void  main(String[] args){
		
		Start_frame startFrame=new Start_frame();
		startFrame.setVisible(true);
		
		startFrame.btnCreate_course.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				cnt=0;
				create_course courseObj=new create_course();
				courseObj.setCourse();
				if(A.size()<50){
					A.add(courseObj);
				}
				else{
					Error_frame errFrame=new Error_frame("Max. 50 courses allowed");
					errFrame.btnNewButton.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent arg0){
							errFrame.setVisible(false);
						}
					});
				}
			}
		});
		
		startFrame.btnDisplayCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Displaycourses_frame Display_frame=new Displaycourses_frame(A);
			//	Display_frame.setVisible(true);
			}
		});
		
		startFrame.btnDeleteACourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				Deletecourse_frame deleteFrame=new Deletecourse_frame(A);
				deleteFrame.setVisible(true);
			}
		});
		
		startFrame.btnDisplayParticipants.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				DisplayParticipants_frame displayPartiFrame=new DisplayParticipants_frame(A);
			}
		});
		
		startFrame.btnDisplayFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				DisplayFaculty_frame displayFacFrame=new DisplayFaculty_frame(A);
			}
		});
		
		startFrame.btnDisplayCoordinator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				DisplayCoordinator_frame displayCoordiFrame=new DisplayCoordinator_frame(A);
			}
		});
		
		startFrame.btnEditCourseDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				EditCourse_frame editFrame=new EditCourse_frame(A);
				editFrame.setVisible(false);
			}
		});
		
		startFrame.btnDeleteParticipant.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Displaycourses_frame_comboBox displayCourse=new Displaycourses_frame_comboBox(A);
				displayCourse.setVisible(true);
				displayCourse.btnSelectCourse.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						i=displayCourse.comboBox.getSelectedIndex();
						Display_participants_frame_combBox partiFrame=new Display_participants_frame_combBox(A,i);
						partiFrame.setVisible(true);
						partiFrame.btnOk.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								j=partiFrame.comboBox.getSelectedIndex();
								A.get(i).studList.remove(j);
								partiFrame.setVisible(false);
							}
						});
						displayCourse.setVisible(false);
					}
				});
			}
		});
		
		startFrame.btnDeleteAFaculty.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Displaycourses_frame_comboBox displayCourse=new Displaycourses_frame_comboBox(A);
				displayCourse.setVisible(true);
				displayCourse.btnSelectCourse.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						i=displayCourse.comboBox.getSelectedIndex();
						Display_frame_faculty_comboBox facultyFrame=new Display_frame_faculty_comboBox(A,i);
						facultyFrame.setVisible(true);
						facultyFrame.btnOk.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e){
								j=facultyFrame.comboBox.getSelectedIndex();
								A.get(i).facList.remove(j);
								facultyFrame.setVisible(false);
							}
						});
						displayCourse.setVisible(false);
					}
				});
			}
		});
		
		
		startFrame.btnSaveDataTo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				try
			      {
			         String filename="data.ser";
			         ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
			         out.writeObject(A);
			         out.close();
			         //fileOut.close();
			      }
				  catch(IOException e)
			      {
			          e.printStackTrace();
			      }
			}
		});
		
		startFrame.btnReadDataFrom.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				try {
					ObjectInputStream is=new ObjectInputStream(new FileInputStream("data.ser"));
					A=(ArrayList<create_course>)is.readObject();
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
			        // System.out.println("Class not found");
			         c.printStackTrace();
			         return;
			      }
			}
		});
		
	}
}
