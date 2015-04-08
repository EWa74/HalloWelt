package de.jave2enterprise.onlinebanking.authorization;

public class Authorization {
	public static void check(String user, String password) throws AuthorizationException{
		if(
				user !=null && password !=null &&
				user.equals("admin")&& password.equals("admin")){
			System.out.println("Autorisierung erfolgt!");
		}else {
			throw new AuthorizationException("Autorisierung fehlgeschlagen!");
		}
	}

}
