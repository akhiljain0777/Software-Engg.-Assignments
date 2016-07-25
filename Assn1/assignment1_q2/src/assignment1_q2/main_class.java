package assignment1_q2;

import java.util.*;
import java.io.*;
public class main_class implements Serializable {
	public static void main(String[] args){
		int tmp,tmp2,chk;
		String time_pass,filename;
		Scanner in=new Scanner(System.in);
		acquaintances acqObj=new acquaintances();
		System.out.println("Welcome");
		while(true){
			System.out.println("Press 1 to Create acquaintances");
			System.out.println("Press 2 to Delete acquaintances");
			System.out.println("Press 3 to Display all acquaintances");
			System.out.println("Press 4 for list of specific category of acquaintances");
			System.out.println("Press 5 to search a name within acquaintances");
			System.out.println("Press 6 to view details of a particular acquaintaces");
			System.out.println("Press 7 to write in a file");
			System.out.println("Press 8 to for reading from a file");
			System.out.println("Press 0 to exit");
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
					System.out.println("Press 1 for Relatives");
					System.out.println("Press 2 for Professional Friends");
					System.out.println("Press 3 for Personal friends");
					System.out.println("Press 4 for Casual Friends");
					System.out.println("Press 0 to go back");
					time_pass=in.nextLine();
					try{
						tmp2=Integer.parseInt(time_pass);
					}
					catch(Exception e){
						System.out.println("Invalid input");
						break;
					}
					if(tmp2==0)break;
					switch(tmp2){
						case 1:
							acqObj.setRelatives();
							break;
						case 2:
							acqObj.setProf();
							break;
						case 3:
							acqObj.setPersonal();
							break;
						case 4:
							acqObj.setCasual();
							break;
					}
					break;
				case 2:
					System.out.println("Press 1 if you know the name of acquaintances");
					System.out.println("Press 2 if you don't know the name of acquaintances");
					time_pass=in.nextLine();
					int u=Integer.parseInt(time_pass);
					if(u==1){
						System.out.println("Enter the name");
						String A=in.nextLine();
						acqObj.delete(A);
						break;
					}
					else{
						System.out.println("Press 1 for Relatives");
						System.out.println("Press 2 for Professional Friends");
						System.out.println("Press 3 for Personal friends");
						System.out.println("Press 4 for Casual Friends");
						System.out.println("Press 0 to go back");
						time_pass=in.nextLine();
						try{
							tmp2=Integer.parseInt(time_pass);
						}
						catch(Exception e){
							System.out.println("Invalid input");
							break;
						}
						if(tmp2==0)break;
						switch(tmp2){
							case 1:
								acqObj.deleteRelatives();
								break;
							case 2:
								acqObj.deleteProf();
								break;
							case 3:
								acqObj.deletePersonal();
								break;
							case 4:
								acqObj.deleteCasual();
								break;
						}
					}
					break;
					
				case 3:
					if(acqObj.relList.size()!=0)System.out.println("RELATIVES");
					acqObj.displayRelatives();
					if(acqObj.profList.size()!=0)System.out.println("PROFESSIONAL FRIENDS");
					acqObj.displayProf();
					if(acqObj.personalList.size()!=0)System.out.println("PERSONAL FRIENDS");
					acqObj.displayPersonal();
					if(acqObj.casualList.size()!=0)System.out.println("CASUAL FRIENDS");
					acqObj.displayCasual();
					System.out.println();
					break;
					
				case 4:
					System.out.println("Press 1 for Relatives");
					System.out.println("Press 2 for Professional Friends");
					System.out.println("Press 3 for Personal friends");
					System.out.println("Press 4 for Casual Friends");
					System.out.println("Press 0 to go back");
					time_pass=in.nextLine();
					tmp2=Integer.parseInt(time_pass);
					if(tmp2==0)break;
					switch(tmp2){
						case 1:
							acqObj.displayRelatives();
							break;
						case 2:
							acqObj.displayProf();
							break;
						case 3:
							acqObj.displayPersonal();
							break;
						case 4:
							acqObj.displayCasual();
							break;
					}
					System.out.println();
					break;
					
				case 5:
					System.out.println("Enter the name of acquaintances");
					time_pass=in.nextLine();
					acqObj.search(time_pass);
					break;
				
				case 6:
					System.out.println("Press 1 for Relatives");
					System.out.println("Press 2 for Professional Friends");
					System.out.println("Press 3 for Personal friends");
					System.out.println("Press 4 for Casual Friends");
					System.out.println("Press 0 to go back");
					time_pass=in.nextLine();
					try{
						tmp2=Integer.parseInt(time_pass);
					}
					catch(Exception e){
						System.out.println("Invaid input");
						break;
					}
					if(tmp2==0)break;
					switch(tmp2){
						case 1:
							acqObj.displayRelatives();
							System.out.println("Enter the serial no. of Relative");
							time_pass=in.nextLine();
							try{
							chk=Integer.parseInt(time_pass);
							}
							catch(Exception e){
								System.out.println("Invalid input");
								break;
							}
							System.out.println("Name: "+ ((acqObj.relList).get(chk-1)).name);
							System.out.println("Mobile: "+ ((acqObj.relList).get(chk-1)).mobile);
							System.out.println("Email : "+ ((acqObj.relList).get(chk-1)).email);
							System.out.println("DOB: "+ ((acqObj.relList).get(chk-1)).dob);
							System.out.println("Date of Last Meet: "+ ((acqObj.relList).get(chk-1)).dateLast_meet);
							break;
						
						case 2:
							acqObj.displayProf();
							System.out.println("Enter the serial no. of Professional Friend");
							time_pass=in.nextLine();
							try{
								chk=Integer.parseInt(time_pass);
							}
							catch(Exception e){
								System.out.println("Invalid Input");
								break;
							}
							System.out.println("Name: "+ ((acqObj.profList).get(chk-1)).name);
							System.out.println("Mobile: "+ ((acqObj.profList).get(chk-1)).mobile);
							System.out.println("Email : "+ ((acqObj.profList).get(chk-1)).email);
							System.out.println("Common Interests: "+ ((acqObj.profList).get(chk-1)).comm_interest);
							break;
						
						case 3:
							acqObj.displayPersonal();
							System.out.println("Enter the serial no. of Personal Friend");
							time_pass=in.nextLine();
							try{
								chk=Integer.parseInt(time_pass);
							}
							catch(Exception e){
								System.out.println("Invalid input");
								break;
							}
							System.out.println("Name: "+ ((acqObj.personalList).get(chk-1)).name);
							System.out.println("Mobile: "+ ((acqObj.personalList).get(chk-1)).mobile);
							System.out.println("Email : "+ ((acqObj.personalList).get(chk-1)).email);
							System.out.println("Context in which acquainted: "+ ((acqObj.personalList).get(chk-1)).context);
							System.out.println("Date on which acquainted : "+ ((acqObj.personalList).get(chk-1)).date_of_acquainted);
							System.out.println("Specific Events : "+ ((acqObj.personalList).get(chk-1)).spe_events);
							break;
					
						case 4:
							acqObj.displayCasual();
							System.out.println("Enter the serial no. of Casual Friend");
							time_pass=in.nextLine();
							try{
								chk=Integer.parseInt(time_pass);
							}
							catch(Exception e){
								System.out.println("Invalid Input");
								break;
							}
							System.out.println("Name: "+ ((acqObj.casualList).get(chk-1)).name);
							System.out.println("Mobile: "+ ((acqObj.casualList).get(chk-1)).mobile);
							System.out.println("Email : "+ ((acqObj.casualList).get(chk-1)).email);
							System.out.println("When and Where: "+ ((acqObj.casualList).get(chk-1)).when_and_where);
							System.out.println("Circumstances : "+ ((acqObj.casualList).get(chk-1)).circumstance);
							break;
					}
					System.out.println();
					break;
					
				case 7:
					  try
				      {
				         filename="data.ser";
				         ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
				         out.writeObject(acqObj);
				         out.close();
				         //fileOut.close();
				      }
					  catch(IOException e)
				      {
				          e.printStackTrace();
				      }
					System.out.println("Task completed");
					break;
			
				case 8:
					try {
						ObjectInputStream is=new ObjectInputStream(new FileInputStream("data.ser"));
						acqObj=(acquaintances)is.readObject();
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
					System.out.println("Task Completed");
					break;
			}
		}
	}
}
