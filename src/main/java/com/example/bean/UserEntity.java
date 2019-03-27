package com.example.bean;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;


@TableName("user_entity")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String userName;
	private String passWord;
	private String userSex;
	private String nickName;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


}
