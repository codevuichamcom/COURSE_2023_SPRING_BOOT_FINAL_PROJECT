package com.funnycode.onlineshop.service;

import com.funnycode.onlineshop.dto.ProductDTOResponse;

import java.util.List;

public interface ProductService {
    List<ProductDTOResponse> getProductTrending();

    List<ProductDTOResponse> getProductsBestSeller();

    List<ProductDTOResponse> searchProduct();

    ProductDTOResponse getProductById(int id);
}
