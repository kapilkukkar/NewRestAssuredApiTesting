package api.payloads;

public class User
{

	int id;
	String username;
	String first_name;
	String last_name;
	String email;
	String password;
	String phone;
	int user_status=0;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getFirst_name()
	{
		return first_name;
	}
	public void setFirst_name(String first_name)
	{
		this.first_name = first_name;
	}
	public String getLast_name()
	{
		return last_name;
	}
	public void setLast_name(String last_name)
	{
		this.last_name = last_name;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
		public String getPassword() 
		{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getPhone() 
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public int getUser_status() 
	{
		return user_status;
	}
	public void setUser_status(int user_status)
	{
		this.user_status = user_status;
	}


}
