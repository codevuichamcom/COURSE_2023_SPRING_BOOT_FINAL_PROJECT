package com.funnycode.onlineshop.controller;

import com.funnycode.onlineshop.model.dto.AccountDTOCreate;
import com.funnycode.onlineshop.model.dto.AccountDTOResponse;
import com.funnycode.onlineshop.service.AccountService;
import com.funnycode.onlineshop.util.Constant;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.funnycode.onlineshop.util.Constant.*;


@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequestMapping(API_VERSION + "/accounts")
public class AccountController {
    AccountService accountService;

    @PostMapping
    public AccountDTOResponse createAccount(@RequestBody AccountDTOCreate accountDTOCreate) {
        return accountService.createAccount(accountDTOCreate);
    }
}
