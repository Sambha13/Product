package PRODUCT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductOperation {
	
	 static Connection conn;
	  static {
		 try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","sql@123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	
	
	
	
	
	
	boolean login (String user,String pass)
	{
		ResultSet rs=null;
		Statement stmt=null;
		String query="select * from login_info2 where username='"+user+"' and password='"+pass+"'";
		
		try {
			stmt=conn.createStatement();
			
			rs=stmt.executeQuery(query);
			
			if(rs.next())
			{
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
		
		
	}
	
	
	void signup(String user ,String pass)
	{
		
		Statement stmt=null;
		String query="insert into login_info(username,password) values('"+user+"','"+pass+"')";
		
		try {
			stmt=conn.createStatement();
			
			stmt.executeUpdate(query);
			
			System.out.println("Sign up successful");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void AddRpoduct(String name,Double price,String category)
	{
		Statement stmt=null;
		
		String query="insert into product_data values(0,'"+name+"',"+price+",'"+category+"')";
		
		try {
			stmt=conn.createStatement();
			
			stmt.executeUpdate(query);
			
			System.out.println("Product inserted succssfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("Product inserted successfully");
	}
	
	
	//update method
	
	void UpdateProductName(String name,int id)
	{
		Statement stmt=null;
		String query="update  product_date set product_name='"+name+"' where product_id="+id+"";
		
		
	try {
		stmt=conn.createStatement();
		stmt.executeUpdate(query);
		
		System.out.println("Product Name Upadated");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	}
	
	void UpdateProductPrice(double price,int id)
	{
		Statement stmt=null;
		String query="update product_date set product_name="+price+" where product_id="+id+"";
		
		
		try {
			stmt=conn.createStatement();
			stmt.executeUpdate(query);
			
			System.out.println("Product Price Upadated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	void UpadteProductCategory(String category,int id)
	{
		Statement stmt=null;
		String query="update product_date set product_name='"+category+"' where product_id="+id+"";
		try {
			stmt=conn.createStatement();
			stmt.executeUpdate(query);
			
			System.out.println("Product category Upadated");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void deleteProduct(int id)
	{
		
		Statement stmt=null;
		String query="delete product_date  where product_id="+id+"";
		try {
			stmt=conn.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Deleted product succssfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
