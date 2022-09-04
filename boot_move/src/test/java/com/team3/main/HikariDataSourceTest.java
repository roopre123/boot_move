package com.team3.main;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations={"file:/Users/roopre/git/boot_move/boot_move/src/test/resources/spring/context-datasource.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class HikariDataSourceTest {

	private static final Logger log = Logger.getLogger(HikariDataSourceTest.class);
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	//@Test
	public void hikariDataSourceTest() {
		try {
			Connection conn = dataSource.getConnection();
			log.info("'Connection 객체 : " + conn + "'");
		}catch(Exception e) {
			log.info(e+ " : " + dataSource);
		}
	}
	
	@Test
	public void sqlSessionFactoryTest() {
		try {
			SqlSession session = sqlSessionFactory.openSession();
			Connection conn = session.getConnection();
			log.info("'Session Object : " + session + "'");
			log.info("'Connection Object : " + conn + "'");
		}
		catch(Exception e){
			log.info(e + " : " + sqlSessionFactory);
		}
	}
}
