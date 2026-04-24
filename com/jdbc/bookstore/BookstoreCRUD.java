package com.jdbc.bookstore;
import java.sql.*;
import java.util.*;
public class BookstoreCRUD {
    private static final String URL="jdbc:mysql://localhost:3306/ise_bookstore_db";
    private static final String USERNAME="root";
    private static final String PASSWORD="2125";

    public static void main(String[] args) {
        //ℹ️Try with the resources[The clases are auto-close]
        try(Connection conn= DriverManager.getConnection(URL,USERNAME,PASSWORD);
            Scanner sc=new Scanner(System.in)){
            Class.forName("com.mysql.cj.jdbc.Driver");
            //⭐MAIN CRUD APPLICATION[BOOKSTORE]
            while(true) {
                //💠Display some menu options
                System.out.println("\n1.Create Books | 2.Read Books | 3.Update Book | 4.Delete | 5.Exit");
                System.out.println("Enter your choice");
                int choice = sc.nextInt();
                sc.nextLine();//💠Consume leftover new line -goes to the next line
                //=============================Create=====================//
                if (choice == 1) {
                    System.out.println("Title: ");
                    String title = sc.nextLine();
                    System.out.println("Author: ");
                    String author = sc.nextLine();
                    System.out.println("Price: ");
                    double price = sc.nextDouble();
                    //Prepared Statment to prevent the SQL injection
                    String sql = "Insert INTO BOOKS(title,author,price) VALUES(?,?,?)";
                    try(PreparedStatement ps=conn.prepareStatement(sql)){
                        ps.setString(1,title);
                        ps.setString(2,author);
                        ps.setDouble(3,price);
                        ps.executeUpdate();
                        System.out.println("Book: "+title+"added to database");
                    }
                }
                //=======================================READ Operation====================//
                else if (choice == 2) {
                    String sql="Select * from BOOKS";
                    try(Statement st=conn.createStatement();
                        ResultSet rs=st.executeQuery(sql)){
                        System.out.println("ID | TITLE | AUTHOR | PRICE");
                        while(rs.next()){
                            int id=rs.getInt("id");
                            String title=rs.getString("title");
                            String author=rs.getString("author");
                            double price=rs.getDouble("price");
                            System.out.println(id+"\t\t"+title+"\t\t"+author+"\t\t"+price);
                        }

                    }
                }//======================================UPDATE=====================================//
                else if (choice == 3) {
                    System.out.println("Enter the Book ID To Update");
                    int id=sc.nextInt();
                    sc.nextLine();//💠Consume the left over line
                    System.out.println("Enter the New Book Title");
                    String title=sc.nextLine();
                    System.out.println("Enter the New Book Author");
                    String author=sc.nextLine();
                    System.out.println("Enter the New Book Price");
                    double price=sc.nextDouble();
                    String sql="UPDATE books SET title=? ,author=? ,price=? WHERE id=?";
                    try(PreparedStatement ps=conn.prepareStatement(sql)){
                        //prepared statment is used because we dont want tro store anything we want to update the thing
                        //so we use the prepares statement
                        ps.setString(1,title);
                        ps.setString(2,author);
                        ps.setDouble(3,price);
                        ps.setInt(4,id);
                        int rows =ps.executeUpdate();//💠Returm affected rows
                        if(rows>0) System.out.println("Book Updated.");
                        else System.out.println("ID not found.");
                    }
                }
                else if (choice == 4) {
                    System.out.println("Enter Book ID to delete");
                    int id = sc.nextInt();
                    String sql = "DELETE FROM books WHERE id=?";
                    try(PreparedStatement ps = conn.prepareStatement(sql)) {
                        ps.setInt(1,id);
                        int rows = ps.executeUpdate();
                        if (rows > 0) System.out.println("Deleted.");
                        else System.out.println("ID NOT FOUND.");
                    }
                }
                //=========================================Exit=================================//
                else if (choice == 5) {
                    System.out.println("Exiting the BOOKSTORE SYSTEM");
                    for(int i=0;i<5;i++){
                        System.out.print(".");
                        Thread.sleep(1000);
                    }
                    break;
                }
            }
            }catch (ClassNotFoundException e){
            System.out.println(e.getMessage()+"MY SQL JDBC DRIVER NOT FOUND.ADD JAR to class Path ");
        }catch (SQLException e){
            System.out.println("DataBase Error"+e.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

