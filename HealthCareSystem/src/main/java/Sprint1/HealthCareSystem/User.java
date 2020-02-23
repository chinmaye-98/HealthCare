package Sprint1.HealthCareSystem;
import java.io.Serializable;
import java.util.Random;

public class User implements Serializable{
	private int userId;
	private String userName;
	private long phoneNumber;
	private String password;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUsertName(String userName) {
		this.userName = userName;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
	    return password;
	}
	public User( int userId, String userName, long phoneNumber, String password) {
		super();
		Random r = new Random();
		
		this.userId = r.nextInt(200);
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.password= password;
	}
	public User() {
		super();
	}
		
	


}

