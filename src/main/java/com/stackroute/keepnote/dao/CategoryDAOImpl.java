package com.stackroute.keepnote.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import com.stackroute.keepnote.exception.CategoryNotFoundException;
import com.stackroute.keepnote.model.Category;

/*
 * This class is implementing the UserDAO interface. This class has to be annotated with 
 * @Repository annotation.
 * @Repository - is an annotation that marks the specific class as a Data Access Object, 
 * thus clarifying it's role.
 * @Transactional - The transactional annotation itself defines the scope of a single database 
 * 					transaction. The database transaction happens inside the scope of a persistence 
 * 					context.  
 * */
public class CategoryDAOImpl implements CategoryDAO {

	/*
	 * Autowiring should be implemented for the SessionFactory.(Use
	 * constructor-based autowiring.
	 */
	
	public CategoryDAOImpl(SessionFactory sessionFactory) {

	}

	/*
	 * Create a new category
	 */
	public boolean createCategory(Category category) {
		return false;

	}

	/*
	 * Remove an existing category
	 */
	public boolean deleteCategory(int categoryId) {
		return false;

	}
	/*
	 * Update an existing category
	 */

	public boolean updateCategory(Category category) {
		return false;

	}
	/*
	 * Retrieve details of a specific category
	 */

	public Category getCategoryById(int categoryId) throws CategoryNotFoundException {
		return null;

	}

	/*
	 * Retrieve details of all categories by userId
	 */
	public List<Category> getAllCategoryByUserId(String userId) {
		return null;

	}

}
