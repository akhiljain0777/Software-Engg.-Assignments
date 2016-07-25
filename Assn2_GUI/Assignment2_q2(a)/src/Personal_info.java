import java.io.Serializable;

public class Personal_info implements Serializable {
	private String name,mobile,email,context,date_of_acquainted,specific_events;

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

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getDate_of_acquainted() {
		return date_of_acquainted;
	}

	public void setDate_of_acquainted(String date_of_acquainted) {
		this.date_of_acquainted = date_of_acquainted;
	}

	public String getSpecific_events() {
		return specific_events;
	}

	public void setSpecific_events(String specific_events) {
		this.specific_events = specific_events;
	}
	
	
}
