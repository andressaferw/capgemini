public class Main {
    public static void main(String[] args) {

        //ESTRUTURAS DE SELEÇAO
        /*
            Como voce ja deve ter visto, estruturas de seleçao servem para
            fazer desvios pelo codigo, fazendo com que trechos de codigo sejam
            executados ou ignorados durante a a execuçao dependendo de uma
            condiçao previamente definida.
            Em Java existem duas estruturas de seleçao:

            1 - if (Correspondente ao "se" no portugol)
            2 - switch (Correspondente ao "caso" no portugol)

            Em ambas estruturas e possivel utilizar os operadores relacionais e
            logicos

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
            3 - Operador NaO    (!)

            Precedencia dos Operadores:
            Ordem 	Tipo de Operador 	Precedencia
            1       Pos Fixo            expr++   expr�
            2       Pre fixo e Un�rio  ++expr   �expr   +expr   -expr   !
            3       Multiplicativo      *    /    %
            4       Aditivo             +    �
            5       Relacional          >    >=    <=    <
            6       Igualdade           ==    !=
            7       AND Logico          &&
            8       OR Logico           ||
            9       Atribuiçao          =   +=   -=   *=   /=   %=
         */

        // ESTRUTURA IF
        // A estrutura if pode ser montada de forma simples ou aninhada.
        //Exemplo de estrutura simples
        int media = 7;

        if (media >= 7) {
            if (media == 10) {
                System.out.println("Aprovado com nota maxima");
            } else {
                System.out.println("Aprovado");
            }
        }

        //Exemplo de estrututa aninhada
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            if (media >= 5) {
                System.out.println("Em recuperaçao");
            } else {
                System.out.println("Reprovado");
            }
        }

        // ESTRUTURA SWITCH
        /*
            A estrutura de seleçao switch testa o valor contido em uma variavel
            e o compara com os valores fornecidos em cada caso, representados pela
            palavra reservada case. Podemos ter quantos casos forem necessarios
            na estrutura, e quando um dos valores corresponder ao da variavel de
            teste, todo o codigo que esta dentro daquele bloco do caso serao
            executado.

            A variavel que sera utilizada no controle da estrutura pode ser dos
            tipos primitivos como: int, char, byte e tambem do tipo String
            (nao sao permitidos tipos como float, double pois estes trabalham
            com numeros com casas decimais)
         */

        int codigoProduto = 2;

        switch (codigoProduto) {

            case 1:

                System.out.println("Produto 1");
                break;

            case 2:

                System.out.println("Produto 2");
                break;

            case 3:

                System.out.println("Produto 3");
                break;

            default:

        }
    }
}
