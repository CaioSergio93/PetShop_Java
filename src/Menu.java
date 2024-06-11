import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();
        int opcao;

        while (true) {
            System.out.println("BEM VINDO AO PET SHOP PATINHA FOFA");
            System.out.println("| Escolha a opção desejada |");
            System.out.println("|                          |");
            System.out.println("| 1 - Cadastrar Cliente    |");
            System.out.println("| 2 - Cadastrar Animal     |");
            System.out.println("| 3 - Fazer Serviço        |");
            System.out.println("| 4 - Adicionar Produto    |");
            System.out.println("| 5 - Consultar Produto    |");
            System.out.println("| 6 - Consultar Cliente    |");
            System.out.println("| 7 - Sair                 |");
            System.out.println("|**************************|");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // Cadastrar cliente
                    Cliente cliente1 = new Cliente();
                    Cliente cliente2 = new Cliente();

                    cliente1.cadastrarCliente();
                    cliente2.cadastrarCliente();
                    break;

                case 2: // Cadastrar Pet
                    Pet pet1 = new Pet();
                    Pet pet2 = new Pet();

                    pet1.cadastrarPet();
                    pet2.cadastrarPet();

                    System.out.println("Deseja cadastrar outro pet? (1 - Sim / 2 - Não)");
                    int opcaoPet = scanner.nextInt();

                    if (opcaoPet == 1) {
                        System.out.println("Cadastrando outro pet...");
                        Pet pet3 = new Pet();
                        pet3.cadastrarPet();
                    } else {
                        System.out.println("Não cadastrando outro pet.");
                    }
                    break;

                case 3: // Serviços
                    System.out.println("Escolha o serviço: (1 - Banho / 2 - Tosa / 3 - Pacote / 4 - Castração)");
                    int opcaoServico = scanner.nextInt();

                    switch (opcaoServico) {
                        case 1:
                            System.out.println("Banho");
                            break;
                        case 2:
                            System.out.println("Tosa");
                            break;
                        case 3:
                            System.out.println("Pacote");
                            break;
                        case 4:
                            System.out.println("Castração");
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;

                case 4: // Adicionar produto
                    Produtos p1 = new Produtos("Categoria1", "Descrição1", 10.0, 1);
                    Produtos p2 = new Produtos("Categoria2", "Descrição2", 20.0, 2);
                    Produtos p3 = new Produtos("Categoria3", "Descrição3", 30.0, 3);

                    estoque.cadastrarProdutos(p1);
                    estoque.cadastrarProdutos(p2);
                    estoque.cadastrarProdutos(p3);
                    System.out.println("Produtos adicionados.");
                    break;

                case 5: // Consultar produto
                    System.out.println("Digite o ID do produto para consultar:");
                    int idProduto = scanner.nextInt();
                    estoque.buscarProdutos(idProduto);
                    break;

                case 6: // Consultar cliente
                    Cliente c1 = new Cliente();
                    Cliente c2 = new Cliente();

                    c1.exibirCliente();
                    c2.exibirCliente();
                    break;

                case 7: // Sair
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
