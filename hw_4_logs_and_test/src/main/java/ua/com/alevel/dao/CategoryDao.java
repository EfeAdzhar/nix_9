package ua.com.alevel.dao;
import ua.com.alevel.entity.Category;
import ua.com.alevel.entity.Items;
    public interface CategoryDao extends BaseDao<Category> {
        Items[] findAllItems(Category category);
    }

