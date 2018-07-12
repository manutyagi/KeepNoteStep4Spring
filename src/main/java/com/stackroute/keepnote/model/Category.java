package com.stackroute.keepnote.model;

import java.util.Date;
import java.util.List;

/*
 * The class "Category" will be acting as the data model for the Category Table in the database. 
 * Please note that this class is annotated with @Entity annotation. 
 * Hibernate will scan all package for any Java objects annotated with the @Entity annotation. 
 * If it finds any, then it will begin the process of looking through that particular 
 * Java object to recreate it as a table in your database.
 */
public class Category {
	/*
	 * This class should have six fields
	 * (categoryId,categoryName,categoryDescription,
	 * categoryCreatedBy,categoryCreationDate,notes). Out of these six fields, the
	 * field categoryId should be primary key and auto-generated. This class should
	 * also contain the getters and setters for the fields along with the no-arg ,
	 * parameterized constructor and toString method. The value of
	 * categoryCreationDate should not be accepted from the user but should be
	 * always initialized with the system date. annotate notes field with @OneToMany
	 * and @JsonIgnore
	 */

	public Category() {

	}

	public Category(int Int, String string, String string1, Date date, String string2, List<Note> list) {

	}

	public void setCategoryId(int Int) {

	}

	public int getCategoryId() {
		return 0;
	}

	public String getCategoryName() {
		return null;
	}

	public void setCategoryName(String string) {

	}

	public String getCategoryDescription() {
		return null;
	}

	public void setCategoryDescription(String string) {

	}

	public void setCategoryCreationDate(Date date) {

	}

	public void setCategoryCreatedBy(String string) {

	}

	public void setNotes(List<Note> list) {

	}

}