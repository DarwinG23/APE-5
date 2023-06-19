import org.numerospares.model.NumerosPares;


public class Main {
    public static void main(String[] args) {
        NumerosPares numerosPares = new NumerosPares();
        numerosPares.generarListaNumeros(20,1,100);
        System.out.println("Números pares:\n" + numerosPares.getNumerosPares());
    }
}