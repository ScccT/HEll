package com.erHigh.view;

import java.util.Scanner;

import com.erHigh.biz.UserBiz;
import com.erHigh.bizImpl.UserBizImpl;

public class UserLoginView extends View{

	@Override
	public View showView() {
		System.out.println(">>>>>>>>>用户登录");	
		for(int i=3;i>=0;i--) {
			if(i==0) {
				View v=new UserRegisterView();
				v.showView();
				break;
			}
		Scanner scan=new Scanner(System.in);
		System.out.println("用户名：");
		String userAccount=scan.next();
		System.out.println("密码：");
		String userPwd=scan.next();
		UserBiz ub=new UserBizImpl();
		if(ub.userlogin(userAccount, userPwd)) {
			System.out.println("===================");
			System.out.println("欢迎"+userAccount);		
			ub.showcar();
			ub.showView();
			break;
			}
		else {
			System.out.println("用户名或者密码错误请重新输入!");
			System.out.println("您还剩"+(i-1)+"次机会");	
		}
		}
		
		return null;
	}

}