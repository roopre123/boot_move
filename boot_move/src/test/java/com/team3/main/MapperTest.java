package com.team3.main;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.team3.service.TestMapperService;

@ContextConfiguration(locations={"file:/Users/roopre/git/boot_move/boot_move/src/main/resources/spring/context-datasource.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"file:/Users/roopre/git/boot_move/boot_move/src/main/resources/sqlmap/mappers/sql_query.xml"})
public class MapperTest {

	
	private static final Logger log = Logger.getLogger(MapperTest.class);
	
	@Autowired
	private TestMapperService testMapper;
	
	@Test
	public void getTime() {
		try {
			
		
		log.info("'Now Time : " + testMapper.getTime() + "'");
		}
		catch(Exception e) {
			log.info("Exception : " + e + " - " + testMapper);
		}
	}
}