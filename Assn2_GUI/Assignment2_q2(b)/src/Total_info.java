import java.io.Serializable;
import java.util.ArrayList;

public class Total_info implements Serializable {
	private ArrayList<relative_info> relList=new ArrayList<relative_info>(50);
	private ArrayList<Professional_info> profList=new ArrayList<Professional_info>(50);
	private ArrayList<Personal_info> personalList=new ArrayList<Personal_info>(50);
	private ArrayList<Casual_info> casualList=new ArrayList<Casual_info>(50);
	
	public ArrayList<relative_info> getRelList() {
		return relList;
	}
	public void setRelList(ArrayList<relative_info> relList) {
		this.relList = relList;
	}
	public ArrayList<Professional_info> getProfList() {
		return profList;
	}
	public void setProfList(ArrayList<Professional_info> profList) {
		this.profList = profList;
	}
	public ArrayList<Personal_info> getPersonalList() {
		return personalList;
	}
	public void setPersonalList(ArrayList<Personal_info> personalList) {
		this.personalList = personalList;
	}
	public ArrayList<Casual_info> getCasualList() {
		return casualList;
	}
	public void setCasualList(ArrayList<Casual_info> casualList) {
		this.casualList = casualList;
	}
	
	
}
