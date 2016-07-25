import java.io.Serializable;

public class relative_info implements Serializable {
	private String name,mobile,email,DOB,date_of_lastmeet;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getDate_of_lastmeet() {
		return date_of_lastmeet;
	}

	public void setDate_of_lastmeet(String date_of_lastmeet) {
		this.date_of_lastmeet = date_of_lastmeet;
	}
	
}
