/**
 * Autor: Darwin Granda
 *
 */

import org.promedio.model.Numero;
import org.promedio.model.Promedio;


import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Promedio promedio = new Promedio();
        int cantidad = 0;
        promedio.pedirNumeros();
        promedio.calcularPromedio();

    }
}