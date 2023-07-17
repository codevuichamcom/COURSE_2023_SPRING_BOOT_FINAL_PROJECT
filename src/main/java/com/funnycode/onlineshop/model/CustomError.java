package com.funnycode.onlineshop.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomError {
    String code;
    String message;

    public static CustomError notFound(String message){
        return CustomError.builder()
                .code("404")
                .message(message)
                .build();
    }
}
