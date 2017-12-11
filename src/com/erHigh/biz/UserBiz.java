package com.erHigh.biz;

import java.sql.SQLException;

public interface UserBiz {
	//登录
	public boolean userlogin(String userAccount,String userPwd) ;
	//注册
	public boolean userregister(String userAccount,String userPwd);
	//查看汽车信息
	public void showcar();
	//功能菜单
	public void showView();
	
}
