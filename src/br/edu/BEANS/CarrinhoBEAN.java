package br.edu.BEANS;
public class CarrinhoBEAN {
    private double desconto;
    private String Fornecedor; 
    private String nome;
    private int quant;
    private int codCarrinho;
    private double preco_total;
    private String descricao;
    private String cor;
    private String marca;
    private double preco_compra;

    public CarrinhoBEAN(double desconto, String Fornecedor, String nome, int quant, int codCarrinho, double preco_total, String descricao, String cor, String marca, double preco_compra) {
        this.desconto = desconto;
        this.Fornecedor = Fornecedor;
        this.nome = nome;
        this.quant = quant;
        this.codCarrinho = codCarrinho;
        this.preco_total = preco_total;
        this.descricao = descricao;
        this.cor = cor;
        this.marca = marca;
        this.preco_compra=preco_compra;
    }
    public CarrinhoBEAN() {
        
    }
    public double getPreco_compra(){
        return preco_compra;
    }
    public void setPreco_compra(double preco_compra){
        this.preco_compra = preco_compra;
    }
    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

   

    public String getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(String Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public int getCodCarrinho() {
        return codCarrinho;
    }

    public void setCodCarrinho(int codCarrinho) {
        this.codCarrinho = codCarrinho;
    }

    public double getPreco_total() {
        return preco_total;
    }

    public void setPreco_total(double preco_total) {
        this.preco_total = preco_total;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
   
}
