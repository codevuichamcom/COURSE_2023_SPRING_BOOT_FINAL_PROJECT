package com.funnycode.onlineshop.model.dto;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryDTOResponse {
    int id;
    String categoryName;
}
