import java.sql.Connection;
import java.sql.*;
public class LoginCommand {

    Connection c;
    Statement s;
    LoginCommand(){
        try{
            //register the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("JDBC:mysql://localhost:3306/login","root","Anxhela1997@");
            s = c.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
