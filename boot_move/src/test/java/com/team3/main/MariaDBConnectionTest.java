package com.team3.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.junit.Test;

public class MariaDBConnectionTest {

	private static final Logger log = Logger.getLogger(MariaDBConnectionTest.class);
	String url = "jdbc:mariadb://localhost:3306/test";
	String user = "root";
	String password = "root";
	
	@Test
	public void connectionTest() {
		try {
			/*DriverMager.getConnection(url) 하면 알아서 드라이버가 로드*/
			//Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			log.info("---> connection : " + conn + " = Success");
		}
//		catch(ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
