package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Customer;
import utility.DBConn;

public class RegisterDAO {
	
	Connection conn;
	public RegisterDAO() throws Exception
	{
		conn = DBConn.getMySqlConnection();
	}
	
	public boolean registerCustomer(Customer customer) throws SQLException
	{
		PreparedStatement psmt = conn.prepareStatement("insert into customer values (?,?,?,?,?,?,?)");
		
		psmt.setString(1, customer.getName());
		psmt.setString(2, customer.getGender());
		psmt.setString(3, customer.getEmail());
		psmt.setString(4, customer.getUsername());
		psmt.setString(5, customer.getPasswd());
		psmt.setString(6, customer.getAddress());
		psmt.setString(7, customer.getPinCode());
		
		int row_eff=psmt.executeUpdate();
		
		if(row_eff>0)
			return true;
		else
			return false;
	}
	
	public Customer checkCredential(Customer cust) throws SQLException
	{
		PreparedStatement psmt = conn.prepareStatement("select * from Customer where username=? and acc_password=?");
		
		cust.getUsername();
		cust.getPasswd();
		
		psmt.setString(1, cust.getUsername());
		psmt.setString(2, cust.getPasswd());
		
		ResultSet rs = psmt.executeQuery();
		
		if(rs.next())
		{
			cust.setName(rs.getString(3));
		}
		else
		{
			cust=null;
		}
		
		return cust;
	}

}
