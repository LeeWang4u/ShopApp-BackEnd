package com.project.shopapp.services;

import com.project.shopapp.dtos.CategoryDTO;
import com.project.shopapp.models.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICategoryService {
    Category createCategory(CategoryDTO categoryDTO);
    Category getCategoryById(long Id);
    List<Category> getAllCategories();
    Category updateCategory(long CategoryId, CategoryDTO categoryDTO);
    void deleteCategory(long Id);
}
