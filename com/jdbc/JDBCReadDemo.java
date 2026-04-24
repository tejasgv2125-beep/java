package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCReadDemo {
    public static void main(String[] args) throws Exception {
        //Load the JDBC Driver [jar File]
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/snpsu_ise_jdbc","root","2125");
        System.out.println("connection Established");
    }
}
