package assignment1_q1;


import java.util.*;
import java.io.*;
public class start implements Serializable  {
	public static void  main(String[] args) throws ClassNotFoundException, IOException{
		int tmp,i,chk,ctrl,ctrl2;
		String time_pass,filename;
		List<create_course> A = new ArrayList<create_course>(15); 
		display displayObj=new display();
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome");
		while(true){
			System.out.println("Press 1 to create a course");
			System.out.println("Press 2 to display all the courses");
			System.out.println("Press 3 to add participants for a course");
			System.out.println("Press 4 to add faculty for a course");
			System.out.println("Press 5 to display all the participants of a particular course");
			System.out.println("Press 6 to edit course details,faculty,participants or coordinator");
			System.out.println("Press 7 to delete a course,participants,faculty or coordinator");
			System.out.println("Press 8 to view details of coordinator of a particular course");
			System.out.println("Press 9 to view details of faculties of a particular course");
			System.out.println("Press 10 to view details of partcipants of a particular course");
			System.out.println("Press 11 to view basic details of course such as fee,start date,duration, no of particpants etc.");
			System.out.println("Press 12 to write to a file");
			System.out.println("Press 13 to read from the file");
			System.out.println("Press 0 to exit");
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
					if(A.size()>=10){
						System.out.println("Max 10 courses are allowed.If you want to insert more,please delete expired one");
						break;
					}
					create_course courseObj=new create_course();
					courseObj.setCname();
					A.add(A.size(),courseObj);
					break;
				case 2:
					displayObj.view(A);
					break;
				case 3:
					displayObj.view(A);
					System.out.println("Enter the serial no. of course to which you want to add participants");
					time_pass=input.nextLine();
					chk=Integer.parseInt(time_pass);
					(A.get(chk-1)).setStudents();
					break;
				case 4:
					displayObj.view(A);
					System.out.println("Enter the serial no. of course to which you want to add faculty");
					time_pass=input.nextLine();
					chk=Integer.parseInt(time_pass);
					(A.get(chk-1)).setFaculty();
					break;
				case 5:
					displayObj.view(A);
					System.out.println("Enter the serial no. of course to see all registered participants of the course");
					time_pass=input.nextLine();
					chk=Integer.parseInt(time_pass);
					(A.get(chk-1)).displayStud();
					break;
				case 6:
					displayObj.view(A);
					System.out.println("Enter the serial no. of course to edit details");
					time_pass=input.nextLine();
					chk=Integer.parseInt(time_pass);
					while(true){
						System.out.println("Press 1 to edit course name");
						System.out.println("Press 2 to edit course fee");
						System.out.println("Press 3 to edit course duration");
						System.out.println("Press 4 to edit course start date");
						System.out.println("Press 5 to edit details of coordinator");
						System.out.println("Press 6 to edit details of faculties");
						System.out.println("Press 7 to edit details of participants");
						System.out.println("Press 0 to go back");
						time_pass=input.nextLine();
						ctrl=Integer.parseInt(time_pass);
						if(ctrl==0)break;
						switch(ctrl){
							case 1:
								(A.get(chk-1)).editCname();
								break;
							case 2:
								(A.get(chk-1)).setFee();
								break;
							case 3:
								(A.get(chk-1)).setDuration();
								break;
							case 4:
								(A.get(chk-1)).setDate();
								break;
							case 5:
								(A.get(chk-1)).editCoordi();
								break;
							case 6:
								(A.get(chk-1)).editFac();
								break;
							case 7:
								(A.get(chk-1)).editStud();
								break;
						}
					}
					break;
				case 7:
					displayObj.view(A);
					System.out.println("Enter the serial no. of course to delete details");
					time_pass=input.nextLine();
					chk=Integer.parseInt(time_pass);
					while(true){
						System.out.println("Press 1 to delete course");
						System.out.println("Press 2 to delete coordinator");
						System.out.println("Press 3 to delete a faculty");
						System.out.println("Press 4 to delele a participant");
						System.out.println("Press 0 to go back");
						time_pass=input.nextLine();
						ctrl=Integer.parseInt(time_pass);
						if(ctrl==0)break;
						switch(ctrl){
							case 1:
								A.remove(chk-1);
								System.out.println("Course deleted successfully");
								break;
							case 2:
								(A.get(chk-1)).deleteCoordi();
								break;
							case 3:
								(A.get(chk-1)).deleteFac();
								break;
							case 4:
								(A.get(chk-1)).deleteStud();
								break;
						}
					}
					break;
					
					case 8:
						displayObj.view(A);
						System.out.println("Enter the serial no. of course");
						time_pass=input.nextLine();
						chk=Integer.parseInt(time_pass);
						System.out.println(((A.get(chk-1)).coordiObj).name);
						while(true){
							System.out.println("Press 1 for department");
							System.out.println("Press 2 for address");
							System.out.println("Press 3 for mobile no.");
							System.out.println("Press 4 for email address");
							System.out.println("Press 0 to go back");
							time_pass=input.nextLine();
							ctrl=Integer.parseInt(time_pass);
							if(ctrl==0)break;
							switch(ctrl){
								case 1:
									System.out.println(((A.get(chk-1)).coordiObj).dept);
									break;
								case 2:
									System.out.println(((A.get(chk-1)).coordiObj).address);
									break;
								case 3:
									System.out.println(((A.get(chk-1)).coordiObj).mobile);
									break;
								case 4:System.out.println(((A.get(chk-1)).coordiObj).email);
								break;
							}
						}
						break;
					
					case 9:
						displayObj.view(A);
						System.out.println("Enter the serial no. of course");
						time_pass=input.nextLine();
						chk=Integer.parseInt(time_pass);
						(A.get(chk-1)).displayFac();
						if((A.get(chk-1)).facList.size()==0){
							System.out.println("No faculty present");
							break;
						}
						System.out.println("Enter the serial no. of faculty");
						time_pass=input.nextLine();
						ctrl2=Integer.parseInt(time_pass);
						System.out.println(((A.get(chk-1)).facList.get(ctrl2-1)).name);
						while(true){
							System.out.println("Press 1 for department");
							System.out.println("Press 2 for address");
							System.out.println("Press 3 for mobile no.");
							System.out.println("Press 4 for email address");
							System.out.println("Press 0 to go back");
							time_pass=input.nextLine();
							ctrl=Integer.parseInt(time_pass);
							if(ctrl==0)break;
							switch(ctrl){
								case 1:
									System.out.println(((A.get(chk-1)).facList.get(ctrl2-1)).dept);
									break;
								case 2:
									System.out.println(((A.get(chk-1)).facList.get(ctrl2-1)).address);
									break;
								case 3:
									System.out.println(((A.get(chk-1)).facList.get(ctrl2-1)).mobile);
									break;
								case 4:System.out.println(((A.get(chk-1)).facList.get(ctrl2-1)).email);
								break;
							}
						}
						break;
					
					case 10:
						displayObj.view(A);
						System.out.println("Enter the serial no. of course");
						time_pass=input.nextLine();
						chk=Integer.parseInt(time_pass);
						(A.get(chk-1)).displayStud();
						if((A.get(chk-1)).studList.size()==0){
							System.out.println("No Participant registered");
							break;
						}
						System.out.println("Enter the serial no. of participant");
						time_pass=input.nextLine();
						ctrl2=Integer.parseInt(time_pass);
						System.out.println(((A.get(chk-1)).studList.get(ctrl2-1)).name);
						while(true){
							System.out.println("Press 1 for address");
							System.out.println("Press 2 for mobile no.");
							System.out.println("Press 3 for organistion name");
							System.out.println("Press 4 for email address");
							System.out.println("Press 0 to go back");
							time_pass=input.nextLine();
							ctrl=Integer.parseInt(time_pass);
							if(ctrl==0)break;
							switch(ctrl){
								case 1:
									System.out.println(((A.get(chk-1)).studList.get(ctrl2-1)).address);
									break;
								case 2:
									System.out.println(((A.get(chk-1)).studList.get(ctrl2-1)).mobile);
									break;
								case 3:
									System.out.println(((A.get(chk-1)).studList.get(ctrl2-1)).organisation);
									break;
								case 4:
									System.out.println(((A.get(chk-1)).studList.get(ctrl2-1)).email);
									break;
							}
						}
						break;
						
						
					case 11:
						displayObj.view(A);
						System.out.println("Enter the serial no. of course");
						time_pass=input.nextLine();
						chk=Integer.parseInt(time_pass);
						System.out.println((A.get(chk-1)).getCname());
						System.out.println("Start date of course:"+(A.get(chk-1)).getDate());
						System.out.println("Duration of course:"+(A.get(chk-1)).getDuration());
						System.out.println("Fee of course:"+(A.get(chk-1)).getFee());
						System.out.println("No.of faculties in course: "+(A.get(chk-1)).facList.size());
						System.out.println("No.of partcipants registered in course: "+(A.get(chk-1)).studList.size());
						System.out.println("");
						break;
					case 12:
						  try
					      {
					         filename="data.ser";
					         ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
					         out.writeObject(A);
					         out.close();
					         //fileOut.close();
					      }catch(IOException e)
					      {
					          e.printStackTrace();
					      }
						System.out.println("Task completed");
						break;
				
					case 13:
						try {
							ObjectInputStream is=new ObjectInputStream(new FileInputStream("data.ser"));
							A=(List<create_course>)is.readObject();
						} 
						catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
						catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Task Completed");
						break;
						
				}		
			
		}
	}
}
