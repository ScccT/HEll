package com.erHigh.view;

import java.util.Scanner;

public class UserMainView extends View{

	@Override
	public View showView() {
		for(int i=32;i>=0;i--) {
			if(i>16) {
			System.out.print("=");
			}else if(i==16) {
			System.out.println();
			System.out.println("欢迎访问二嗨租车");
			}else{System.out.print("=");	
			}
			}
		System.out.println();
		System.out.print("1.登录");
		System.out.print("2.注册");
		System.out.println("3.退出");
		Scanner scan=new Scanner(System.in);
		int choose=scan.nextInt();
		switch (choose) {
		case 1:
			View v1=new UserLoginView();
			v1.showView();
			break;
		case 2:
			View v2=new UserRegisterView();
			v2.showView();
			break;
		case 3:
			System.out.println("欢迎下次光临！");
	
			break;

		default:
			break;
		}
		
		
		
		
		
		
		
		
		return null;
	}

}
