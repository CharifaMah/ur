package dao;

import model.Client;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;



public class ClientDaoImpl extends HibernateDaoSupport implements ClientDao {

	public void save(Client client) {
		getHibernateTemplate().save(client);
		
	}

	public Client findById(int id) {
		List list = getHibernateTemplate().find("from Client where idClient=?", id);
		return (Client)list.get(0);
	}

	public void delete(Client client) {
		getHibernateTemplate().delete(client);
		
	}

	
	public List<Client> findAllClient(){
		
	List list= getHibernateTemplate().find("from Client");
	return list;
	}
	
}
