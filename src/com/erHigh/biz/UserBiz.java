package com.erHigh.biz;

import java.sql.SQLException;

public interface UserBiz {
	//��¼
	public boolean userlogin(String userAccount,String userPwd) ;
	//ע��
	public boolean userregister(String userAccount,String userPwd);
	//�鿴������Ϣ
	public void showcar();
	//���ܲ˵�
	public void showView();
	
}
