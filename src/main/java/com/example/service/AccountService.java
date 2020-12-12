package com.example.service;

import com.common.dto.Account;
import com.common.dao.mapper.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountDAO accountDAO;

    public List<Account> getStudentAll(){
        List<Account> listAccounts2 = accountDAO.getAll();
        return listAccounts2;
    }

}
