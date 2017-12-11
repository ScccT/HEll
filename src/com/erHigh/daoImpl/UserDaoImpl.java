package com.erHigh.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.erHigh.bean.Car;
import com.erHigh.bean.User;
import com.erHigh.dao.UserDao;
import com.erHigh.tools.DBHelper;



public class UserDaoImpl implements UserDao {

	
	private Connection mConnection;
	private PreparedStatement mStatement;
	private ResultSet rSet;
	
	private DBHelper mDB;
	public UserDaoImpl() {
		mDB = new DBHelper();
		mConnection = mDB.getConnection();
	}
	
	
	@Override
	public User getUserBYuserAccount(String userAccount) throws SQLException {
		
		try {
			mStatement=mConnection.prepareStatement("select * from Car_User where userAccount=?");
			mStatement.setString(1, userAccount);
			rSet=mStatement.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(rSet==null) {
			return null;
		}
		User u=new User();
		while(rSet.next()) {
			u.setUserId(rSet.getInt("userId"));
			u.setUserAccount(rSet.getString("userAccount"));
			u.setUserPwd(rSet.getString("userPwd"));
			u.setUserStatus(rSet.getInt("userStatus"));
		}
		
		return u;
	}


	@Override
	public User getregisterUser(String userAccount, String userPwd) {
		
		try {
			mStatement=mConnection.prepareStatement("insert into Car_User values(user_seq.nextval,?,?,default)");
			mStatement.setString(1, userAccount);
			mStatement.setString(2,userPwd);
			rSet=mStatement.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		User u=null;
		try {
			u=getUserBYuserAccount(userAccount);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(u==null) {
			return null;
		} 
			
		
		return u;
	}


	@Override
	public ArrayList<Car> getcarInfo() throws SQLException  {
		ArrayList<Car> list=new ArrayList();
	
		
		try {
			mStatement=mConnection.prepareStatement("select * from Car");
			rSet=mStatement.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(rSet.next()) {
			Car c=new Car();
			c.setCarId(rSet.getInt("CARID"));
			c.setCarName(rSet.getString("CARNAME"));
			c.setCarRemark(rSet.getString("CARREMARK"));
			c.setCarBrand(rSet.getString("CARBRAND"));
			c.setCarBrandNum(rSet.getInt("CARBRANDNUM"));
			c.setCarType(rSet.getString("CARTYPE"));
			c.setCarTypeNum(rSet.getInt("CARTYPENUM"));
			c.setCarPrice(rSet.getInt("CARPRICE"));
			c.setCarLendPrice(rSet.getInt("CARLENDPRICE"));
			c.setCarIsRent(rSet.getInt("CARISRENT"));
			c.setCarIsGrouding(rSet.getInt("CARISGROUDING"));
			list.add(c);
			}
		
		return list;
	}

}
