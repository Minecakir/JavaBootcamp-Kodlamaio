package dataAccess;

import entities.Course;

public class JdbcCourseDao implements ICourseDao{
    @Override
    public void add(Course course) {
        System.out.println(course.getName()+ " added database with Jdbc");
    }

    @Override
    public void list() {
        System.out.println("Listed.");
    }
}
