package com.example.test;

import java.sql.Connection;
import com.example.db.MySQLConnection;

public class TestConnection {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = MySQLConnection.getConnection();
            if (conn != null) {
                System.out.println("연결 테스트 성공");
            } else {
                System.out.println("연결 테스트 실패");
            }
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
