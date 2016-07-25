package assignment1_q1;

import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class create_course implements Serializable {
	private String cname,duration,time_pass;
	private int fee,tmp,i;
	public SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");
	public Date date=new Date();
	info2 coordiObj=new info2();
	public List<info2>facList=new ArrayList(5);
	public List<info2>studList=new ArrayList(5);
	static Scanner input=new Scanner(System.in);

	public void setCname() throws IOException{
		System.out.println("Enter Course name");
		cname=input.nextLine();
		System.out.println("Course name added successfully");
		while(true){
			System.out.println("Prees 1 to enter the course Fee");
			System.out.println("Prees 2 to enter the start date of course");
			System.out.println("Prees 3 to enter the course Duration");
			System.out.println("Prees 4 for Coordinator");
			System.out.println("Prees 5 for Faculty");
			System.out.println("Prees 6 for Participants");
			System.out.println("Prees 0 to go back");
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
					setFee();
					break;
				case 2:
					setDate();
					break;
				case 3:
					setDuration();
					break;
				case 4:
					setCoordi();
					break;
				case 5:
					setFaculty();
					break;
				case 6:
					setStudents();
					break;
			}
		}
	}
	public void setDate(){
		System.out.println("Enter the Start date in dd.MM.yyyy format ");
		time_pass=input.nextLine();
		
		try {
			date=ft.parse(time_pass);
		}
		catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Format");
			setDate();
			e.printStackTrace();
		}
	}
	public void editCname(){
		cname=input.nextLine();
		System.out.println("Course name edited successfully");
	}
	public String getCname(){
		return cname;
	}
	public void setFee() throws IOException,NumberFormatException{
		System.out.println("Enter fee");
		time_pass=input.nextLine();
		try{
			fee=Integer.parseInt(time_pass);
		}
		catch(Exception e){
			System.out.println("Invalid input");
		}
	}
	public int getFee(){
		return fee;
	}
	public String getDate(){
		return ft.format(date);
	}
	public void setDuration(){
		duration=input.nextLine();
	}
	public String getDuration(){
		return duration;
	}
	
	public void setCoordi(){
		System.out.println("Enter Coordinator's Name");
		coordiObj.name=input.nextLine();
		while(true){
			System.out.println("Press 1 to enter the Department of coordinator");
			System.out.println("Press 2 to enter address of coordinator");
			System.out.println("Press 3 to enter the mobile no. of coordinator");
			System.out.println("Press 4 to enter the email address of coordinator");
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
					coordiObj.dept=input.nextLine();
					System.out.println("Department added successfully");
					break;
				case 2:
					coordiObj.address=input.nextLine();
					System.out.println("Address added successfully");
					break;
				case 3:
					coordiObj.mobile=input.nextLine();
					System.out.println("Mobile no. added successfully");
					break;
				case 4:
					coordiObj.email=input.nextLine();
					System.out.println("Email Address added successfully");
					break;
			}
		}
	}
	public info2 getCoordi(){
		return coordiObj;
	}
	public void setFaculty(){
		if(facList.size()>=5){
			System.out.println("Only 5 facultes allowed");
			return;
		}
		info2 facObj=new info2();
		System.out.println("Please enter the name of Faculty");
		facObj.name=input.nextLine();
		System.out.println("Faculty added successfully");
		while(true){
			System.out.println("Press 1 to enter the Department of added faculty");
			System.out.println("Press 2 to enter address of added faculty");
			System.out.println("Press 3 to enter the mobile no. of added faculty");
			System.out.println("Press 4 to enter the email address of added faculty");
			System.out.println("Press 0 to go back");
			time_pass=input.nextLine();
			try{
				tmp=Integer.parseInt(time_pass);
			}
			catch(Exception e){
				System.out.println("Invalid Input");
				continue;
			}
			if(tmp==0)break;
			switch(tmp){
				case 1:
					facObj.dept=input.nextLine();
					System.out.println("Department added successfully");
					break;
				case 2:
					facObj.address=input.nextLine();
					System.out.println("Address added successfully");
					break;
				case 3:
					facObj.mobile=input.nextLine();
					System.out.println("Mobile no. added successfully");
					break;
				case 4:
					facObj.email=input.nextLine();
					System.out.println("Email Address added successfully");
					break;
			}
		}
		facList.add(facList.size(),facObj);
	}
	public void setStudents(){
		if(studList.size()>=5){
			System.out.println("Only 5 participants allowed");
			return;
		}
		info2 studObj=new info2();
		System.out.println("Please enter the name of partcipant");
		studObj.name=input.nextLine();
		System.out.println("Partcipant added successfully");
		
		while(true){
			System.out.println("Press 1 to enter the address of added participant");
			System.out.println("Press 2 to enter the mobile no. of added participant");
			System.out.println("Press 3 to enter the Organisation Name of added participant");
			System.out.println("Press 4 to enter the email address of added participant");
			System.out.println("Press 0 to go back");
			time_pass=input.nextLine();
			try{
				tmp=Integer.parseInt(time_pass);
			}
			catch(Exception e){
				System.out.println("Invalid Input");
				continue;
			}
			System.out.println();
			if(tmp==0)break;
			switch(tmp){
				case 1:
					studObj.address=input.nextLine();
					System.out.println("Address added successfully");
					break;
				case 2:
					studObj.mobile=input.nextLine();
					System.out.println("Mobile no. added successfully");
					break;
				case 3:
					studObj.organisation=input.nextLine();
					System.out.println("Organisation name added successfully");
					break;
				case 4:
					studObj.email=input.nextLine();
					System.out.println("Email Address added successfully");
					break;
			}
		}
		studList.add(studList.size(),studObj);
	}
	
	public void displayFac(){
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
	}
}
