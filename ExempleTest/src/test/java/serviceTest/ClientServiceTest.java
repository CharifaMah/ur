package serviceTest;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
//import org.springframework.test.context.TestExecutionListeners;




import service.ClientService;
import model.Client;


@RunWith(JUnit4.class)
public class ClientServiceTest {
	
	private static ClassPathXmlApplicationContext context ;
	private static ClientService clientservice;
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		clientservice = (ClientService) context.getBean("clientService");	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}
	
	
	@Test
	public void testFindAllClient() {
		System.out.println("Test find all client réussi");
		List<Client> allClients = clientservice.findAllClient();
		assertNotNull(allClients);
		assertTrue(allClients.size()>0);	
		System.out.println(allClients);
		
	}

	@Test
	public void testFindById() {
		System.out.println("Test find un client réussi");
		Client client = clientservice.findById(1);
		assertNotNull(client);
		assertEquals(1, client.getIdClient());
		System.out.println(client);
		
		
	}

}
