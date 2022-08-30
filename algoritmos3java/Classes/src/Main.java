import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //ORIENTAÇAO A OBJETOS
        /*
            A programaçao orientada a objetos e um paradigma de programaçao
            criado na decada de 60 a partir da linguagem de programaçao
            SmallTalk e que se difundiu amplamente nos dias atuais.

            A POO (Programaçao Orientada a Objetos) foi criada para tentar
            aproximar o mundo real do mundo virtual: a ideia fundamental e
            tentar simular o mundo real dentro do computador. Para isso, nada
            mais natural do que utilizar Objetos, afinal, nosso mundo e composto
            de objetos.

            Na POO o programador e responsavel por moldar o mundo dos objetos,
            e explicar para estes objetos como eles devem interagir entre si.

            Cada objeto possui suas pr�prias informaçoes (atributos) e podem
            realizar um conjunto de açoes pre definidos(metodos). A interaçao
            entre objeto acontece exatamente quando um objeto "solicita" que
            o outro objeto execute uma de suas açoes(metodos).

            Para ser criado o objeto precisa de um "molde" e esse molde e a
            Classe, nela serao descritas quais informaçoes o objeto podera
            armazenar e quais açoes ele podera executar com as suas informaçoes

            Os 4 conceitos basicos da orientaçao a objetos sao:
            1 - Classe (Consiste na definiçao da entidade do mundo real, o molde)
            2 - Objeto (Consiste no resultado criado a partir do molde)
            3 - Atributo (Consiste nos informaçoes que aquele objeto podera conter)
            4 - Metodos (Consiste nas açoes que aquele objeto podera realiziar)
        */

        /*
            Vamos imaginar o desenvolcimento de uma aplicaçao que calcule o IMC
            de uma pessoa.

            Para resolver esse problema de forma orientada a objeto, e
            necessario refletir sobre qual entidade do mundo real eu quero
            respresentar dentro do meu algoritmo, nesse exemplo a pessoa.

            Apos identificada da(s)entidade(s) do mundo real que eu vou modelar
            dentro do meu algoritmo e necessario identificar quais informaçoes
            dessa entidade sao relevante para a resoluçao do meu problema,
            nesse caso, peso e altura da pessoa.

            Note que uma pessoa tem muitas outras informaçoes alem dessas, porem
            para a resoluçao desse problema apenas essas informaçoes sao
            necessarias.

            Alem de identificar quais informaçoes da entidade
            sao pertinentes, e necessario identificar o que essa entidade podera
            fazer, nesse caso a pessoa calculara seu proprio IMC.

            Vamos a soluçao desse problema:
            1 - De uma olhada na classe pessoa que pertence a esse projeto
            2 - Abaixo e criada uma pessoa e definida as informaçoes de peso e
                altura dessa pessoa
            3 - E solicitado que a pessoa faça o calculo do seu IMC
        */

        //Criaçao do objeto
        Pessoa objetoPessoa = new Pessoa(70.0f, 1.70f);
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o peso da pessoa");
        objetoPessoa.setPeso(leitor.nextFloat());

        System.out.println("Digite a altura da pessoa");
        objetoPessoa.setAltura(leitor.nextFloat());

        System.out.println("IMC = " + objetoPessoa.calcularIMC());

    }
}
