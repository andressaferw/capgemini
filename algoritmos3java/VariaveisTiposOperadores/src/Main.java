public class Main {
    public static <date> void main(String[] args) {

        // TIPOS DE VARIAVEIS

        /*
            As variaveis podem ser divididas em dois tipos: Variaveis primitivas e nao primitivas (referencia)

            Variaveis primitivas sao aquelas que foram criadas com a linguagem
            de programaçao e servem para armazenar valores simples, como, por
            exemplo, um número, um valor logico ou ate mesmo um caractere.

            Ja as variaveis nao primitivas (referencia) sao aquelas que foram
            criadas com o aprimoramento da linguagem. Elas servem para armazenar
            valores mais complexos.
         */

        //Exemplos de tipos de variaveis primitivas
        int idade = 0;
        float cotacaoDolar = 5.0f;
        double cotacaoEuro = 6.0d;
        char genero = 'M';
        byte placar = 0;
        boolean estaCadastrado = false;
        date data;
        /*
            Tipos, tamanhos e valores default das variaveis primitivas:

            Tipo 	Tamanho (bits) 	Faixa                                                           Valor Padrao
            byte 	8               -128 a 127                                                      0
            short 	16              -32.768 a 32.767                                                0
            int 	32              -231 a 231 e 1                                                  0
            long 	64              -263 a 263 -1                                                   0L
            float 	32              IEEE 754 e 1,40129846432481707e-45 a 3,40282346638528860e+38 	0.0f
            double 	64              IEEE 754 e 4,94065645841246544e-324 a 1,79769313486231570e+308   0.0d
        */

        //Exemplos de tipos variaveis nao primitivas
        String nome = "Esse é um texto de uma variável String";
        date dataNascimento;

        /*
            Note que nas variaveis primitivas o tipo inicia com uma letra minuscula,
            ja nas variaveis nao primitivas inicia com uma letra maiuscula
        */

        //OPERADORES
        /*
            Java conta com 5 operadores aritmeticos:

            Soma            (+)
            Subtraçao       (-)
            Multiplicaçao   (*)
            Divisao         (/)
            Resto           (%)
        */
    }
}
