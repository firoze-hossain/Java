package com.roze.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDML {
    public static void main(String[] args) {

        try {
            //create connection
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/mydb", "root", "firoze28");
            //create statement /query
            Statement statement = connection.createStatement();
            //ready query for insert data into table
            String insertQuery = "INSERT INTO student VALUES (107,'Modhu')";
            //update query
            String updateQuery = "UPDATE student set name='Hossain' where id=106";
            String deleteQuery = "delete from student where id=107";
            //execute statement/query
            statement.execute(insertQuery);
            statement.execute(updateQuery);
            statement.execute(deleteQuery);
            //close connection
            System.out.println("Query Executed Successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
