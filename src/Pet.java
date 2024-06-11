public class Pet {
    
    String nome;
    String pet;
    String raca;
    
    public void cadastrarPet() {
        System.out.println("Informe o nome do Pet:");
        System.out.println("Informe a raça do Pet:");
    }
    
    public void exibirPet() {
        System.out.println("Nome do pet: " + this.pet);
        System.out.println("Dono: " + this.nome);
        System.out.println("Raça: " + this.raca);
    }
}
