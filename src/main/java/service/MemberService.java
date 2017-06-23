package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

import bean.Member;
import bean.AppDetails;

public class MemberService {

	//MemberService memberService=new MemberService();
	
	public String verifydetails(int usernumber){
		String x = null;
		String y = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			} 
			catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
											 }
		
		
		 	String connectionUrl = "jdbc:mysql://localhost:3306/test";
		    String dbUser = "root";
		    String dbPwd = "admin";
		    
		    System.out.println("entered in dao");
		    String queryString = "SELECT status FROM userdetail where userid =" + usernumber;
		    ResultSet rs;
		    
		    try {
				Connection conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);			
				Statement stmt = conn.createStatement();				 
		        rs = stmt.executeQuery(queryString);		    
		        while(rs.next())
		        {
		        	System.out.println("entered in while loop");	
		        	x = rs.getString(1);		        	
		        	System.out.println("Status is " + x);
		        	
		        	if( x.equals("A") )
		        		y = "Active";
		        	else if(x.equals("I"))
		        		y = "Inactive";
				    
				    System.out.println("status is " + y);
		        }
		       
		        } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		    
		
	return y;
	
	}
	
	
	public List<AppDetails> getappdetails(int appid) {
		
		  try
		    {
		      // loads com.mysql.jdbc.Driver into memory
		      Class.forName("com.mysql.jdbc.Driver");
		    } 
		    catch (ClassNotFoundException cnf) 
		    {
		      System.out.println("Driver could not be loaded: " + cnf);
		    }
		 
		
		  List<AppDetails> details = new LinkedList<AppDetails>();
		
	/*	 String connectionUrl = "jdbc:mysql://localhost:3306/premium";*/
			 String connectionUrl = "jdbc:mysql://localhost:3306/test";
		    String dbUser = "root";
		    String dbPwd = "admin";
		    Connection conn;
		    ResultSet rs;
		    String queryString = "SELECT * FROM appstream where appid =" + appid;
		 
		    try
		    {
		      conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
		      Statement stmt = conn.createStatement();
		 
		        rs = stmt.executeQuery(queryString);
		        
		      int count=0;
		      System.out.println("ID \tNAME");
		      System.out.println("============"+rs.getFetchSize());
		      while(rs.next())
		      {
		    	  count++;
		        AppDetails m = new AppDetails();
		        m.setSno(rs.getInt(1));		       
		        m.setAppid(rs.getString(2));
		        m.setAppname(rs.getString(3));
		        m.setUpstream(rs.getString(4));
		        m.setDownstream(rs.getString(5));
		        
		        System.out.println("count : "+count);
		        details.add(m);
		      }


		        if (conn != null)
		        {
		         conn.close();
		         conn = null;
		        }
		    }
		    catch (SQLException sqle) 
		    {
		      System.out.println("SQL Exception thrown: " + sqle);
		    }
		    
		return details;
	}

	
	
	
	
	
	
	public List<Member> getAllMembers() {
		
		  try
		    {
		      // loads com.mysql.jdbc.Driver into memory
		      Class.forName("com.mysql.jdbc.Driver");
		    } 
		    catch (ClassNotFoundException cnf) 
		    {
		      System.out.println("Driver could not be loaded: " + cnf);
		    }
		 
		
		  List<Member> member = new LinkedList<Member>();
		
	/*	 String connectionUrl = "jdbc:mysql://localhost:3306/premium";*/
			 String connectionUrl = "jdbc:mysql://localhost:3306/test";
		    String dbUser = "root";
		    String dbPwd = "admin";
		    Connection conn;
		    ResultSet rs;
		    String queryString = "SELECT *FROM premium;";
		 
		    try
		    {
		      conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
		      Statement stmt = conn.createStatement();
		 
		        rs = stmt.executeQuery(queryString);
		      int count=0;
		      System.out.println("ID \tNAME");
		      System.out.println("============"+rs.getFetchSize());
		      while(rs.next())
		      {
		    	  count++;
		     /*   System.out.print(rs.getInt(1) + ".\t" + rs.getString(2));*/
		        System.out.println();
		        Member m= new Member();
		        m.setSampleMemberDataId(rs.getInt(3));
		        System.out.print("values of policy from dao" + m.getSampleMemberDataId());
		        m.setPolicyNumber(rs.getString(1));
		        System.out.print("values of policy from dao" + m.getPolicyNumber());
		        m.setApplicantName(rs.getString(2));
		        m.setDoorNumber(rs.getString(3));
		          
		        m.setStreet(rs.getString(5));
		        m.setCity(rs.getString(6));
	            m.setStateCode(rs.getString(7));
	            m.setCountryCode(rs.getString(8));
	       /*    m.setZipCode(rs.getInt(9));*/
	           m.setCellPhoneNumber(rs.getString(10));
	           m.setDateOfBirth(rs.getString(11));
	           m.setGender(rs.getString(12));
	           m.setSsn(rs.getString(13));
	           m.setBenefitCoverageAmount(rs.getInt(14));
	           m.setDatePolicyApplied(rs.getString(15));
	           m.setStudentOfIndia(rs.getString(16));
	           m.setHazardousOccupation(rs.getString(17));
	           m.setHeartDiseasePresent(rs.getString(18));
	           m.setInvolvedInAviationActivities(rs.getString(19));
	           m.setDrinkingSmokingHabits(rs.getString(20));
	           m.setPremiumFrequency(rs.getInt(21)); 
	           m.setAgentCode(rs.getString(22));
	           m.setPolicyEffectiveDate(rs.getString(23));
	           m.setPremiumAmount(rs.getInt(24));
	           m.setSpecialistVisitsAllowed(rs.getInt(25));
	           m.setProcessDate(rs.getString(26));
	           m.setPolicyStatus(rs.getString(27));
	           System.out.println("  plcy stats : "+rs.getString(27));	           
	           System.out.println("count : "+count);
		     member.add(m);
		      }
		      if (conn != null)
		      {
		        conn.close();
		        conn = null;
		      }
		    }
		    catch (SQLException sqle) 
		    {
		      System.out.println("SQL Exception thrown: " + sqle);
		    }
	
		
		
		
		
		return member;
	}
	
	
	
}
