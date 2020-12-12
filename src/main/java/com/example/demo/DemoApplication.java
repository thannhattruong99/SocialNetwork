package com.example.demo;

import com.example.pojo.Account;
import com.example.service.AccountService;
import com.example.form.AccountForm;
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
import org.springframework.web.servlet.view.RedirectView;

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
    }

    @GetMapping("/getStudentAll")
    public List<Account> sayHello() {
        return accountService.getStudentAll();
    }

    @GetMapping("")
    public RedirectView init(){
        return new RedirectView("http://localhost:8080/swagger-ui/index.html?configUrl=/api-docs/swagger-config");
    }

//    @ApiOperation(value = "", authorizations = { @Authorization(value="jwtToken") })
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