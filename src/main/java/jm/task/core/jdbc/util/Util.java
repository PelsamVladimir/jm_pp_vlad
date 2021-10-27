package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static String dbURL = "jdbc:mysql://localhost:3306/my_base_data_pp?useSSL=false";
    private static String dbUserName = "root";
    private static String dbPassword = "toor";
    public static Connection connection;
    public static Connection getConnection() {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            return connection;
        }
    }

