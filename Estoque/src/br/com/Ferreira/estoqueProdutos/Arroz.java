package br.com.Ferreira.estoqueProdutos;

public class Arroz extends TiposProdutos {
    private double kilo;

    public Arroz(String nome, double valor, int codigo) {
        super(nome, valor, codigo);
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }
}
