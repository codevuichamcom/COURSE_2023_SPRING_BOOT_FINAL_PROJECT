package com.funnycode.onlineshop.service;

import com.funnycode.onlineshop.model.dto.AccountDTOCreate;
import com.funnycode.onlineshop.model.dto.AccountDTOResponse;
import com.funnycode.onlineshop.model.dto.LoginDTORequest;
import com.funnycode.onlineshop.model.dto.LoginDTOResponse;

public interface AccountService {
    AccountDTOResponse createAccount(AccountDTOCreate accountDTOCreate);

    LoginDTOResponse login(LoginDTORequest loginDTORequest);
}
