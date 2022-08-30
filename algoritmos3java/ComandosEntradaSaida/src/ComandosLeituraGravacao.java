import java.util.Scanner;

public class ComandosLeituraGravacao {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine();
        String codigoRua = leitor.next();
        char teste = leitor.next().charAt(0);

        System.out.println("Texto que será exibido no console");
        System.out.print("Texto que será exibido no console");

        /*
            Existem algumas opções de comandos de saída utilizando a classe
            System. São elas:

            1 - print() - Imprime o valor de uma variável
            2 - printf() - Imprime o valor de uma variável conforme uma formatação especificada
            3 - println() - Imprime o valorm de uma variável e pula uma linha
        */
    }
}
