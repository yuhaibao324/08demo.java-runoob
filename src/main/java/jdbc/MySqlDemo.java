package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by : allenwhm
 * DateTime : 2018-09-10 23:16
 **/
public class MySqlDemo {

    //    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String JDBC_URL = "jdbc:mysql://xxx.xxx.xxx.xxx:3306/allenwhm?useSSL=false&serverTimezone=UTC";
    static final String USER = "xxxxxx";
    static final String PASSWORD = "xxxxxx";

    public static void main(String[] args){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Website> resultList = null;

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            stmt = conn.createStatement();
            String sql = "select * from websites";
            rs = stmt.executeQuery(sql);

            resultList = new ArrayList<>();
            while (rs.next()) {
                Website website = new Website();
                website.setId(rs.getInt("id"));
                website.setName(rs.getString("name"));
                website.setUrl(rs.getString("url"));
                website.setAlexa(rs.getInt("alexa"));
                website.setCountry(rs.getString("country"));
                resultList.add(website);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("--- retrieve the data ---");
        for (Website website : resultList) {
            System.out.println(website);
        }
    }
}
