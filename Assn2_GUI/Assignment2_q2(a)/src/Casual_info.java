import java.io.Serializable;

public class Casual_info implements Serializable {
	private String name,mobile,email,when,where,circumstances;

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

	public String getWhen() {
		return when;
	}

	public void setWhen(String when) {
		this.when = when;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public String getCircumstances() {
		return circumstances;
	}

	public void setCircumstances(String circumstances) {
		this.circumstances = circumstances;
	}
	
}
