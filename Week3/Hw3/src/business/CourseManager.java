package business;

import core.logging.ILogger;
import dataAccess.ICourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager{
    private ICourseDao courseDao;
    private ILogger[] loggers;
    List<Course> courseList = new ArrayList<>();

    public CourseManager(ICourseDao courseDao,ILogger[] loggers)
    {
        this.courseDao = courseDao;
        this.loggers =loggers;
    }

    public void add(Course course) throws Exception {
        for(Course c : courseList)
        {
            if(c.getName().equals(course.getName())){
                throw new Exception("Course name has already exist!!");
            }
        }
        if(course.getPrice()<0){throw new Exception("Course price cannot be less than 0.");}

        courseDao.add(course);
        courseList.add(course);
        for(ILogger logger : loggers){logger.log(course.getName());}
    }

    public void list()
    {
        for (Course course : courseList)
        {
            System.out.println(course.getName()+" Price: "+course.getPrice());
        }
    }
}
