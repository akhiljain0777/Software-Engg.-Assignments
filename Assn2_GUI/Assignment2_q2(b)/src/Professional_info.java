import java.io.Serializable;

public class Professional_info implements Serializable {
	private String name,mobile,email,common_interest;

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

	public String getCommon_interest() {
		return common_interest;
	}

	public void setCommon_interest(String common_interest) {
		this.common_interest = common_interest;
	}
}
