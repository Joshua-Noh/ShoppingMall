package com.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/shoppingmalldb?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "0000";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 데이터베이스 연결
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("데이터베이스 연결 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 로드 에러");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("DB 연결 에러");
            e.printStackTrace();
        }
        return conn;
    }
}
