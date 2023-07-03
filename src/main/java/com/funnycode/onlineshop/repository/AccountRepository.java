package com.funnycode.onlineshop.repository;

import com.funnycode.onlineshop.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
