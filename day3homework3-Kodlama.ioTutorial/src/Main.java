import business.CategoryManager;
import business.CourseManager;
import dataAccess.CourseDao;
import dataAccess.HibernateCategoryDao;
import dataAccess.JdbcCourseDao;
import entities.Category;
import entities.Course;
import logging.DatabaseLogger;
import logging.FileLogger;
import logging.Logger;
import logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course = new Course();
		course.setName("java");
		course.setPrice(15);

		Course course2 = new Course();
		course2.setName("java2");
		course2.setPrice(0);

		Category category = new Category();
		category.setName("software");

		Category category2 = new Category();
		category2.setName("software");

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category);
		//categoryManager.add(category2);

		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course);
		courseManager.add(course2);

	}

}
