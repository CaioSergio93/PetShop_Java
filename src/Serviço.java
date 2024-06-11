public class Serviço {
    // serviços
    private String banho;
    private String tosa;
    private String castracao;
    private String pacote;
    private double preco;

    public String getBanho() {
        return banho;
    }

    public void setBanho(String banho) {
        this.banho = banho;
    }

    public String getTosa() {
        return tosa;
    }

    public void setTosa(String tosa) {
        this.tosa = tosa;
    }

    public String getCastracao() {
        return castracao;
    }

    public void setCastracao(String castracao) {
        this.castracao = castracao;
    }

    public String getPacote() {
        return pacote;
    }

    public void setPacote(String pacote) {
        this.pacote = pacote;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // preço do banho
    public void banho(double preco) {
        this.preco = preco;
    }

    public void exibirBanho() {
        System.out.println("Banho: " + this.preco);
    }

    // preço da tosa
    public void tosa(double preco) {
        this.preco = preco;
    }

    public void exibirTosa() {
        System.out.println("Tosa: " + this.preco);
    }

    // preço da castração
    public void castracao(double preco) {
        this.preco = preco;
    }

    public void exibirCastracao() {
        System.out.println("Castração: " + this.preco);
    }

    // preço pacote
    public void pacote(double preco) {
        this.preco = preco;
    }

    public void exibirPacote() {
        System.out.println("Pacote: " + this.preco);
    }
}
