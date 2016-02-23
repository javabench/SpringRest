package com.test.java.db;

import java.sql.Types;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.stereotype.Component;

import com.test.java.bean.CompOwner;
import com.test.java.bean.Company;
import com.test.java.bean.Owner;

@Component("dataAccess")
public class DataAccess {
    private EmbeddedDatabase db;
    private int cownId;
    
    private String saveCompSQL = "insert into companies values (?, ?, ?, ?, ?, ? ,?);";
    
    private String getCompSQL = "select * from companies where compid = ?;";
    
    private String getOwnSQL = "select * from Owners where ownid = ?;";
    
    private String saveOwnSQL = "insert into owners values (?, ?, ?, ?);";
    
    private String saveOwnCompSQL = "insert into companyOwners values (?, ?, ?);";
    
    @PostConstruct
    public void init() {
        // creates a HSQL in-memory Database populated from default script files - classpath:schema.sql and classpath:data.sql
        db = new EmbeddedDatabaseBuilder().addDefaultScripts().build();		
    }
    
    // method for creating a new company
    public void saveCompanyDB (Company co) {
    	JdbcTemplate template = new JdbcTemplate(db);
    	
    	Object[] params = new Object[]{co.getCompId(), co.getCompName(), co.getAddress(), co.getCity(), co.getCountry(), co.getEmail(), co.getPhone()};
    	int[] types = new int[] { Types.INTEGER , Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR };
    	template.update(saveCompSQL, params, types);
    	
    }
    
    // method for listing all in memory compAnies (loaded from data.sql + created through above new company call)
    public List<Company> getAllCompaniesDB () {
    	
    	JdbcTemplate template = new JdbcTemplate(db);
    	return  template.query("select * from companies", new BeanPropertyRowMapper(Company.class) );
    }
    
    // method to fetch a company' details
    public Company getCompanyDB (int id) {
    	
    	JdbcTemplate template = new JdbcTemplate(db);
    	return template.queryForObject(getCompSQL, new Object []{id}, new BeanPropertyRowMapper(Company.class));
    }
    
 // method for creating a new company
    public void addOwner (Owner o) {
    	JdbcTemplate template = new JdbcTemplate(db);
    	
    	// insert into table - owners
    	Object[] params = new Object[]{o.getOwnerId(), o.getCompId(), o.getOwnerName(), o.getAddress()};
    	int[] types = new int[] { Types.INTEGER ,Types.INTEGER , Types.VARCHAR, Types.VARCHAR};
    	template.update(saveOwnSQL, params, types);
    	
    	/*cownId ++;
    	CompOwner co = new CompOwner(cownId, o.getOwnId(), o.getCompId());
    	
    	// insert into table - companyOwners
    	params = new Object[]{co.getCownId(), co.getCompId(), co.getOwnId()};
    	types = new int[] { Types.INTEGER , Types.INTEGER, Types.INTEGER};
    	template.update(saveOwnCompSQL, params, types);*/
    }    
    
    
    // method for listing all in memory compAnies (loaded from data.sql + created through above new company call)
    public List<Owner> getAllOwnersDB () {
    	
    	JdbcTemplate template = new JdbcTemplate(db);
    	return  template.query("select * from owners", new BeanPropertyRowMapper(Owner.class) );
    }
    
    // method to fetch a company' details
    public Owner getOwnerDB (int id) {
    	
    	JdbcTemplate template = new JdbcTemplate(db);
    	return template.queryForObject(getOwnSQL, new Object []{id}, new BeanPropertyRowMapper(Owner.class));
    }

}