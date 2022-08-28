package com.potsoft.cartapi.service;

import com.potsoft.cartapi.exception.UnauthorizedException;
import com.potsoft.cartapi.model.Category;
import com.potsoft.cartapi.payload.ApiResponse;
import com.potsoft.cartapi.payload.PagedResponse;
import com.potsoft.cartapi.security.UserPrincipal;
import org.springframework.http.ResponseEntity;

public interface CategoryService {

	PagedResponse<Category> getAllCategories(int page, int size);

	ResponseEntity<Category> getCategory(Long id);

	ResponseEntity<Category> addCategory(Category category, UserPrincipal currentUser);

	ResponseEntity<Category> updateCategory(Long id, Category newCategory, UserPrincipal currentUser)
			throws UnauthorizedException;

	ResponseEntity<ApiResponse> deleteCategory(Long id, UserPrincipal currentUser) throws UnauthorizedException;

}
