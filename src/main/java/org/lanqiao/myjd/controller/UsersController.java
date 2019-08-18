package org.lanqiao.myjd.controller;

import org.lanqiao.myjd.entity.Account;
import org.lanqiao.myjd.entity.Users;
import org.lanqiao.myjd.entity.UsersVo;
import org.lanqiao.myjd.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @Autowired
    UsersService usersService;

//    @RequestMapping("/checkUsersName")
//    public boolean selectUsersByName(String usersRealname) {
//        return usersService.selectUsersByName(usersRealname);
//    }

    @RequestMapping("/verify/checkUsersCard")
    public boolean selectUsersByCard(String usersCardid) {
        return usersService.selectUsersByCard(usersCardid);
    }

    @RequestMapping("/verify/insetUsers")
    public boolean insertUsers(@RequestBody UsersVo usersVo) {
        return usersService.insertUsers(usersVo);
    }
}
