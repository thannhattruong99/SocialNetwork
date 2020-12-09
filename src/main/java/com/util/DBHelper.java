package com.util;

import com.example.demo.DemoApplication;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import javax.ejb.Singleton;
import java.io.IOException;
import java.io.Reader;

@Service
public class DBHelper implements IDBHelper{
    @Override
    public SqlSessionFactory makeConnection() {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("SqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new SqlSessionFactoryBuilder().build(reader);
    }

    @Override
    public SqlSession openSession(){
        return  makeConnection().openSession();
    }

}
