package org.example.week19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    private static String dbUrl = "jdbc:mysql://localhost:3306/world";
    private static String dbUsername = "root";
    private static String dbPassword = "1234";

    public static Connection getMyConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
    }
}
