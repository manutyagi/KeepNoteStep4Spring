package com.stackroute.keepnote.dao;

import org.hibernate.SessionFactory;
import com.stackroute.keepnote.exception.UserNotFoundException;
import com.stackroute.keepnote.model.User;

/*
 * This class is implementing the UserDAO interface. This class has to be annotated with 
 * @Repository annotation.
 * @Repository - is an annotation that marks the specific class as a Data Access Object, 
 * thus clarifying it's role.
 * @Transactional - The transactional annotation itself defines the scope of a single database 
 * 					transaction. The database transaction happens inside the scope of a persistence 
 * 					context.  
 * */
public class UserDaoImpl implements UserDAO {

	/*
	 * Autowiring should be implemented for the SessionFactory.(Use
	 * constructor-based autowiring.
	 */

	public UserDaoImpl(SessionFactory sessionFactory) {

	}

	/*
	 * Create a new user
	 */

	public boolean registerUser(User user) {

		return false;
	}

	/*
	 * Update an existing user
	 */

	public boolean updateUser(User user) {

		return false;

	}

	/*
	 * Retrieve details of a specific user
	 */
	public User getUserById(String UserId) {

		return null;
	}

	/*
	 * validate an user
	 */

	public boolean validateUser(String userId, String password) throws UserNotFoundException {
		return false;

	}

	/*
	 * Remove an existing user
	 */
	public boolean deleteUser(String userId) {
		return false;

	}

}
