package com.roze.database;

import java.sql.*;

public class MySQLSelect {
    public static void main(String[] args) {
        //Data retrieval language/Data query language
        try {
            //create connection with mysql database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "firoze28");
            //create statement
            Statement statement = connection.createStatement();
            //write query for select statement
            String selectQuery = "select employee_id,first_name,last_name,department_id from employees";
            //execute query and store result in result set
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                int employeeId = resultSet.getInt("employee_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                int departmentId = resultSet.getInt("department_id");
                System.out.println(employeeId + "     " + firstName + "     " + lastName + "     " + departmentId);
                //close connection

            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
