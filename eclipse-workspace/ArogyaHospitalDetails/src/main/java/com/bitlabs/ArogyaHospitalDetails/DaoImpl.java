package com.bitlabs.ArogyaHospitalDetails;
import java.sql.*;
public class DaoImpl implements DaoInterface {
    Connection con=null;
    DaoImpl(){
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    public void patientRegistration(PatientInfo p) {
    	try {
    		PreparedStatement pstmt=con.prepareStatement("insert into PatientInfo values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
    		    pstmt.setString(1, null);
    		    pstmt.setString(2,p.getName());
    		    pstmt.setString(3, p.getGender());
    		    pstmt.setString(4, p.getCity());
    		    pstmt.setInt(5,p.getAge());
    		    pstmt.setLong(6,p.getAadharcard());
    		    pstmt.setLong(7,p.getContact());
    		    pstmt.setString(8,p.getAadress());
    		    pstmt.setString(9, p.getDateofadmission());
    		    pstmt.setString(10,p.getG_name());
    		    pstmt.setString(11,p.getG_aadress());
    		    pstmt.setLong(12,p.getG_contact());
    		    pstmt.setString(13,p.getRecovery());
    		  int i=pstmt.executeUpdate();
    		  if(i>0) {
    			  System.out.println("patient data inserted successfully");
    		  }
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    public void viewAllPatient() {
    	try {
    		Statement st=con.createStatement();
    		ResultSet rs=st.executeQuery("select * from PatientInfo");
    		while(rs.next()) {
    			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getLong(6)+" "+rs.getLong(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getLong(12)+" "+rs.getString(13));
    		}
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
    public void searchPatientById(int id) {
    	try {
    		Statement st=con.createStatement();
    		ResultSet rs=st.executeQuery("select * from PatientInfo where id='"+id+"'");
    		while(rs.next()) {
    			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getLong(6)+" "+rs.getLong(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getLong(12)+" "+rs.getString(13));
    		}
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    	}
    public void deletePatientById(int id) {
    	try {
    		Statement st=con.createStatement();
    		int i=st.executeUpdate("delete from PatientInfo where id='"+id+"'");
    		if(i!=0) {
    			System.out.println("patient has been delete succefully:");
    		}
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
    public void searchPatientByCity(String city) {
    	try {
    		Statement st=con.createStatement();
    		ResultSet rs=st.executeQuery("select * from PatientInfo where city='"+city+"'");
    		while(rs.next()) {
    			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getLong(6)+" "+rs.getLong(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getLong(12)+" "+rs.getString(13));
    		}
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    	}
    public void searchPatientByAgeGroup(int start,int end) {
    	try {
    		Statement st=con.createStatement();
    		ResultSet rs=st.executeQuery("select * from PatientInfo where age between '"+start+"'and '"+end+"'");
    		while(rs.next()) {
    			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getLong(6)+" "+rs.getLong(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getLong(12)+" "+rs.getString(13));
    		}
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    	}
    public void markPatientRecoveryById(int id) {
    	try {
    		Statement st=con.createStatement();
    		int i=st.executeUpdate("update PatientInfo set recovery='"+"Recovered"+"' where id='"+id+"'");
    	    if(i!=0) {
    	    	System.out.println("patient recovered");
    	    }
    	    
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
}
