package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCDeleteDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/snpsu_ise_jdbc", "root", "2125");
        System.out.println("connection established");
        String fname="Priyanshu";
        PreparedStatement ps=connection.prepareStatement("Delete from students where fname=?");

        ps.setString(1,fname);

        int i=ps.executeUpdate();
        if (i>0){
            System.out.println("Deleted data sucessfully");
        }else{
            System.out.println("failed to delete data");
        }
        ps.close();
        connection.close();

    }
}