package br.com.Ferreira.estoqueProdutos;


public class TiposProdutos {
    private String nome;
    private String descricao;
    protected double valor;
    private int quantidade;
    private int codigo;
    private String validade;

    public TiposProdutos(String nome, double valor, int codigo) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Nome do Produto: " + getNome() + ". Descrição: " + getDescricao() + ". Valor: " + getValor() + ". Quantidade: " + getQuantidade() + ". Codigo: " + getCodigo() + ". Validade: " + getValidade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        if (descricao == null) {
            descricao = "PRODUTO SEM DESCRIÇÃO";
        }
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        if (valor == 0) {
            valor = 0;
        }
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public final int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getValidade() {
        if (validade == null) {
            validade = "VALIDADE INDEFINIDA";
        }
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public double calcularPreco(double valorDoTrans){
        return valor + valorDoTrans;
    }

    public int compraProduto(int retirar) {
        if (quantidade <= 0){
            System.out.println("---- PRODUTO NÃO ENCONTRADO ----");
            return quantidade;
        } else if (quantidade < retirar) {
            System.out.println("---- QUANTIDADE DE PRODUTO FORA DE ESTOQUE ----");
        }else {
            quantidade -= retirar;
        }
        return retirar;
    }
}
