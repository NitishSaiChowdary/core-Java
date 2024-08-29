//throw keyword we can create custom errors
//throws keyword applyed on the  methods levels--ioException,sqlexception,exception
public class eg5 {
	public static void main(String[] args) throws Exception {
		getLogin("nitish", "nitish");
	}
	public static void getLogin(String UserName,String password) throws Exception {
		if(UserName =="nitish") {
			System.out.println(UserName);
			
		}else {
			throw new Exception("UserName is INvaild");
		}
	}
	

}
