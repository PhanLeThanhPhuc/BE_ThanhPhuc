package javaOracleWebix.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private int  maKhachHang;
	private String tenKhachHang;
	private String diaChi;	
	private String mail;
	private String phone;
	private String image;
	private Date birthday;
	private String isuse;
	private String roleid;
	
}
