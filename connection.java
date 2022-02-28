import java.sql.*;
public class connection {
    Connection con;
    Statement st;
    public connection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/alumni","root","6290");
            st=con.createStatement();

        }catch(Exception e){
            System.out.println(e);

        }
    }
}


