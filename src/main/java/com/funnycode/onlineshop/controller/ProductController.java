package com.funnycode.onlineshop.controller;

import com.funnycode.onlineshop.dto.ProductDTOResponse;
import com.funnycode.onlineshop.service.ProductService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.funnycode.onlineshop.util.Constant.API_VERSION;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@RequestMapping(API_VERSION + "/products")
@CrossOrigin
public class ProductController {
    ProductService productService;
    @GetMapping("/trending")
    public List<ProductDTOResponse> getProductsTrending(){
        return  productService.getProductTrending();
    }

    @GetMapping("/best-seller")
    public List<ProductDTOResponse> getProductsBestSeller(){
        return  productService.getProductsBestSeller();
    }

    @GetMapping("/search")
    public List<ProductDTOResponse> searchProduct(){
        return  productService.searchProduct();
    }
}
