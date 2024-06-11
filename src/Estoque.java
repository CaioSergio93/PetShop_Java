public class Estoque {
    
    private Produtos[] produtos = new Produtos[200];
    private int totalProdutos = 0;
    
    public void cadastrarProdutos(Produtos produto) {
        this.produtos[totalProdutos] = produto;
        totalProdutos++;
    }
    
    public void exibirProdutos() {
        for (int indice = 0; produtos[indice] != null; indice++) {
            System.out.println("Categoria: " + produtos[indice].getCategoria());
            System.out.println("Descrição: " + produtos[indice].getDescricao());
            System.out.println("Preço: " + produtos[indice].getPreco());
        }
    }
    
    public int getTotalProdutos() {
        return this.totalProdutos;
    }
    
    public boolean buscarProdutos(int id) {
        for (int indice = 0; produtos[indice] != null; indice++) {
            if (produtos[indice].getId() == id) {
                System.out.println("ID: " + produtos[indice].getId());
                System.out.println("Categoria: " + produtos[indice].getCategoria());
                System.out.println("Descrição: " + produtos[indice].getDescricao());
                System.out.println("Preço: " + produtos[indice].getPreco());
                return true;
            }
        }
        System.out.println("Produto não cadastrado!");
        return false;
    }
    
    public void atualizarProduto(int id, double preco) {
        for (int indice = 0; produtos[indice] != null; indice++) {
            if (produtos[indice].getId() == id) {
                produtos[indice].setPreco(preco);
            }
        }
    }
    
    public void atualizarProduto(int id, double preco, String descricao) {
        for (int indice = 0; produtos[indice] != null; indice++) {
            if (produtos[indice].getId() == id) {
                produtos[indice].setPreco(preco);
                produtos[indice].setDescricao(descricao);
            }
        }
    }
}
