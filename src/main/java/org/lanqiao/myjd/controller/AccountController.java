package org.lanqiao.myjd.controller;

import org.lanqiao.myjd.entity.Account;
import org.lanqiao.myjd.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping("/register/checkphone")
    public boolean selectAccByPhone(long accPhone){
        return accountService.selectAccByPhone(accPhone);
    }

    @RequestMapping("/register/checkname")
    public boolean selectAccByName(String accName){
        return accountService.selectAccByName(accName);
    }

    @RequestMapping("/register/checkemail")
    public boolean selectAccByEmail(String accEmail){
        return accountService.selectAccByEmail(accEmail);
    }

    @RequestMapping("/register/insertAccount")
    public boolean insertAcc(HttpServletResponse response, Account account){
        Cookie cookie = new Cookie("accName",account.getAccName());
        cookie.setPath("/");
        response.addCookie(cookie);
        return accountService.insertAcc(account);
    }
}
