package Heranca;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Vendedor v = new Vendedor();
        v.setNome("Marcio");
        v.setSalario(1000.0f);
        v.setCpf("23723424");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.f);
        v.setTotalItensVendidos(10);

        System.out.println("O salario do vendedor é: " + v.calcularSalario());

        v.calcularSalario();

        Motorista m = new Motorista();
        m.setNome("Sergio");

    }
}
