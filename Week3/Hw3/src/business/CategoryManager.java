package business;

import core.logging.ILogger;
import dataAccess.ICategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private ICategoryDao categoryDao;
    private ILogger[] loggers;

    List<Category> categoryList = new ArrayList<>();

    public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers)
    {
        this.categoryDao = categoryDao;
        this.loggers =loggers;
    }

    public void add(Category category) throws Exception
    {
        for(Category c : categoryList)
        {
            if(c.getName().equals(category.getName())){
                throw new Exception("Category name has already exist!!");
            }
        }

        categoryDao.add(category);
        categoryList.add(category);
        for(ILogger logger : loggers){logger.log(category.getName());}
    }

    public void list()
    {
        for (Category category : categoryList)
        {
            System.out.println(category.getName());
        }
    }
}
