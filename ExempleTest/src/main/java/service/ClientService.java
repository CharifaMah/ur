package service;

import java.util.List;

import model.Client;



public interface ClientService {
	
	List <Client> findAllClient();
	Client findById(int id);
	void save (Client client);
	void delete (Client client);
	void update (Client client);
	

}
