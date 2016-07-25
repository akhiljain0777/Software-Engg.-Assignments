package assignment1_q1;

import java.io.Serializable;
import java.util.*;

public class display implements Serializable {
	
	private boolean isExpired(List<create_course>A,int i){
		Date today=new Date();
		long diff=today.getTime()-((A.get(i)).date).getTime();
		int days = (int) (diff / (1000*60*60*24));
		if(days>365)return true;
		else return false;
	}
	
	public void view(List<create_course> A){
		int i;
		for(i=0;i<A.size();i++){
			if(isExpired(A,i)){
				System.out.println(i+1+" This Course is expired");
			}
			else System.out.println(i+1+" "+(A.get(i)).getCname());
			
		}
		
	}
}
