package model;

public class Customer {
	
	String name, email, gender, username, passwd, address, pinCode;

	public Customer() {}
	
	public Customer(String name, String email, String gender, String username, String passwd, String address, String pinCode)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
		this.username=username;
		this.passwd=passwd;
		this.address=address;
		this.pinCode=pinCode;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	
	

}
