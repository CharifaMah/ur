package model;
import java.io.Serializable;

public class Client implements Serializable {
	
	private static final long serialVersionUID=1L;
	
	private int idClient;
	private String nomClient;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}
	
	

	
		public Client(int idClient, String nomClient) {
			super();
			this.idClient = idClient;
			this.nomClient = nomClient;
		}


		//	Setters getters 
			public int getIdClient() {
				return idClient;
			}
			public void setIdClient(int idClient) {
				this.idClient = idClient;
			}
			public String getNomClient() {
				return nomClient;
			}
			public void setNomClient(String nomClient) {
				this.nomClient = nomClient;
			}




			@Override
			public String toString() {
				return "Client [idClient=" + idClient + ", nomClient="
						+ nomClient + "]";
			}
			
			
			

}
