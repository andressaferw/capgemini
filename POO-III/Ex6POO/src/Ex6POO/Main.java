package Ex6POO;

public class Main {
    public static void main(String[] args) {

        Invoice inv = new Invoice(14,"Debito", 20, 100.6f);

        System.out.println("Valor total = " + inv.getInvoiceAmout());
    }
}
