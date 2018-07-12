package com.stackroute.keepnote.model;

import java.util.Date;

/*
 * The class "Note" will be acting as the data model for the Note Table in the database. 
 * Please note that this class is annotated with @Entity annotation. 
 * Hibernate will scan all package for any Java objects annotated with the @Entity annotation. 
 * If it finds any, then it will begin the process of looking through that particular 
 * Java object to recreate it as a table in your database.
 */
public class Note {
	/*
	 * This class should have eight fields
	 * (noteId,noteTitle,noteContent,noteStatus,createdAt,
	 * category,reminder,createdBy). Out of these eight fields, the field noteId
	 * should be primary key and auto-generated. This class should also contain the
	 * getters and setters for the fields along with the no-arg , parameterized
	 * constructor and toString method. The value of createdAt should not be
	 * accepted from the user but should be always initialized with the system date.
	 * annotate category and reminder field with @ManyToOne.
	 */

	public Note() {

	}

	public Note(int Int, String string, String string1, String string2, Date date, Category category, Reminder reminder,
			String string3) {

	}

	public int getNoteId() {
		return 0;
	}

	public void setNoteId(int Int) {

	}

	public String getNoteTitle() {
		return null;
	}

	public void setNoteTitle(String string) {

	}

	public String getNoteContent() {
		return null;
	}

	public void setNoteContent(String string) {

	}

	public void setNoteStatus(String string) {

	}

	public void setNoteCreatedAt(Date date) {
	}

	public void setCreatedBy(String string) {

	}

	public void setReminder(Reminder reminder) {

	}

	public void setCategory(Category category) {
	}

}
