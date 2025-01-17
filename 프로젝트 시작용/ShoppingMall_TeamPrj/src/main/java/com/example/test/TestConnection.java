package com.example.test;

import java.sql.Connection;
import com.example.db.MySQLConnection;

public class TestConnection {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = MySQLConnection.getConnection();
            if (conn != null) {
                System.out.println("���� �׽�Ʈ ����");
            } else {
                System.out.println("���� �׽�Ʈ ����");
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
