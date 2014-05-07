package dao;

import java.util.List;

import model.Client;

public interface ClientDao {

	public void save(Client client);

	public Client findById(int id);

	public void delete(Client client);
	
	public List<Client> findAllClient();
	
}
