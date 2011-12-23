package com.example;

import java.util.List;

public class SimpleUserService implements UserService
{
	private List<User> users;
	
	@Override
	public User login(String username, String password)
	{
		User loginUser = new User();
		loginUser.setUsername(username);
		// MD5 encodes password
		loginUser.setPlainPassword(password);
		
		for(User user : users)
		{
			// Users can now be compared using equals
			if(loginUser.equals(user)) {
				return user; // Return logged in user
			}
		}
		throw new SecurityException("Could not find user!") ;
	}

	public void setUsers(List<User> users)
	{
		this.users = users;
	}

	public List<User> getUsers()
	{
		return users;
	}

}
