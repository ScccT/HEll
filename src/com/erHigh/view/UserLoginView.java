package com.erHigh.view;

import java.util.Scanner;

import com.erHigh.biz.UserBiz;
import com.erHigh.bizImpl.UserBizImpl;

public class UserLoginView extends View{

	@Override
	public View showView() {
		System.out.println(">>>>>>>>>�û���¼");	
		for(int i=3;i>=0;i--) {
			if(i==0) {
				View v=new UserRegisterView();
				v.showView();
				break;
			}
		Scanner scan=new Scanner(System.in);
		System.out.println("�û�����");
		String userAccount=scan.next();
		System.out.println("���룺");
		String userPwd=scan.next();
		UserBiz ub=new UserBizImpl();
		if(ub.userlogin(userAccount, userPwd)) {
			System.out.println("===================");
			System.out.println("��ӭ"+userAccount);		
			ub.showcar();
			ub.showView();
			break;
			}
		else {
			System.out.println("�û������������������������!");
			System.out.println("����ʣ"+(i-1)+"�λ���");	
		}
		}
		
		return null;
	}

}