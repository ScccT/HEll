package com.erHigh.bizImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.erHigh.bean.Car;
import com.erHigh.bean.User;
import com.erHigh.biz.UserBiz;
import com.erHigh.dao.UserDao;
import com.erHigh.daoImpl.UserDaoImpl;

public class UserBizImpl implements UserBiz{
		
		UserDao ud=new UserDaoImpl();
	
	
	
	@Override
	public boolean userlogin(String userAccount,String userPwd) {
			if(userAccount==null||userPwd==null||userAccount.length()==0||userPwd.length()==0) {
				return false;
			}

			User u=null;
			
			try {
				u=ud.getUserBYuserAccount(userAccount);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(u==null) {
				return false;
			}else
			//验证密码
			if(userPwd.equals(u.getUserPwd())) {
				return true;
			}
			
		
		
		
		return false;
	}



	@Override
	public boolean userregister(String userAccount, String userPwd) {
		if(userAccount==null||userPwd==null||userAccount.length()==0||userPwd.length()==0) {
			return false;
		}
		User u=null;
		
		u=ud.getregisterUser(userAccount, userPwd);
		if(userPwd.equals(u.getUserPwd())) {
			return true;
		}
		
		
		
		
		return false;
	}



	@Override
	public void showcar() {
		ArrayList<Car> list =new ArrayList();
		
		try {
			list=ud.getcarInfo();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("==========================================================================");
		System.out.println("编号\t汽车名称\t备注\t品牌\t类型\t价格\t是否可租");
		for(Car car:list) {
			System.out.print(car.getCarId()+"\t");
			System.out.print(car.getCarName()+"\t");
			System.out.print(car.getCarRemark());
			System.out.print(car.getCarBrand()+"("+car.getCarBrandNum()+")");
			System.out.print(car.getCarType()+"("+car.getCarTypeNum()+")"+"\t");
			System.out.print(car.getCarLendPrice()+"/天"+"\t");
			System.out.println(car.getCarIsRent()+"\t");
			}	
			
	}



	@Override
	public void showView() {
		
		System.out.println();
		System.out.println("输入0退出");
		System.out.println("输入1+汽车编号   进入租车订单     如1+2");
		System.out.println("输入2+1  按价格降序排序       2+2价格  按价格升序排序 ");
		System.out.println("输入3+类型编号      按类型搜索");
		System.out.println("输入4+品牌编号      按品牌搜索");
		System.out.println("输入5    	查看全部汽车");
		System.out.println("输入6            查看我的租车记录");
		System.out.println("输入7+汽车编号           还车");	
		System.out.println("请输入：");
		Scanner scan=new Scanner(System.in);
		String choice=scan.next();
		String num=choice.substring(0, 0);
		if(num.equals(0)) {
			System.out.println("欢迎下次再来！");
		}else if(num.equals(1)) {
			String u=choice.substring(2);
			int e=Integer.parseInt(u);
			
		}
		
		
		
		
		
		
		
		
	}
}
