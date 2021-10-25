package jm.task.core.jdbc.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Util {
    // реализуйте настройку соеденения с БД
//    private static Connection connection;
   // private static Statement statement;
    private static String dbURL="jdbc:mysql://localhost:3306/my_base_data_pp";
    //"jdbc:mysql://localhost:3306/my_base_data_pp"; "jdbc:h2:mem:test; INIT=RUNSCRIPT FROM 'classpath:init.sql"
    private static String dbUserName="root";
    private static String dbPassword="toor";

    public static Connection getConnection()  {
        //throws ClassNotFoundException, SQLException
//        String dbURL=null;
//        String dbUserName="root";
//        String dbPassword="toor";

        FileInputStream fisURL;
        FileInputStream fisUsername;
        FileInputStream fisPassword;

//        Properties properties=new Properties();
//        Properties properties2 = new Properties();
//        Properties properties1=new Properties();
//        try {
//            fisURL = new FileInputStream("src/main/resources/config.properties");
//            properties.load(fisURL);
//            dbURL = properties.getProperty("db.host");
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            fisUsername = new FileInputStream("src/main/resources/config.properties");
//            properties1.load(fisUsername);
//            dbUserName = properties1.getProperty("db.username");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            fisPassword = new FileInputStream("src/main/resources/config.properties");
//            properties2.load(fisPassword);
//            dbPassword = properties2.getProperty("db.password");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        Connection connection=null;
       // Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            connection = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        statement = connection.createStatement();
        return connection;
    }

//    public static void createUsersTable() {
//
//        String myTableName = "CREATE TABLE users ("
//                + " id INT(64) PRIMARY KEY AUTO_INCREMENT,"
//                + " name VARCHAR (128))";
//
//        try {
//            statement.executeUpdate(myTableName);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void disconnect() throws SQLException {
//        connection.close();
//    }
}
