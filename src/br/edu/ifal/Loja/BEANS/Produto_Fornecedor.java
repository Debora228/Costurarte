package br.edu.ifal.Loja.BEANS;

import java.util.ArrayList;
import java.util.Objects;

public class Produto_Fornecedor {
    
    private int Cod_fornecedor;
    private ArrayList<Integer> Cod_produtos = new ArrayList();
    private ArrayList<Double> preco_compra_unitario = new ArrayList();
    private ArrayList<Integer> quant= new ArrayList();
    private ArrayList<Double> preco_compra = new ArrayList();
    
    public Produto_Fornecedor(int Cod_fornecedor) {
        this.Cod_fornecedor = Cod_fornecedor;
    }
    
    public int getCod_fornecedor() {
        return Cod_fornecedor;
    }

    public void setCod_fornecedor(int Cod_fornecedor) {
        this.Cod_fornecedor = Cod_fornecedor;
    }

    public ArrayList<Integer> getCod_produtos() {
        return Cod_produtos;
    }

    public void setCod_produtos(ArrayList<Integer> Cod_produtos) {
        this.Cod_produtos = Cod_produtos;
    }

    public ArrayList<Double> getPreco_compra_unitario() {
        return preco_compra_unitario;
    }

    public void setPreco_compra_unitario(ArrayList<Double> preco_compra_unitario) {
        this.preco_compra_unitario = preco_compra_unitario;
    }

    public ArrayList<Integer> getQuant() {
        return quant;
    }

    public void setQuant(ArrayList<Integer> quant) {
        this.quant = quant;
    }

    @Override
    public String toString() {
        return "Produto_Fornecedor{" + "Cod_fornecedor=" + Cod_fornecedor + ", Cod_produtos=" + Cod_produtos + ", preco_compra_unitario=" + preco_compra_unitario + ", quant=" + quant + '}';
    }

    public ArrayList<Double> getPreco_compra() {
        return preco_compra;
    }

    public void setPreco_compra(ArrayList<Double> preco_compra) {
        this.preco_compra = preco_compra;
    }

  
}
