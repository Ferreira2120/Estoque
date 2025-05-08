import br.com.Ferreira.date.Date;
import br.com.Ferreira.estoqueProdutos.Sabonete;
import java.time.LocalDate;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LocalDate diaDaSemana = LocalDate.now();
//        LocalDate verificarDia = diaDaSemana.getDayOfWeek();

        Date data = new Date();
        Sabonete sab = new Sabonete();

        sab.setNome("Sabonete Dove");
        sab.setQuantidade(10);
        sab.setValor(120);
        sab.setDescricao("Esse produto é usado para higiene pessoal. Ele não foi testado em animais e é 100% Natual");


        System.out.println(sab.getNome());
        System.out.println(sab.calcularPreco(30));

        sab.setCodigo(789456129);
        sab.getCodigo();
        sab.compraProduto(20);

//        System.out.println("Comprou: " + sab.compraProduto(7));
//        sab.saberDiaSemana(diaDaSemana);
//        sab.setValidade(sc.nextLine());
//        String val = sab.getValidade();
//        data.validade(val);


        Sabonete sab2 = new Sabonete();
        sab2.setNome("dove");
        sab2.getNome();

    }
}
