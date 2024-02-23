package com.springbeanlifecycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/restdatabase";
	private String userName = "root";
	private String passWord = "root";

	public void selectAllRows() throws ClassNotFoundException, SQLException {

		// load driver
		Class.forName(driver);
		System.out.println("driver loaded succesfully");

		// create connection
		Connection con = DriverManager.getConnection(url, userName, passWord);
		System.out.println("create connection succesfully");

		// execute Query
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT * FROM restdatabase.student;");

		while (rs.next()) {
			int studentId = rs.getInt(1);
			String studentName = rs.getString(2);
			int studentMarks = rs.getInt(3);

			System.out.println(studentId + " " + studentName + " " + studentMarks);

		}

	}
	public void deleteRow(int studentId) throws ClassNotFoundException, SQLException {
		// load driver
				Class.forName(driver);
				System.out.println("driver loaded succesfully");

				// create connection
				Connection con = DriverManager.getConnection(url, userName, passWord);
				System.out.println("create connection succesfully");
				Statement stmt = con.createStatement();

			stmt.executeUpdate("delete from student where studentId="+studentId);


	}
}
