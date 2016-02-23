package com.test.java.db;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

public class DataAccessUnitTestTemplate {
    private EmbeddedDatabase db;
    
    @Before
    public void setUp() {
        // creates a HSQL in-memory db populated from default scripts classpath:schema.sql and classpath:test-data.sql
        db = new EmbeddedDatabaseBuilder().addDefaultScripts().build();		
    }

    @Test
    public void testDataAccess() {
        JdbcTemplate template = new JdbcTemplate(db);
        template.execute("select * from companyOwners");
        int cust =1;
        
        String sql = "SELECT ownerId FROM companyOwners WHERE cownid = ?";
		 
    	int name = (Integer)template.queryForObject(
    			sql, new Object[] { cust }, Integer.class);
    	
    	System.out.println(name);
        
    }

    @After
    public void tearDown() {
        db.shutdown();
    }
}