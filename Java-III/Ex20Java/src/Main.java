import java.util.Scanner;

// renegociacao ou

public class Main {
    public static void main(String[] args) {
        int anoEmprestimo = 0;
        float valorEmprestimo = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;

        int totalEmprestimos = 0;
        int totalEmprestimosNovos = 0;

        Scanner leitor = new Scanner(System.in);

        char desejaRepetir = 's';

        while (desejaRepetir == 's' || desejaRepetir == 'S') {
            // entrada de dados
            System.out.println("Digite o ano do empréstimo");
            anoEmprestimo = leitor.nextInt();
            System.out.println("Digite o valor do empréstimo");
            valorEmprestimo = leitor.nextFloat();

            if (anoEmprestimo <= 2000) {
                porcentagemDesconto = 0.07f;
            } else {
                porcentagemDesconto = 0.12f;
                totalEmprestimosNovos++;
            }
            totalEmprestimos++;

            valorDesconto = valorEmprestimo * porcentagemDesconto;
            valorPagar = valorEmprestimo - valorDesconto;

            System.out.println("O valor do desconto foi de: " + valorDesconto);
            System.out.println("O valor que deve ser pago é: " + valorPagar);

            System.out.println("Deseja fazer mais empréstimos? S - Sim / N - Nao");
            desejaRepetir = leitor.next().charAt(0);
        }
        System.out.println("Total de empréstimos novos: " + totalEmprestimosNovos);
        System.out.println("Total de empréstimos: " + totalEmprestimos);
    }
}
