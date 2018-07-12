package com.stackroute.keepnote.service;

import java.util.List;
import com.stackroute.keepnote.exception.CategoryNotFoundException;
import com.stackroute.keepnote.exception.NoteNotFoundException;
import com.stackroute.keepnote.exception.ReminderNotFoundException;
import com.stackroute.keepnote.model.Note;

/*
* Service classes are used here to implement additional business logic/validation 
* This class has to be annotated with @Service annotation.
* @Service - It is a specialization of the component annotation. It doesn�t currently 
* provide any additional behavior over the @Component annotation, but it�s a good idea 
* to use @Service over @Component in service-layer classes because it specifies intent 
* better. Additionally, tool support and additional behavior might rely on it in the 
* future.
* */
public class NoteServiceImpl implements NoteService {

	/*
	 * Autowiring should be implemented for the NoteDAO,CategoryDAO,ReminderDAO.
	 * (Use Constructor-based autowiring) Please note that we should not create any
	 * object using the new keyword.
	 */

	/*
	 * This method should be used to save a new note.
	 */

	public boolean createNote(Note note) throws ReminderNotFoundException, CategoryNotFoundException {
		return false;

	}

	/* This method should be used to delete an existing note. */

	public boolean deleteNote(int noteId) {
		return false;

	}
	/*
	 * This method should be used to get a note by userId.
	 */

	public List<Note> getAllNotesByUserId(String userId) {
		return null;

	}

	/*
	 * This method should be used to get a note by noteId.
	 */
	public Note getNoteById(int noteId) throws NoteNotFoundException {
		return null;

	}

	/*
	 * This method should be used to update a existing note.
	 */

	public Note updateNote(Note note, int id)
			throws ReminderNotFoundException, NoteNotFoundException, CategoryNotFoundException {
		return note;

	}

}
