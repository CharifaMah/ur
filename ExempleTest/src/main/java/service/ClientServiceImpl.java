package service;

import java.util.List;

import dao.ClientDao;
import model.Client;

public class ClientServiceImpl implements ClientService {
	
	
	ClientDao clientDao;
	 
	public void setClientDao (ClientDao clientDao){
		this.clientDao=clientDao;
		
	}
	
	public void update(Client client) {
		// TODO Auto-generated method stub
		
	}

	public List<Client> findAllClient() {
		return clientDao.findAllClient();
	}

	public Client findById(int id) {
		return clientDao.findById(id);
	}



	public void save(Client client) {
		clientDao.save(client);
		
	}



	public void delete(Client client) {
		clientDao.delete(client);
		
	}

	
}
