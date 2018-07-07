import java.security.NoSuchAlgorithmException;

public class User implements Serializable {
	private String userName;
	private String password;
	
	public User() {
		this.setPlainPassword("secret"); // Standard password
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPasswort(String password) {
		this.password = password;
	}
	
	// Write only
	public void setPlainPassword(String plainPassword) 
			throws NoSuchAlgorithmException {
		// MD5 encode the plain password
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(plainPassword.getBytes(), 0, plainPassword.length());
		// Set the password string to the MD5 hash in HEX values
		String md5Hex = new BigInteger(1, md.digest()).toString(16);
		this.setPassword(md5Hex);
	}
	
	public boolean equals(Object other) {
		return this.getClass().equals(other.getClass()) && 
			((User)other).getUsername().equals(this.getUsername()) &&
			((User)other).getPassword().equals(this.getPassword());
	}
}