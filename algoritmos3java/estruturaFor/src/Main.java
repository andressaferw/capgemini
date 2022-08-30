import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ESTRUTURAS DE REPETIÇAO
        /*
            Como voce a deve ter visto, estruturas de repetiçao servem para
            fazer com que um trecho de codigo deseja executado de forma repetida,
            podendo essa repetiçao ter um numero conhecido ou nao de vezes.
            Em Java existem duas estruturas de repetiçao:

            1 - while (Correspondente ao "enquanto" no portugol)
            2 - for (Correspondente ao "para" no portugol)

            Em ambas estruturas e preciso definir uma condiçao de parada para
            garantir que nao haja um loop infinito. Os oepradores possiveis de
            serem utilizados sao os operadores relacionais e logicos

            Os operadores relacionais existentes na linguagem sao:
            1 - Maior           (>)
            2 - Maior ou igual  (>=)
            3 - Menor           (<)
            4 - Menor ou igual  (<=)
            5 - Diferente       (!=)
            6 - Igual           (==)

            Os operadores logicos existentes na linguagem sao:
            1 - Operador E      (&&)
            2 - Operador OU     (||)
            3 - Operador NAO    (!)

            Precedencia dos Operadores:
            Ordem 	Tipo de Operador 	Precedencia
            1           Pos Fixo                expr++   expr�
            2           Pre fixo e Un�rio       ++expr   �expr   +expr   -expr   !
            3           Multiplicativo          *    /    %
            4           Aditivo                 +    �
            5           Relacional              >    >=    <=    <
            6           Igualdade               ==    !=
            7           AND Logico              &&
            8           OR Logico               ||
            9           Atribuiçao              =   +=   -=   *=   /=   %=
         */

        // ESTRUTURA WHILE
        /*
            A estrutura while e utilizada quando a quantidade de repetiçoes
            necessarias nao for preciamente conhecida. Ex: quando voce quer
            repetir algumas instruçoes N vezes.
         */

        //Exemplo de estrutura simples
        boolean desejaRepetir = true;

        Scanner leitor = new Scanner(System.in);

        String nome;
        byte idade;

        while (desejaRepetir = true) {
            System.out.println("Digite o nome do usuario");
            nome = leitor.nextLine();

            System.out.println("Digite a idade do usuario");
            idade = leitor.nextByte();

            System.out.println(nome + " tem " + idade + " anos!");

            desejaRepetir = leitor.nextBoolean();
        }

        // outra reprodução
        int totalAlunos = 10;

        Scanner leitorScanner = new Scanner(System.in);

        while(totalAlunos > 0) {
            String nomeAluno = leitorScanner.nextLine();
            int idadeAluno = leitorScanner.nextInt();

            System.out.println("O nome do aluno é: " + nomeAluno + " e sua idade é: " + idadeAluno);

            totalAlunos = totalAlunos - 1;
        }

        // ESTRUTURA FOR
        /*
            A estrutura de repetiçao for e indicada para as situaçoes onde
            previamente se sabe quantas repetiçoes serao necessarias.

            Essa estrutura e composta por 3 partes:
            1 - Criaçao da variavel de controle da estrutura
            2 - Condiçao de parada
            3 - Incremento

            Cada uma dessas partes e separada por um ";"
         */

        for (int i = 0; i < 10; i++) {
            System.out.println("O valor de i e: " + i);
        }

        /*
            Algumas coisas que voce deve tormar cuidado quando trabalha com
            estruturas de repetiçao e em garantir que a condiçao de parada
            em algum momento seja atentida caso contrario sua estrutura de
            repetiçao ficara em um loop infinito

            Outra coisa que voce nao deve fazer e criar variaveis dentro de uma
            estrutura de repetiçao. Caso voce faça isso, a cada repetiçao da
            estrutura seu algoritmo estara alocando memoria do computador e
            isso fara com que sua aplicaçao tenha um alto consumo de memoria.
            Caso voce precise ler valores dentro da estrutura, crie as variaveis
            de leitura fora da estrutura repetiçao
         */
    }
}
