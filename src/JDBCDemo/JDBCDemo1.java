package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. Loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

       // 2. Creating a connection

        String url = "jdbc:mysql://localhost:3306/9pmbatch";
        String user = "root";
        String pass = "root";

        Connection con = DriverManager.getConnection(url,user,pass);

       // 3. Creating a statement

        Statement st = con.createStatement() ;

       // 4. Executing the sql query

        String sql = "insert into student value(2,'Amol','IT',89)";
        st.executeUpdate(sql);

    }
}
