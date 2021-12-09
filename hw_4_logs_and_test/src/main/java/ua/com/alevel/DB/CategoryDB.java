package ua.com.alevel.DB;

import ua.com.alevel.entity.Category;
import ua.com.alevel.entity.Items;

public interface CategoryDB extends BaseDB<Category> {
    Items[] findAllItems(Category category);
}