package common;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import antlr.collections.List;
import service.*;
import model.*;



public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		
		ClientService clientService = (ClientService)appContext.getBean("clientService");
		
		/**insert **/
		Client cl = new Client();
		cl.setIdClient(1);
		cl.setNomClient("Amal");
		clientService.save(cl);
		
		Client cl2 = new Client(2,"Farress");
		clientService.save(cl2);
		
		/**Select**/
		System.out.println("Select");
		Client cl3=clientService.findById(1);
		System.out.println(cl3);

		
//		/**update**/
//		System.out.println("update");
//		cl2.setNomClient("farress");
//		clientService.update(cl2);
//		System.out.println(cl2);
//		clientService.save(cl2);
		
		
		/** Select All Client**/
		System.out.println("Select All Client");
		ArrayList list = (ArrayList<Client>)clientService.findAllClient();
		for (int i=0;i<list.size();i++){
			 System.out.println(list.get(i));
			
		}

//		/**Delete**/
//		System.out.println("Supression");
//		clientService.delete(cl2);
//		System.out.println("Suppression done");
//		System.out.println("Select All Client");
//		
//		for (int i=0;i<list.size();i++){
//			 System.out.println(list.get(i));
		
	}

}
