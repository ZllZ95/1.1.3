package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://127.0.0.2:3306/1_1_3";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "kata";

    public static Connection getConnection() {
        try {

            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {

            throw new RuntimeException("Ошибка подключения к БД. Проверь url, username, password", e);
        }
    }
    // реализуйте настройку соеденения с БД
}
