public class MainProduto {
    
    public static void main(String[] args) {
        
        Produtos produto1 = new Produtos("Ração DOGSHOW 20kg", "Ração para cachorro", 130.00, 1);
        Produtos produto2 = new Produtos("Ração GOLDEN 10kg", "Ração para cachorro", 70.00, 2);
        Produtos produto3 = new Produtos("Ração GOLDEN 10kg", "Ração para gato", 70.00, 3);
        Produtos produto4 = new Produtos("Coleira peitoral (pequena)", "Coleira para gato e cachorro", 20.00, 4);
        Produtos produto5 = new Produtos("Coleira peitoral (média)", "Coleira para gato e cachorro", 28.00, 5);
        Produtos produto6 = new Produtos("Coleira peitoral (grande)", "Coleira para cachorro", 35.00, 6);
        Produtos produto7 = new Produtos("Shampoo Anti-Pulgas", null, 25.00, 7);
        
        Estoque estoque1 = new Estoque();
        estoque1.cadastrarProdutos(produto1);
        estoque1.cadastrarProdutos(produto2);
        estoque1.cadastrarProdutos(produto3);
        estoque1.cadastrarProdutos(produto4);
        estoque1.cadastrarProdutos(produto5);
        estoque1.cadastrarProdutos(produto6);
        estoque1.cadastrarProdutos(produto7);
        
        System.out.println("Total de produtos: " + estoque1.getTotalProdutos());
        
        estoque1.buscarProdutos(produto1.getId());
        estoque1.atualizarProduto(produto1.getId(), 130.00, "Ração DOGSHOW");
        estoque1.buscarProdutos(produto1.getId());
    } 
}
