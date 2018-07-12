package com.stackroute.keepnote.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import com.stackroute.keepnote.exception.NoteNotFoundException;
import com.stackroute.keepnote.model.Note;

/*
 * This class is implementing the UserDAO interface. This class has to be annotated with 
 * @Repository annotation.
 * @Repository - is an annotation that marks the specific class as a Data Access Object, 
 * thus clarifying it's role.
 * @Transactional - The transactional annotation itself defines the scope of a single database 
 * 					transaction. The database transaction happens inside the scope of a persistence 
 * 					context.  
 * */

public class NoteDAOImpl implements NoteDAO {

	/*
	 * Autowiring should be implemented for the SessionFactory.(Use
	 * constructor-based autowiring.
	 */

	public NoteDAOImpl(SessionFactory sessionFactory) {

	}

	/*
	 * Create a new note
	 */
	
	public boolean createNote(Note note) {
		return false;

	}

	/*
	 * Remove an existing note
	 */
	
	public boolean deleteNote(int noteId) {
		return false;
	}

	/*
	 * Retrieve details of all notes by userId
	 */
	
	public List<Note> getAllNotesByUserId(String userId) {
		return null;

	}

	/*
	 * Retrieve details of a specific note
	 */
	
	public Note getNoteById(int noteId) throws NoteNotFoundException {
		return null;

	}

	/*
	 * Update an existing note
	 */

	public boolean UpdateNote(Note note) {
		return false;

	}

}
