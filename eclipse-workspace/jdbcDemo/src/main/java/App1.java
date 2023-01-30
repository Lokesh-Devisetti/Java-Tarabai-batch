import java.sql.*;
public class App1 {
public static void main(String args[])  throws Exception{
	Connection con=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
	}catch(Exception e) {
		e.printStackTrace();
	}
	if(con!=null) {
		System.out.println("connected successfully");
	}
	//3.create the statement
    /*PreparedStatement pstmt=con.prepareStatement("insert into Tarabai1 values(?,?,?)");
    
    pstmt.setInt(1, 101);
    pstmt.setString(2, "loki");
    pstmt.setString(3, "loki@gmail.com");
    
    //4.execute query
    int i=pstmt.executeUpdate();
    
    if(i>=1) {
        System.out.println("data inserted  successfully");
    }*/
	/*Statement st=con.createStatement();
	String name="manikanta";
	int i=st.executeUpdate("update Tarabai1 set name='"+name+"' where id='"+101+"'");
	 if(i>=1) {
	        System.out.println("data inserted  successfully");
	    }*/
	/*Statement st=con.createStatement();
	int i=st.executeUpdate("delete from Tarabai1 where id='"+101+"'");
	 if(i>=1) {
	        System.out.println("data deleted successfully");
	    }*/
	Statement st2=con.createStatement();
	ResultSet rs=st2.executeQuery("select * from Tarabai1");
	while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}
}
}
