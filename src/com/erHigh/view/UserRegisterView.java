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
		
		System.out.println(">>>>>>>�û�ע��");
		Scanner scan=new Scanner(System.in);
		while(true) {
		System.out.println("�����û��˺ţ�");
		System.out.println("��ʽΪ����λ��д��ĸ�Ҳ�����6λ");
		String userAccount=scan.next();
		Pattern p = Pattern.compile("^[A-Z]{1}[a-zA-Z0-9_.]{6,16}");
		Matcher m = p.matcher(userAccount);
		if(m.matches()) {
			String userPwd;
			while(true) {
			System.out.println("���������룺");
			String userPwd1=scan.next();
			System.out.println("���ٴ��������룺");
			String userPwd2=scan.next();
			if(userPwd1.equals(userPwd2)) {
				userPwd=userPwd1;
				break;
				}else {
					System.out.println("�����������벻һ�£�");}
				}
			if(ub.userregister(userAccount, userPwd)) {
			System.out.println("ע��ɹ���");
			break;}
		else {System.out.println("ע��ʧ�ܣ�");}
			}
			}
		return null;
	}
	}