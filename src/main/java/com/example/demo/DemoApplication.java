package com.example.demo;

import com.example.pojo.Account;
import com.example.service.AccountService;
import com.form.AccountForm;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@Configuration
@SpringBootApplication
@RestController
@ComponentScan(basePackages = {"com.util", "com.example", "com.mapper.sql"})
public class DemoApplication {
//    @Qualifier("DBHelper")
//    @Autowired
//    IDBHelper idbHelper;

    @Autowired
    AccountService accountService;


    public static void main(String[] args) throws IOException {
        SpringApplication.run(DemoApplication.class, args);
//        Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//        SqlSession session = sqlSessionFactory.openSession();
//
////         create student mapper
////        AccountMapper studentMapper = session.getMapper(AccountMapper.class);
//
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//
////        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        DBHelper dbHelper = (DBHelper) context.getBean("SqlConnectionDB");
////        SqlSession session = dbHelper.makeConnection().openSession();
//        // show list student
//        List<Account> listAccounts = session.selectList("com.mapper.sql.AccountDAO.selectAll");
//        for (Account account : listAccounts) {
//            System.out.println(account.toString());
//        }
//
//        // close session
//        session.close();
    }

    @GetMapping("/getStudentAll")
    public List<Account> sayHello() {


//        AccountDAO accountDAO = new AccountDAO(idbHelper);
//        List<Account> listAccounts2 = accountDAO.getAll();
//        for (Account account : listAccounts2) {
//            System.out.println(account.toString());
//        }

        return accountService.getStudentAll();
    }

    @ApiOperation(value = "", authorizations = { @Authorization(value="jwtToken") })
    @RequestMapping(value = "/createAnAccount", method = RequestMethod.POST)
    public String createAnAccount(Model model, //
                                  @ModelAttribute("account") @Valid AccountForm account, //
                                  BindingResult result) {
        if (result.hasErrors()) {
            for (Object object : result.getAllErrors()) {
                if (object instanceof FieldError) {
                    FieldError fieldError = (FieldError) object;

                    System.out.println(fieldError.getCode());
                }

                if (object instanceof ObjectError) {
                    ObjectError objectError = (ObjectError) object;

                    System.out.println(objectError.getCode());
                }
            }
            return "error";
        }

        return "Ngon";
    }
}