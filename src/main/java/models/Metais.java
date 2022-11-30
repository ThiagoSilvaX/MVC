package br.fatecrl.mvcdemo.models;

public class Metais {
    private String nome;
    private String raridade;
    private String Unidade;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaridade() {
        return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public String getUnidade() {
        return Unidade;
    }

    public void setUnidade(String unidade) {
        Unidade = unidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Metais(String nome, String raridade, String Unidade, double valor) {
        this.nome = nome;
        this.raridade = raridade;
        this.Unidade = Unidade;
        this.valor = valor;
    }
}
