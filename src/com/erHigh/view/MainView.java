package com.erHigh.view;

import java.util.Scanner;

public class MainView extends View{
	
	
	public View showView() {
		for(int i=100;i>=0;i--) {
			if(i>50) {
			System.out.print("*");
			}else if(i==50) {
			System.out.println();
			System.out.println("\t\t��ӭ���ʶ����⳵");
			}else{System.out.print("*");	
			}
			}
		System.out.println();
		System.out.print("1���û���������");
		System.out.println("2������Ա��������");
		System.out.print("��ѡ��");
		Scanner scan=new Scanner(System.in);
		int choose=scan.nextInt();
		switch (choose) {
		case 1:
			View v1=new UserMainView();
				v1.showView();
			break;
		case 2:
			View v2=new AdminMainView();
				v2.showView();
			break;
		default:
			break;
		}
		
		
		
		
		
		
		
		return null;
	}
	


}

