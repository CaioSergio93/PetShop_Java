
public class Cliente {
	
	private	String nome;
	private	String endereco;
	private	String telefone;
	private	String pet;
	

public String getNome() {
	return this.nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
public String getEndereco() {
	return this.endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getTelefone() {
	return this.telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public String getPet() {
	return this.pet;
}
public void setPet(String pet) {
	this.pet = pet;
}
public void exibirCliente() {
	System.out.println("Nome do cliente: " + this.nome);
	System.out.println("Endereço: " + this.endereco);
	System.out.println("Telefone: " + this.telefone);
	System.out.println("Pet " + this.pet);
}

public void cadastrarCliente() {
	System.out.println("Informe o nome do cliente:");
	System.out.println("Informe o telefone do cliente:");
	System.out.println("Informe o endereço do cliente:");
	
}


}
