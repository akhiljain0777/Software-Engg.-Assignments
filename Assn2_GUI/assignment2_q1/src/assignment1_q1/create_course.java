package assignment1_q1;

import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.lang.String;

public class create_course implements Serializable {
	public String cname,duration,time_pass;
	public int fee,tmp,i;
	public SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");
	public Date date=new Date();
	info2 coordiObj=new info2();
	public List<info2>facList=new ArrayList(5);
	public List<info2>studList=new ArrayList(5);
	createcourse_frame courseframeObj=new createcourse_frame();

	public void setCourse(){
		createcourse_frame courseframeObj=new createcourse_frame();
		courseframeObj.setVisible(true);
		
		courseframeObj.btnAddCoordi.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				setCoordi();
			}
		});
		
		courseframeObj.btnAddFaculty.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				setFaculty();
			}
		});
		
		courseframeObj.btnAddParticipants.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				setStudents();
			}
		});
		
		courseframeObj.btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int flag=0;
				if((courseframeObj.textFieldCname.getText()).compareTo("")!=0)cname=courseframeObj.textFieldCname.getText();
				if((courseframeObj.textFieldCfee.getText()).compareTo("")!=0){
					try{
						fee=Integer.parseInt(courseframeObj.textFieldCfee.getText());
						flag++;
					}
					catch(Exception e){
						Error_frame errFrame=new Error_frame("Fee must be an integer");
						errFrame.btnNewButton.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent arg0){
								errFrame.setVisible(false);
							}
						});
					}
					//courseframeObj.setVisible(false);
				}
				try {
					if((courseframeObj.textFieldCdate.getText()).compareTo("")!=0)date=ft.parse(courseframeObj.textFieldCdate.getText());
					flag++;
				}
				catch (ParseException e) {
					Error_frame errFrame=new Error_frame("Date Input Incorrect,Date not stored");
					errFrame.btnNewButton.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent arg0){
							errFrame.setVisible(false);
						}
					});
				}
				if((courseframeObj.textFieldCname.getText()).compareTo("")!=0)duration=courseframeObj.textFieldCduration.getText();
				if(flag==2)courseframeObj.setVisible(false);
			}
		});
		
	}
	
	
	public String getCname(){
		return cname;
	}
	
	public int getFee(){
		return fee;
	}
	
	
	
	public String getDate(){
		return ft.format(date);
	}
	
	public Date getDateObj(){
		return date;
	}
	
	public String getDuration(){
		return duration;
	}
	
	public void setCoordi(){
		coordinator_frame coordiframeObj=new coordinator_frame();
		coordiframeObj.setVisible(true);
		
		coordiframeObj.btnSave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				if((coordiframeObj.textFieldCoordi_name.getText()).compareTo("")!=0)coordiObj.name=coordiframeObj.textFieldCoordi_name.getText();
				if((coordiframeObj.textFieldCoordi_dept.getText()).compareTo("")!=0)coordiObj.dept=coordiframeObj.textFieldCoordi_dept.getText();
				if((coordiframeObj.textField_Coordi_address.getText()).compareTo("")!=0)coordiObj.address=coordiframeObj.textField_Coordi_address.getText();
				if((coordiframeObj.textFieldCoordi_mobile.getText()).compareTo("")!=0)coordiObj.mobile=coordiframeObj.textFieldCoordi_mobile.getText();
				if((coordiframeObj.textFieldCoordi_email.getText()).compareTo("")!=0)coordiObj.email=coordiframeObj.textFieldCoordi_email.getText();

				coordiframeObj.setVisible(false);
			}
		});
		
	}
	public info2 getCoordi(){
		return coordiObj;
	}
	
	public void setFaculty(){
		info2 facObj=new info2();
		faculty_frame facultyframeObj=new faculty_frame();
		facultyframeObj.setVisible(true);
		
		facultyframeObj.btnSave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				if((facultyframeObj.textFieldFaculty_name.getText()).compareTo("")!=0)facObj.name=facultyframeObj.textFieldFaculty_name.getText();
				if((facultyframeObj.textFieldFaculty_dept.getText()).compareTo("")!=0)facObj.dept=facultyframeObj.textFieldFaculty_dept.getText();
				if((facultyframeObj.textFieldFaculty_address.getText()).compareTo("")!=0)facObj.address=facultyframeObj.textFieldFaculty_address.getText();
				if((facultyframeObj.textFieldFaculty_mobile.getText()).compareTo("")!=0)facObj.mobile=facultyframeObj.textFieldFaculty_mobile.getText();
				if((facultyframeObj.textFieldFaculty_email.getText()).compareTo("")!=0)facObj.email=facultyframeObj.textFieldFaculty_email.getText();

				facultyframeObj.setVisible(false);
			}
		});
		if(facList.size()>=5){
			Error_frame errFrame=new Error_frame("Max. 5 Faculty Allowed");
			errFrame.setVisible(true);
			errFrame.btnNewButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					errFrame.setVisible(false);
					facultyframeObj.setVisible(false);
				}
			});
		}
		else facList.add(facList.size(),facObj);
	}
	
	public void setStudents(){
		info2 studObj=new info2();
		participants_frame partiframeObj=new participants_frame();
		partiframeObj.setVisible(true);
		
		partiframeObj.btnSave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				if((partiframeObj.textFieldParticipant_name.getText()).compareTo("")!=0)studObj.name=partiframeObj.textFieldParticipant_name.getText();
				if((partiframeObj.textFieldParticipant_organisation.getText()).compareTo("")!=0)studObj.organisation=partiframeObj.textFieldParticipant_organisation.getText();
				if((partiframeObj.textFieldParticipant_address.getText()).compareTo("")!=0)studObj.address=partiframeObj.textFieldParticipant_address.getText();
				if((partiframeObj.textFieldParticipant_mobile.getText()).compareTo("")!=0)studObj.mobile=partiframeObj.textFieldParticipant_mobile.getText();
				if((partiframeObj.textFieldParticipant_email.getText()).compareTo("")!=0)studObj.email=partiframeObj.textFieldParticipant_email.getText();

				partiframeObj.setVisible(false);
			}
		});
		
		if(studList.size()>=5){
			Error_frame errFrame=new Error_frame("Max. 5 Participants Allowed");
			errFrame.setVisible(true);
			errFrame.btnNewButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					errFrame.setVisible(false);
					partiframeObj.setVisible(false);
				}
			});
		}
		else studList.add(studList.size(),studObj);
	}
	

	
	
/*	public void displayFac(){
		int a;
		for(a=0;a<facList.size();a++){
			System.out.println(a+1 +" "+(facList.get(a)).name );
		}
	}
	
	public void displayStud(){
		int a;
		for(a=0;a<studList.size();a++){
			System.out.println(a+1 +" "+(studList.get(a)).name );
		}
	}
	public void deleteCoordi(){
		coordiObj=new info2();
		System.out.println("Coordinator deleted successfully");
	}
	public void deleteFac(){
		int tmp=0;
		displayFac();
		if(facList.size()==0){
			System.out.println("No Faculty Present");
			return;
		}
		System.out.println("Enter the serial no. of faculty you want to delete");
		time_pass=input.nextLine();
		try{
			tmp=Integer.parseInt(time_pass);
		}
		catch(Exception e){
			System.out.println("Invalid input");
			deleteFac();
		}
		facList.remove(tmp-1);
		System.out.println("Faculty deleted successfully");
	}
	public void deleteStud(){
		int tmp=0;
		displayStud();
		if(studList.size()==0){
			System.out.println("No Participants Registered");
			return;
		}
		System.out.println("Enter the serial no. of participant you want to delete");
		time_pass=input.nextLine();
		try{
			tmp=Integer.parseInt(time_pass);
		}
		catch(Exception e){
			System.out.println("Invalid input");
			deleteStud();
		}
		studList.remove(tmp-1);
		System.out.println("Participant deleted successfully");
	}
	public void editFac(){
		int tmp,tmp2;
		displayFac();
		System.out.println("Enter the serial no. of faculty you want to edit");
		time_pass=input.nextLine();
		tmp=Integer.parseInt(time_pass);
		while(true){
			System.out.println("Press 1 to edit the name of the faculty");
			System.out.println("Press 2 to edit the Department of added faculty");
			System.out.println("Press 3 to edit address of added faculty");
			System.out.println("Press 4 to edit the mobile no. of added faculty");
			System.out.println("Press 5 to edit the email address of added faculty");
			System.out.println("Press 0 to go back");
			time_pass=input.nextLine();
			tmp2=Integer.parseInt(time_pass);
			if(tmp2==0)break;
			switch(tmp2){
				case 1:
					(facList.get(tmp-1)).name=input.nextLine();
					System.out.println("Name edited successfully");
					break;
				case 2:
					facList.get(tmp-1).dept=input.nextLine();
					System.out.println("Department edited successfully");
					break;
				case 3:
					facList.get(tmp-1).address=input.nextLine();
					System.out.println("Address edited successfully");
					break;
				case 4:
					facList.get(tmp-1).mobile=input.nextLine();
					System.out.println("Mobile no. edited successfully");
					break;
				case 5:
					facList.get(tmp-1).email=input.nextLine();
					System.out.println("Email Address edited successfully");
					break;
			}
		}
		
	}
	public void editStud(){
		int tmp,tmp2;
		displayStud();
		System.out.println("Enter the serial no. of participant you want to edit");
		time_pass=input.nextLine();
		tmp=Integer.parseInt(time_pass);
		while(true){
			System.out.println("Press 1 to edit the name of partcipant");
			System.out.println("Press 2 to edit the address of added participant");
			System.out.println("Press 3 to edit the mobile no. of added participant");
			System.out.println("Press 4 to edit the Organisation Name of added participant");
			System.out.println("Press 5 to edit the email address of added participant");
			System.out.println("Press 0 to go back");
			time_pass=input.nextLine();
			tmp2=Integer.parseInt(time_pass);
			if(tmp2==0)break;
			switch(tmp2){
				case 1:
					studList.get(tmp-1).name=input.nextLine();
					System.out.println("Name edited successfully");
					break;
				case 2:
					studList.get(tmp-1).address=input.nextLine();
					System.out.println("Address edited successfully");
					break;
				case 3:
					studList.get(tmp-1).mobile=input.nextLine();
					System.out.println("Mobile no. edited successfully");
					break;
				case 4:
					studList.get(tmp-1).organisation=input.nextLine();
					System.out.println("Organisation name edited successfully");
					break;
				case 5:
					studList.get(tmp-1).email=input.nextLine();
					System.out.println("Email Address edited successfully");
					break;
			}
		}
	}
	public void editCoordi(){
		while(true){
			System.out.println("Press 1 to edit the name of coordinator");
			System.out.println("Press 2 to edit the Department of coordinator");
			System.out.println("Press 3 to edit address of coordinator");
			System.out.println("Press 4 to edit the mobile no. of coordinator");
			System.out.println("Press 5 to edit the email address of coordinator");
			System.out.println("Press 0 to go back");
			time_pass=input.nextLine();
			try{
				tmp=Integer.parseInt(time_pass);
			}
			catch(Exception e){
				System.out.println("Invalid input");
				continue;
			}
			if(tmp==0)break;
			switch(tmp){
				case 1:
					coordiObj.name=input.nextLine();
					System.out.println("Name edited successfully");
					break;
				case 2:
					coordiObj.dept=input.nextLine();
					System.out.println("Department edited successfully");
					break;
				case 3:
					coordiObj.address=input.nextLine();
					System.out.println("Address edited successfully");
					break;
				case 4:
					coordiObj.mobile=input.nextLine();
					System.out.println("Mobile no. edited successfully");
					break;
				case 5:
					coordiObj.email=input.nextLine();
					System.out.println("Email Address edited successfully");
					break;
			}
		}
	}*/
}
