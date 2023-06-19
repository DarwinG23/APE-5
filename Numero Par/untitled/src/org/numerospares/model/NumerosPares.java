package org.numerospares.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumerosPares {
    private List<Integer> numeros;

    public NumerosPares() {
        numeros = new ArrayList<>();
    }

    public void generarListaNumeros(int cantidadNumeros, int rangoMin, int rangoMax) {
        Random random = new Random();
        for (int i = 0; i < cantidadNumeros; i++) {
            int numero = random.nextInt(rangoMax - rangoMin + 1) + rangoMin;
            numeros.add(numero);
        }
    }

    public List<Integer> getNumerosPares() {
        List<Integer> numerosPares = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }
        }
        return numerosPares;
    }

    public void mostrarNumerosPares() {
        System.out.println("Números pares:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}
