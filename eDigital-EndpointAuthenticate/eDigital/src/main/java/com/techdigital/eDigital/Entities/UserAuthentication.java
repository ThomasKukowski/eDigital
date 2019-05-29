import javax.persistence.*;

// This class is used to authenticate the user to ensure that their username and password combination are valid.
@Path("/authenticate")
public class UserAuthentication {
	
	//Using a get method for now since we just need to make sure it works and security isn't an issue right now.
	//Takes in the username and password and will connect to the database to pass them in.
	@Get
	public UserAuthentication(@PathParam("username") string userName, @PathParam("password") string password) {
		/*
		 * 		EntityManagerFactory factory = Persistence
		 * 				.createEntityManagerFactory("webapp");
				EntityManager entityManager = factory.createEntityManager();
		 */
		If(string username == test && string password == test1)
		{
			return ("Test passed");
		} else {
			return ("Test failed");
		}
		
		/*
		 * 	entityManager.close();
		 *	factory.close();
		 */
	}
}
