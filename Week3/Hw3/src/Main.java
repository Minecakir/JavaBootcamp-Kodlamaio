import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DbLogger;
import core.logging.ILogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.HibernateInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {

        //Create obj -- course
        Course course = new Course(1,"Java",5600);
        Course course2 = new Course(2,"JavaScript",5100);
        Course course3 = new Course(3,"React",6300);
        Course course4 = new Course(4,"React",6300);

        ILogger[] loggers = {new DbLogger()};

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course);
        courseManager.add(course2);
        courseManager.add(course3);

        //List Courses
        System.out.println("\n---Courses---");
        courseManager.list();

        //Create obj -- category
        Category category = new Category(1,"Backend");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
        categoryManager.add(category);

        //List Categories
        categoryManager.list();

        //Create obj -- instructor
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);
        Instructor instructor = new Instructor(1,"Engin Demirog");

        //Add instructor
        instructorManager.add(instructor);

        //Add course with same name --Throw Exp
        courseManager.add(course4);
    }
}
