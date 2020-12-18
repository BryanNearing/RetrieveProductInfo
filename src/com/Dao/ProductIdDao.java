package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Product.Product;

public class ProductIdDao {

	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hcl","admin","password");
		}catch(Exception e){
			System.out.println(e);
		}
		return con;
	}
	
	public static Product getRecordById(int id){
		Product p = null;
		try{
			Connection con = getConnection();
			PreparedStatement ps=con.prepareStatement("select * from products where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				p = new Product();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setDepartment(rs.getString("department"));
				p.setCost(rs.getFloat("cost"));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return p;
	}
	
	
}
