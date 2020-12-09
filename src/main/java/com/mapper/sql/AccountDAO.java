package com.mapper.sql;

import com.example.pojo.Account;
import com.util.IDBHelper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Repository
public class AccountDAO {

//    @Qualifier("DBHelper")
    @Autowired
    IDBHelper idbHelper;

    public List<Account> getAll(){
        SqlSession session = idbHelper.openSession();
        List<Account> listAccounts = session.selectList("com.mapper.sql.AccountDAO.selectAll");
        return listAccounts;
    }
}