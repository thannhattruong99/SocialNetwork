package com.mapper.sql;

import com.example.pojo.Account;
import com.util.IDBHelper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDAO extends BaseDAO{
    public AccountDAO(IDBHelper idbHelper) {
        super(idbHelper);
    }

    public List<Account> getAll(){
        List<Account> listAccounts = sqlSession.selectList("com.mapper.sql.AccountDAO.selectAll");
        return listAccounts;
    }
}