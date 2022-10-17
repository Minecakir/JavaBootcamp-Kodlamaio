package dataAccess;

import entities.Course;

public class HibernateCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getName()+" added database with Hibernate");
    }

    @Override
    public void list() {
        System.out.println("Listed.");
    }
}
