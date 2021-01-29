package JDBCDemo;

import java.sql.*;

public class JDBCDemo2 {

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

        String sql = "Select * from student where id=2";

        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
        {
            System.out.print(rs.getInt("id")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("branch")+" ");
            System.out.println(rs.getInt("marks"));
        }


    }
}
