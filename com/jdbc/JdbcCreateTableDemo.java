package com.jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCreateTableDemo {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/snpsu_ise_jdbc";
        String username="root";
        String password="2125";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(url,username,password);

            System.out.println("connection established");
            Statement statement=connection.createStatement();
            String createTableQuery="Create Table teachers(" +
                    "id Int PRIMARY KEY AUTO_INCREMENT,"+"name VARCHAR(50),"+"age INT,"+"salary DOUBLE)";
            statement.executeUpdate(createTableQuery);
            System.out.println("Table 'teachers' created");
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}