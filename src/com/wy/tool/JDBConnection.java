package com.wy.tool;

import java.sql.*;

public class JDBConnection {
	private String dbDriver = "com.mysql.jdbc.Driver"; // ���ݿ������

	private String url = "jdbc:mysql://localhost:3306/db_shopping"; // URL��ַ

	public Connection connection = null;

	public JDBConnection() {
		try {
			Class.forName(dbDriver).newInstance(); // �������ݿ�����
			connection = DriverManager.getConnection(url, "root", "123456"); // �������ݿ�
		} catch (Exception ex) {
			System.out.println("���ݿ����ʧ��");
		}
	}
}
