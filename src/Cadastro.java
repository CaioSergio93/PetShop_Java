import java.util.ArrayList;

public class Cadastro {
	
	private ArrayList <Cliente> clientes = new ArrayList<Cliente>();	
	public void cadastrarClientes(Cliente cliente) {
		this.clientes.add(cliente);
	}
	public int totalcliente() {
		return this.clientes.size();
	}

}
