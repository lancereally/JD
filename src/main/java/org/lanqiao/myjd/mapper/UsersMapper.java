package org.lanqiao.myjd.mapper;

import org.lanqiao.myjd.entity.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapper {
    //插入Users数据
    int insertUsers(Users users);
    //查询名字是否存在
//    int selectUsersByName(String usersRealname);
    //查询身份证号是否存在
    int selectUsersByCard(String usersCardid);

    int deleteByPrimaryKey(Integer usersId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer usersId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}