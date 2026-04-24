package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCUpdateDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/snpsu_ise_jdbc", "root", "1234");
        System.out.println("connection established");
        String fname="karna";
        String lname="S";
        PreparedStatement ps=connection.prepareStatement("UPDATE students SET lname=? WHERE fname=?");
        ps.setString(1,lname);
        ps.setString(2,fname);

        int i=ps.executeUpdate();
        if (i>0){
            System.out.println("updated data sucessfully");
        }else{
            System.out.println("failed to update data");
        }
        ps.close();
        connection.close();

    }
}