package com.erHigh.view;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.erHigh.biz.UserBiz;
import com.erHigh.bizImpl.UserBizImpl;

public class UserRegisterView extends View{

	@Override
	public View showView() {
		
		UserBiz ub=new UserBizImpl();
		
		System.out.println(">>>>>>>用户注册");
		Scanner scan=new Scanner(System.in);
		while(true) {
		System.out.println("输入用户账号：");
		System.out.println("格式为：首位大写字母且不少与6位");
		String userAccount=scan.next();
		Pattern p = Pattern.compile("^[A-Z]{1}[a-zA-Z0-9_.]{6,16}");
		Matcher m = p.matcher(userAccount);
		if(m.matches()) {
			String userPwd;
			while(true) {
			System.out.println("请输入密码：");
			String userPwd1=scan.next();
			System.out.println("请再次输入密码：");
			String userPwd2=scan.next();
			if(userPwd1.equals(userPwd2)) {
				userPwd=userPwd1;
				break;
				}else {
					System.out.println("两次密码输入不一致！");}
				}
			if(ub.userregister(userAccount, userPwd)) {
			System.out.println("注册成功！");
			break;}
		else {System.out.println("注册失败！");}
			}
			}
		return null;
	}
	}