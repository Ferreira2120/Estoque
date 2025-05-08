import br.com.Ferreira.estoqueProdutos.Sabonete;
import br.com.Ferreira.estoqueProdutos.TiposProdutos;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Sabonete sab = new Sabonete("Dove", 10, 789456129);
        sab.setQuantidade(10);
        sab.setDescricao("Esse produto é usado para higiene pessoal. Ele não foi testado em animais e é 100% Natual");


        System.out.println(sab.getNome());
        System.out.println(sab.calcularPreco(30));
        sab.getCodigo();
        sab.setQuantidade(30);
        sab.setQuantidade(30);

        System.out.println("Comprou: " + sab.compraProduto(20));
        System.out.println("Em estoque: " + sab.getQuantidade());


        Sabonete sab2 = new Sabonete("Principia", 17.50, 789456129);
        sab2.setQuantidade(10);
        sab2.setDescricao("Esse produto tem como foco limpeza facial");
        sab2.setValidade("17/02/2026");
//        sab2.getNome();

        ArrayList<TiposProdutos> listaProdutosHigiene = new ArrayList<>();
        listaProdutosHigiene.add(sab);
        listaProdutosHigiene.add(sab2);
//        System.out.println(listaProdutosHigiene.get(0));

        for (int i = 0; i < listaProdutosHigiene.size(); i++) {
            System.out.println(listaProdutosHigiene.get(i));
        }
    }
}
