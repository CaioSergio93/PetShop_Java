import java.util.Random;

public class Produtos {
    
    private String categoria;
    private String descricao;
    private double preco;
    private int id;

    // Construtor de dois parâmetros (categoria, descricao)
    public Produtos(String categoria, String descricao) {
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = 0.0; // Iniciando com preço zero
        this.id = new Random().nextInt(200); // Geração aleatória de ID
    }

    // Construtor de quatro parâmetros (categoria, descricao, preco, id)
    public Produtos(String categoria, String descricao, double preco, int id) {
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
