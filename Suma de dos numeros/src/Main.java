import org.suma.model.SUMA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2;

        SUMA obj = new SUMA();

        System.out.println("Introduce un número1: ");
        n1 = sc.nextInt();
        System.out.println("Introduce otro número2: ");
        n2 = sc.nextInt();
        obj.setDatos(n1, n2);
        System.out.println("La suma es: " + obj.getSuma());
    }
}