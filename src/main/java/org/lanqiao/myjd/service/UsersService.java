package org.lanqiao.myjd.service;

import org.lanqiao.myjd.entity.Account;
import org.lanqiao.myjd.entity.Users;
import org.lanqiao.myjd.entity.UsersVo;

public interface UsersService {
//    public boolean selectUsersByName(String usersRealname);
    public boolean selectUsersByCard(String usersCardid);
    public boolean insertUsers(UsersVo usersVo);
}
