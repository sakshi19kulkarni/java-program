package bank.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OperationBank {
	static Connection conn;
	static PreparedStatement pst;
	static ResultSet rs;
	int acno;
	String acname;
	String actype;
	float acbal;

	public void openAccount() throws SQLException {

		conn=DataBank.getConnection();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name");
		acname=sc.next();
		System.out.println("Enter Account number");
		acno=sc.nextInt();
		System.out.println("Enter Account type");
		actype=sc.next();
		System.out.println("Enter Account balance");
		acbal=sc.nextFloat();
		
		String sel="select * from myaccount where acno=?";
		
		pst=conn.prepareStatement(sel);
		pst.setInt(1, acno);
		rs=pst.executeQuery();
		
		if(!rs.next()) {
			String ins="insert into myaccount values(?,?,?,?)";
			pst=conn.prepareStatement(ins);
			pst.setInt(1, acno);
			pst.setString(2, acname);
			pst.setString(3, actype);
			pst.setFloat(4, acbal);
			int i=pst.executeUpdate();
			if(i>0) {
				System.out.println("Account created sucessfully");
			}else
			{
				System.out.println("Account not created");
			}
		}else {
			System.out.println("Account no "+acno +" doesn't exists");
		}
	
			pst.close();
			rs.close();
			conn.close();
		}
	
	
		
	public void showAccounts() throws SQLException {
	
		conn=DataBank.getConnection();
		String sel="select * from myaccount";
			pst=conn.prepareStatement(sel);
			
			ResultSet rs=pst.executeQuery();
			System.out.println("ACNO\tACNAME\tACTYPE\tACBAL");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getFloat(4));
			}

			pst.close();
			if(rs!=null) {
				rs.close();
			}
			conn.close();
		}
			
	

	public void depositAmount() throws SQLException {
	
		conn=DataBank.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number");
		acno=sc.nextInt();
		System.out.println("Enter the amount you want to deposit");
		float amt=sc.nextFloat();
		String sel="select * from myaccount where acno=?";
		pst=conn.prepareStatement(sel);
		pst.setInt(1, acno);
	    rs=pst.executeQuery();
	    
		if(rs.next()) {
			String up="update myaccount set acbal=acbal + ? where acno=?";
			pst=conn.prepareStatement(up);
			pst.setFloat(1, amt);
			pst.setInt(2, acno);
			int i=pst.executeUpdate();
			if(i>0) {
				System.out.println("Ammount deposited Sucessfully");
			}
			else {
				System.out.println("Not deposited");
			}
		}else {
			System.out.println("Account number doesn't exists");
			
			}
		pst.close();
		rs.close();
		conn.close();
		}
	
	
	public void withdrawAmount() throws SQLException {
		
		conn=DataBank.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account number");
		acno=sc.nextInt();
		System.out.println("Enter the amount you want to withdraw: ");  
        float amt = sc.nextFloat(); 
        
        String sel="select * from myaccount where acno=?";
		pst=conn.prepareStatement(sel);
		pst.setInt(1, acno);
		rs=pst.executeQuery();
		if(rs.next()) {
			String dp="update myaccount set acbal=acbal - ? where acno=?";
			pst=conn.prepareStatement(dp);
			pst.setFloat(1, amt);
			pst.setInt(2, acno);
			int i=pst.executeUpdate();
        if(i>0) {    
            System.out.println("Withdrawal Sucessfully !  ");  
        } else {  
            System.out.println("Not Withdraw" );  
        } 
    }else {
    	System.out.println("Account number doesn't exists");
        }
		pst.close();
		rs.close();
		conn.close();
	}
	
	
	public void showparticularAccount() throws SQLException  {
	
		conn=DataBank.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Account number");
		acno=sc.nextInt();
		
		String sel="select * from myaccount where acno=?";
		pst=conn.prepareStatement(sel);
		pst.setInt(1, acno);
		ResultSet rs=pst.executeQuery();
		System.out.println("ACNO\tACNAME\tACTYPE\tACBAL");
		if(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getFloat(4));
		}
		
          pst.close();
    	  if(rs!=null) {
    		  rs.close();
    	  }
    	  conn.close();
    	  }
      }
    	  
      
		
	