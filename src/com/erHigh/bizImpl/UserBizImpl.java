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
			//��֤����
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
		System.out.println("���\t��������\t��ע\tƷ��\t����\t�۸�\t�Ƿ����");
		for(Car car:list) {
			System.out.print(car.getCarId()+"\t");
			System.out.print(car.getCarName()+"\t");
			System.out.print(car.getCarRemark());
			System.out.print(car.getCarBrand()+"("+car.getCarBrandNum()+")");
			System.out.print(car.getCarType()+"("+car.getCarTypeNum()+")"+"\t");
			System.out.print(car.getCarLendPrice()+"/��"+"\t");
			System.out.println(car.getCarIsRent()+"\t");
			}	
			
	}



	@Override
	public void showView() {
		
		System.out.println();
		System.out.println("����0�˳�");
		System.out.println("����1+�������   �����⳵����     ��1+2");
		System.out.println("����2+1  ���۸�������       2+2�۸�  ���۸��������� ");
		System.out.println("����3+���ͱ��      ����������");
		System.out.println("����4+Ʒ�Ʊ��      ��Ʒ������");
		System.out.println("����5    	�鿴ȫ������");
		System.out.println("����6            �鿴�ҵ��⳵��¼");
		System.out.println("����7+�������           ����");	
		System.out.println("�����룺");
		Scanner scan=new Scanner(System.in);
		String choice=scan.next();
		String num=choice.substring(0, 0);
		if(num.equals(0)) {
			System.out.println("��ӭ�´�������");
		}else if(num.equals(1)) {
			String u=choice.substring(2);
			int e=Integer.parseInt(u);
			
		}
		
		
		
		
		
		
		
		
	}
}
