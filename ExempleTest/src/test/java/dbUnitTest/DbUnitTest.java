package dbUnitTest;

import java.util.Properties;

import junit.framework.*;
import org.junit.Test;
import org.dbunit

public class DbUnitTest extends DBTestCase{

	public DbunitTest(String name){
		super(name);
		System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_Driver_CLASS, "org.hsqldb.jdbcDriver");
		System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_CONNECTION_URL, "org.hsqldb:sample");
		System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_USERNAME, "sa");
		System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_PASSWORD, "");
	
	
	}
	
	protected IDataset getDataSet() throws Exception {
		
		return new FlatXmlDataSetBuilder().build(new FileInputStream("dataset.xml"));
		
	}
	
	
	
}
