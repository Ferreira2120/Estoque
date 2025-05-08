package br.com.Ferreira.estoqueProdutos;


import br.com.Ferreira.atributosFixos.DiasDaSemana;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


public class TiposProdutos {
    private String nome;
    private String descricao;
    protected double valor;
    private int quantidade;
    private int codigo;
    private String validade;

    public String getNome() {

        System.out.println(nome);
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public int getQuantidade() {

        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public final int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public double calcularPreco(double valorDoTrans){
        return valor + valorDoTrans;
    }

//    private String segunda = "segunda";
//    private String terceira = "terceira";
//    private String quarta = "quarta";
//    private String quinta = "quinta";
    private String sexta = "sexta";

    public void saberDiaSemana(LocalDate dia) {
        dia = LocalDate.now();
        String diaSemana = dia.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));

        double descontoSem;

        System.out.println(diaSemana.toUpperCase());

        //Sempre que for comprar contaúdos de String(ou de objetos em geral), é bom usar .equals().
        //Se quiser ignorar se está em maúscula ou minúscula, use .euqlasIgnoresCase().
        if (diaSemana.toUpperCase().equalsIgnoreCase(DiasDaSemana.SEGUNDA.toString())) {
            descontoSem = valor * 0.2;
            System.out.println("Hoje é segunda feira e você terá o desconto imposto pelo seu dia " + diaSemana);
        } else if (diaSemana.toUpperCase().equalsIgnoreCase(DiasDaSemana.TERCA.toString())) {
            descontoSem = valor * 0.3;
            System.out.println("Hoje é terça feira e você terá o desconto imposto pelo seu dia " + diaSemana);
        } else if (diaSemana.toUpperCase().equalsIgnoreCase(DiasDaSemana.QUARTA.toString())) {
            descontoSem = valor * 0.4;
            System.out.println("Hoje é quarta feira e você terá o desconto imposto pelo seu dia " + diaSemana);
        } else if (diaSemana.toUpperCase().equalsIgnoreCase(DiasDaSemana.QUINTA.toString())) {
            descontoSem = valor * 0.5;
            System.out.println("Hoje é quinta feira e você terá o desconto imposto pelo seu dia " + diaSemana);
        } else if (diaSemana.toUpperCase().equalsIgnoreCase(sexta)) {
            descontoSem = valor * 0.6;
            System.out.println("Hoje é sexta feira e você terá o desconto imposto pelo seu dia " + diaSemana );
        }else {
            System.out.println("Informe um dia da semana!");
        }
    }

    public int compraProduto(int retirar) {
        if (quantidade <= 0){
            System.out.println("---- PRODUTO NÃO ENCONTRADO ----");
            return quantidade;
        } else if (quantidade < retirar) {
            System.out.println("---- QUANTIDADE DE PRODUTO FORA DE ESTOQUE ----");
        }else {
            int retirarProduto = quantidade - retirar;
            System.out.println(retirarProduto);
        }
        return quantidade;
    }
}
