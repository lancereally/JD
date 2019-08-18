package org.lanqiao.myjd.service;

import org.lanqiao.myjd.entity.Account;

public interface AccountService {
    public boolean selectAccByPhone(long accPhone);
    public boolean selectAccByName(String accName);
    public boolean selectAccByEmail(String accEmail);
//    public boolean updateAccUsersId(String accName,int usersId);
    public boolean insertAcc(Account account);
}
