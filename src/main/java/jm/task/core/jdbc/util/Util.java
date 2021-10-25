package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    // реализуйте настройку соеденения с БД
    private static Connection connection;
    private static Statement statement;


    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_base_data_pp", "root", "toor");
        statement = connection.createStatement();
    }

    public static void createUsersTable() {

        String myTableName = "CREATE TABLE users ("
                + " id INT(64) PRIMARY KEY AUTO_INCREMENT,"
                + " name VARCHAR (128))";

        try {
            statement.executeUpdate(myTableName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void disconnect() throws SQLException {
        connection.close();
    }
}
