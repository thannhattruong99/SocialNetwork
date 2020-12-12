package com.example.service;

import com.example.pojo.Account;
import com.mapper.sql.AccountDAO;
import com.util.DBHelper;
import com.util.IDBHelper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
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
