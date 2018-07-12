package com.stackroute.keepnote.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import com.stackroute.keepnote.exception.ReminderNotFoundException;
import com.stackroute.keepnote.model.Reminder;

/*
 * This class is implementing the UserDAO interface. This class has to be annotated with 
 * @Repository annotation.
 * @Repository - is an annotation that marks the specific class as a Data Access Object, 
 * thus clarifying it's role.
 * @Transactional - The transactional annotation itself defines the scope of a single database 
 * 					transaction. The database transaction happens inside the scope of a persistence 
 * 					context.  
 * */

public class ReminderDAOImpl implements ReminderDAO {
	
	/*
	 * Autowiring should be implemented for the SessionFactory.(Use
	 * constructor-based autowiring.
	 */

	public ReminderDAOImpl(SessionFactory sessionFactory) {

	}

	/*
	 * Create a new reminder
	 */

	public boolean createReminder(Reminder reminder) {
		return false;

	}
	
	/*
	 * Update an existing reminder
	 */

	public boolean updateReminder(Reminder reminder) {
		return false;

	}

	/*
	 * Remove an existing reminder
	 */
	
	public boolean deleteReminder(int reminderId) {
		return false;

	}

	/*
	 * Retrieve details of a specific reminder
	 */
	
	public Reminder getReminderById(int reminderId) throws ReminderNotFoundException {
		return null;

	}

	/*
	 * Retrieve details of all reminders by userId
	 */
	
	public List<Reminder> getAllReminderByUserId(String userId) {
		return null;

	}

}
