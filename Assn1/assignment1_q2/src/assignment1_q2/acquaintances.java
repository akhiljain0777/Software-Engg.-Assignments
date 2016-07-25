package assignment1_q2;

import java.util.*;
import java.io.*;

public class acquaintances implements Serializable {
	private int tmp;
	private String time_pass;
	
	List<info>relList=new ArrayList<info>(100);
	List<info>profList=new ArrayList<info>(100);
	List<info>personalList=new ArrayList<info>(100);
	List<info>casualList=new ArrayList<info>(100);
	
	static Scanner in=new Scanner(System.in);
	
	
	public void setRelatives(){
		System.out.println("Enter the name");
		info relObj=new info();
		relObj.name=in.nextLine();
		while(true){
			System.out.println("Press 1 to enter Mobile No.");
			System.out.println("Press 2 to enter Email Address");
			System.out.println("Press 3 to enter Date of Birth");
			System.out.println("Press 4 to enter the Date of Last Meeting");
			System.out.println("Press 0 to go back");
			time_pass=in.nextLine();
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
					relObj.mobile=in.nextLine();
					break;
				case 2:
					relObj.email=in.nextLine();
					break;
				case 3:
					relObj.dob=in.nextLine();
					break;
				case 4:
					relObj.dateLast_meet=in.nextLine();
					break;
			}
		}
		
		relList.add(relList.size(),relObj);
	}
	
	
	
	public void setProf(){
		System.out.println("Enter the name");
		info profObj=new info();
		profObj.name=in.nextLine();
		while(true){
			System.out.println("Press 1 to enter Mobile No.");
			System.out.println("Press 2 to enter Email Address");
			System.out.println("Press 3 to enter common professional interests");
			System.out.println("Press 0 to go back");
			time_pass=in.nextLine();
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
					profObj.mobile=in.nextLine();
					break;
				case 2:
					profObj.email=in.nextLine();
					break;
				case 3:
					profObj.comm_interest=in.nextLine();
					if((profObj.comm_interest).length() > 100){
						System.out.println("Character limit exceeded,Data not stored");
						profObj.comm_interest=null;
					}
					break;
					
			}
		}
		profList.add(profList.size(),profObj);
	}
	
	public void setPersonal(){
		System.out.println("Enter the name");
		info personalObj=new info();
		personalObj.name=in.nextLine();
		while(true){
			System.out.println("Press 1 to enter Mobile No.");
			System.out.println("Press 2 to enter Email Address");
			System.out.println("Press 3 to enter Date on which acquainted");
			System.out.println("Press 4 to enter Context in which acquainted");
			System.out.println("Press 5 to enter specific events that need to be noted");
			System.out.println("Press 0 to go back");
			time_pass=in.nextLine();
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
					personalObj.mobile=in.nextLine();
					break;
				case 2:
					personalObj.email=in.nextLine();
					break;
				case 3:
					personalObj.date_of_acquainted=in.nextLine();		
					break;
				case 4:
					personalObj.context=in.nextLine();
					if((personalObj.context).length() > 100){
						System.out.println("Character limit exceeded,Data not stored");
						personalObj.context=null;
					}
					break;
				case 5:
					personalObj.spe_events=in.nextLine();
					if((personalObj.spe_events).length() > 100){
						System.out.println("Character limit exceeded,Data not stored");
						personalObj.spe_events=null;
					}
					break;
			}
		}
		personalList.add(personalList.size(),personalObj);
	}
	
	public void setCasual(){
		System.out.println("Enter the name");
		info casualObj=new info();
		casualObj.name=in.nextLine();
		while(true){
			System.out.println("Press 1 to enter Mobile No.");
			System.out.println("Press 2 to enter Email Address");
			System.out.println("Press 3 to enter when and where you get acquainted");
			System.out.println("Press 4 to enter the circumstances in which you get acquainted");
			System.out.println("Press 0 to go back");
			time_pass=in.nextLine();
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
					casualObj.mobile=in.nextLine();
					break;
				case 2:
					casualObj.email=in.nextLine();
					break;
				case 3:
					casualObj.when_and_where=in.nextLine();
					if((casualObj.when_and_where).length() > 100){
						System.out.println("Character limit exceeded,Data not stored");
						casualObj.when_and_where=null;
					}
					break;
				case 4:
					casualObj.circumstance=in.nextLine();
					if((casualObj.circumstance).length() > 100){
						System.out.println("Character limit exceeded,Data not stored");
						casualObj.circumstance=null;
					}
					break;
			}
		}
		casualList.add(casualList.size(),casualObj);
	}
	
	public void displayRelatives(){
		int i;
		for(i=0;i<relList.size();i++){
			System.out.println(i+1+" "+(relList.get(i)).name);
		}
	}
	
	public void displayProf(){
		int i;
		for(i=0;i<profList.size();i++){
			System.out.println(i+1+" "+(profList.get(i)).name);
		}
	}
	
	public void displayPersonal(){
		int i;
		for(i=0;i<personalList.size();i++){
			System.out.println(i+1+" "+(personalList.get(i)).name);
		}
	}
	
	public void displayCasual(){
		int i;
		for(i=0;i<casualList.size();i++){
			System.out.println(i+1+" "+(casualList.get(i)).name);
		}
	}
	
	public void deleteRelatives(){
		displayRelatives();
		System.out.println("Enter the serial no. of Relative you want to delete");
		time_pass=in.nextLine();
		tmp=Integer.parseInt(time_pass);
		relList.remove(tmp-1);
		System.out.println("Task completed");
	}
	
	public void deleteProf(){
		displayProf();
		System.out.println("Enter the serial no. of Professional friend you want to delete");
		time_pass=in.nextLine();
		tmp=Integer.parseInt(time_pass);
		profList.remove(tmp-1);
		System.out.println("Task completed");
	}
	
	public void deletePersonal(){
		displayPersonal();
		System.out.println("Enter the serial no. of Person Friend you want to delete");
		time_pass=in.nextLine();
		tmp=Integer.parseInt(time_pass);
		personalList.remove(tmp-1);
		System.out.println("Task completed");
	}
	
	public void deleteCasual(){
		displayCasual();
		System.out.println("Enter the serial no. of Casual Friend you want to delete");
		time_pass=in.nextLine();
		tmp=Integer.parseInt(time_pass);
		casualList.remove(tmp-1);
		System.out.println("Task completed");
	}
	
	public void search(String A){
		int i,flag=0;
		for(i=0;i<relList.size();i++){
			if(A.compareTo((relList.get(i)).name)==0){
				System.out.println("Match found");
				System.out.println("This person is your Relative");
				System.out.println("Name: "+ ((relList).get(i)).name);
				System.out.println("Mobile: "+ ((relList).get(i)).mobile);
				System.out.println("Email : "+ ((relList).get(i)).email);
				System.out.println("DOB: "+ (relList).get(i).dob);
				System.out.println("Date of Last Meet: "+ ((relList).get(i)).dateLast_meet);
				flag++;
			}
		}
		for(i=0;i<profList.size();i++){
			if(A.compareTo((profList.get(i)).name)==0){
				System.out.println("Match found");
				System.out.println("This person is your Professional Friend");
				System.out.println("Name: "+ ((profList).get(i)).name);
				System.out.println("Mobile: "+ ((profList).get(i)).mobile);
				System.out.println("Email : "+ ((profList).get(i)).email);
				System.out.println("Common Interests: "+ ((profList).get(i)).comm_interest);
				flag++;
			}
		}
		for(i=0;i<personalList.size();i++){
			if(A.compareTo((personalList.get(i)).name)==0){
				System.out.println("Match found");
				System.out.println("This person is your Personal Friend");
				System.out.println("Name: "+ ((personalList).get(i)).name);
				System.out.println("Mobile: "+ ((personalList).get(i)).mobile);
				System.out.println("Email : "+ ((personalList).get(i)).email);
				System.out.println("Context in which acquainted: "+ ((personalList).get(i)).context);
				System.out.println("Date on which acquainted : "+ ((personalList).get(i)).date_of_acquainted);
				System.out.println("Specific Events : "+ ((personalList).get(i)).spe_events);
				flag++;
			}
		}
		for(i=0;i<casualList.size();i++){
			if(A.compareTo((casualList.get(i)).name)==0){
				System.out.println("Match found");
				System.out.println("This person is your Casual Friend");
				System.out.println("Name: "+ ((casualList).get(i)).name);
				System.out.println("Mobile: "+ ((casualList).get(i)).mobile);
				System.out.println("Email : "+ ((casualList).get(i)).email);
				System.out.println("When and Where: "+ ((casualList).get(i)).when_and_where);
				System.out.println("Circumstances : "+ ((casualList).get(i)).circumstance);
				flag++;
			}
		}
		if(flag==0)System.out.println("No match found");
	}
	public void delete(String A){
		int i,flag=0;
		for(i=0;i<relList.size();i++){
			if(A.compareTo((relList.get(i)).name)==0){
				System.out.println("Match found");
				System.out.println("This person is your Relative");
				System.out.println("Name: "+ ((relList).get(i)).name);
				System.out.println("Mobile: "+ ((relList).get(i)).mobile);
				System.out.println("Email : "+ ((relList).get(i)).email);
				System.out.println("DOB: "+ (relList).get(i).dob);
				System.out.println("Date of Last Meet: "+ ((relList).get(i)).dateLast_meet);
				relList.remove(i);
				flag++;
			}
		}
		for(i=0;i<profList.size();i++){
			if(A.compareTo((profList.get(i)).name)==0){
				System.out.println("Match found");
				System.out.println("This person is your Professional Friend");
				System.out.println("Name: "+ ((profList).get(i)).name);
				System.out.println("Mobile: "+ ((profList).get(i)).mobile);
				System.out.println("Email : "+ ((profList).get(i)).email);
				System.out.println("Common Interests: "+ ((profList).get(i)).comm_interest);
				profList.remove(i);
				flag++;
			}
		}
		for(i=0;i<personalList.size();i++){
			if(A.compareTo((personalList.get(i)).name)==0){
				System.out.println("Match found");
				System.out.println("This person is your Personal Friend");
				System.out.println("Name: "+ ((personalList).get(i)).name);
				System.out.println("Mobile: "+ ((personalList).get(i)).mobile);
				System.out.println("Email : "+ ((personalList).get(i)).email);
				System.out.println("Context in which acquainted: "+ ((personalList).get(i)).context);
				System.out.println("Date on which acquainted : "+ ((personalList).get(i)).date_of_acquainted);
				System.out.println("Specific Events : "+ ((personalList).get(i)).spe_events);
				personalList.remove(i);
				flag++;
			}
		}
		for(i=0;i<casualList.size();i++){
			if(A.compareTo((casualList.get(i)).name)==0){
				System.out.println("Match found");
				System.out.println("This person is your Casual Friend");
				System.out.println("Name: "+ ((casualList).get(i)).name);
				System.out.println("Mobile: "+ ((casualList).get(i)).mobile);
				System.out.println("Email : "+ ((casualList).get(i)).email);
				System.out.println("When and Where: "+ ((casualList).get(i)).when_and_where);
				System.out.println("Circumstances : "+ ((casualList).get(i)).circumstance);
				casualList.remove(i);
				flag++;
			}
		}
		if(flag==0)System.out.println("No match found");
		else System.out.println("Deleted successfully");
	}
}
