package cn.itcast.pojo;
/**
 * 
 * @author thnx1
 * @version v1.0
 *
 */
public class User {
	private String username;
	
	private String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
