package com.springbeanlifecycle;

import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		StudentDAO dao = new StudentDAO();
		dao.selectAllRows();
		dao.deleteRow(1);
	}

}
