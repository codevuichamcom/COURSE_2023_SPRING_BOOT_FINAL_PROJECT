package com.funnycode.onlineshop.service.impl;

import com.funnycode.onlineshop.dto.ProductDTOResponse;
import com.funnycode.onlineshop.repository.ProductCategory;
import com.funnycode.onlineshop.service.ProductService;
import com.funnycode.onlineshop.mapper.ProductMapper;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    ProductCategory productCategory;

    @Override
    public List<ProductDTOResponse> getProductTrending() {
        return getRandomProductList(8);
    }

    @Override
    public List<ProductDTOResponse> getProductsBestSeller() {
        return getRandomProductList(8);
    }

    @Override
    public List<ProductDTOResponse> searchProduct() {
        return getRandomProductList(12);
    }

    private List<ProductDTOResponse> getRandomProductList(int end) {
        return productCategory.findAll().stream().map(ProductMapper::toProductDTOResponse).collect(Collectors.collectingAndThen(Collectors.toList(), collectedList -> {
            Collections.shuffle(collectedList);
            return collectedList.subList(0, Math.min(collectedList.size(), end));
        }));
    }

}
