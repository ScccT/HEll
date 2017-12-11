package com.erHigh.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.erHigh.bean.Car;
import com.erHigh.bean.User;

public interface UserDao {
//登录
public  User getUserBYuserAccount(String userAccount) throws SQLException;
//注册	
public User getregisterUser(String userAccount,String userPwd);
//查看汽车信息
public ArrayList<Car> getcarInfo() throws SQLException;
	
}
