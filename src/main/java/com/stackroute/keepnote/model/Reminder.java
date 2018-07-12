package com.stackroute.keepnote.model;

import java.util.Date;
import java.util.List;

/*
 * The class "Reminder" will be acting as the data model for the Reminder Table in the database. 
 * Please note that this class is annotated with @Entity annotation. 
 * Hibernate will scan all package for any Java objects annotated with the @Entity annotation. 
 * If it finds any, then it will begin the process of looking through that particular 
 * Java object to recreate it as a table in your database.
 */

public class Reminder {
	/*
	 * This class should have seven fields
	 * (reminderId,reminderName,reminderDescription,reminderType,
	 * reminderCreatedBy,reminderCreationDate,notes). Out of these seven fields, the
	 * field reminderId should be primary key and auto-generated. This class should
	 * also contain the getters and setters for the fields along with the no-arg ,
	 * parameterized constructor and toString method. The value of
	 * reminderCreationDate should not be accepted from the user but should be
	 * always initialized with the system date. annotate notes field with @OneToMany
	 * and @JsonIgnore
	 */

	public Reminder() {

	}

	public Reminder(int Int, String string, String string1, String string2, String string3, List<Note> list,
			Date date) {
	}

	public int getReminderId() {
		return 0;

	}

	public void setReminderId(int Int) {

	}

	public void setReminderName(String string) {

	}

	public String getReminderDescription() {
		return null;
	}

	public void setReminderDescription(String string) {

	}

	public void setReminderType(String string) {

	}

	public void setReminderCreationDate(Date date) {

	}

	public void setReminderCreatedBy(String string) {

	}

	public void setNotes(List<Note> list) {

	}

}
