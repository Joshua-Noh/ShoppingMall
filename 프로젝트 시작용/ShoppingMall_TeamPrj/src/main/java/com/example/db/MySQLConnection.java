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
            // ����̹� �ε�
            Class.forName("com.mysql.cj.jdbc.Driver");
            // �����ͺ��̽� ����
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("�����ͺ��̽� ���� ����");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC ����̹� �ε� ����");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("DB ���� ����");
            e.printStackTrace();
        }
        return conn;
    }
}
