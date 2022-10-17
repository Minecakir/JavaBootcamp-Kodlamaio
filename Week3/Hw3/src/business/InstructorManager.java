package business;

import core.logging.ILogger;
import dataAccess.ICourseDao;
import dataAccess.IInstructorDao;
import entities.Instructor;

public class InstructorManager {
    private IInstructorDao instructorDao;
    private ILogger[] loggers;

    public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers)
    {
        this.instructorDao = instructorDao;
        this.loggers =loggers;
    }

    public void add(Instructor instructor)
    {
        instructorDao.add(instructor);
    }
}
