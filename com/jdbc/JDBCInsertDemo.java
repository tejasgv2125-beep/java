package com.jdbc;

import java.sql.*;

public class JDBCInsertDemo {
    public static void main(String[] args) throws Exception {
        //Load the JDBC Driver [jar File]
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/snpsu_ise_jdbc","root","2125");
        System.out.println("connection Established");
        String fname="Shreya";
        String lname="B G";
        //⭐💠💠⭐To avoid the SQL injection we dont write the exact column names in the query
        PreparedStatement ps=connection.prepareStatement("insert into students values(?,?)");
        //Question marks used to because there will be treat not safe .how many columns we have to right that many queustion mark
        ps.setString(1,fname);//to insert we should use the "set" function
        ps.setString(2,lname);
        int i=ps.executeUpdate();//this returns the no of rows affected
        if (i > 0) {
            System.out.println("Inserted the data succesfully");

        }else{
            System.out.println("Failed to insert data");
        }
        ps.close();
        connection.close();

    }

}
