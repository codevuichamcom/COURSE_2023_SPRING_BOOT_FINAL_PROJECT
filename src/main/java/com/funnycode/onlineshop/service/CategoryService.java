package com.funnycode.onlineshop.service;

import com.funnycode.onlineshop.model.dto.CategoryDTOCreate;
import com.funnycode.onlineshop.model.dto.CategoryDTOResponse;
import com.funnycode.onlineshop.model.dto.CategoryDTOUpdate;

import java.util.List;

public interface CategoryService {
    CategoryDTOResponse createCategory(CategoryDTOCreate categoryDTOCreate);

    List<CategoryDTOResponse> getAllCategories();

    CategoryDTOResponse getCategoryById(int id);

    CategoryDTOResponse updateCategory(int id, CategoryDTOUpdate categoryDTOUpdate);

    CategoryDTOResponse deleteCategory(int id);
}
