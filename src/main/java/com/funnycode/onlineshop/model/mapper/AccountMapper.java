package com.funnycode.onlineshop.model.mapper;

import com.funnycode.onlineshop.entity.Account;
import com.funnycode.onlineshop.model.TokenPayload;
import com.funnycode.onlineshop.model.dto.AccountDTOCreate;
import com.funnycode.onlineshop.model.dto.AccountDTOResponse;

public class AccountMapper {
    public static Account toAccount(AccountDTOCreate accountDTOCreate) {
        return Account.builder()
                .username(accountDTOCreate.getUsername())
                .email(accountDTOCreate.getEmail())
                .password(accountDTOCreate.getPassword())
                .build();
    }

    public static AccountDTOResponse toAccountDTOResponse(Account account) {
        return AccountDTOResponse.builder()
                .id(account.getId())
                .username(account.getUsername())
                .email(account.getEmail())
                .build();
    }

    public static TokenPayload toTokenPayload(Account account) {
        return TokenPayload.builder()
                .accountId(account.getId())
                .username(account.getUsername())
                .build();
    }
}
