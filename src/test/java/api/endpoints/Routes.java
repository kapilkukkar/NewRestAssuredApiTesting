package api.endpoints;

public class Routes 
{
	
	public static String base_url="https://petstore.swagger.io/v2";
	
	// Users only 
	
	public static String post_url= base_url+"/user";
	public static String get_url= "https://petstore.swagger.io/v2/user/{username}";
	public static String update_url= "https://petstore.swagger.io/v2/user/{username}";
	public static String delete_url= "https://petstore.swagger.io/v2/user/{username}";
	
}
