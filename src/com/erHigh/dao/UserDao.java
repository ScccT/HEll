package com.erHigh.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.erHigh.bean.Car;
import com.erHigh.bean.User;

public interface UserDao {
//��¼
public  User getUserBYuserAccount(String userAccount) throws SQLException;
//ע��	
public User getregisterUser(String userAccount,String userPwd);
//�鿴������Ϣ
public ArrayList<Car> getcarInfo() throws SQLException;
	
}
