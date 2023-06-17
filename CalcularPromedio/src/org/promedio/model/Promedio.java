package org.promedio.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Promedio {

    //Atributos
    int cantidad;
    Scanner teclado = new Scanner(System.in);

    //Relacioenes
    List<Numero> numeroList = new ArrayList<Numero>();


    public void pedirNumeros(){
        System.out.println("Cuantos números desea ingresar: ");
        cantidad = teclado.nextInt();
        for (int i = 0; i < cantidad; i++){
            System.out.println("Ingrese un numero: ");
            int numero = teclado.nextInt();
            numeroList.add(new Numero(numero));
        }
    }

    public void calcularPromedio(){
        int suma = 0;
        for (int i = 0; i < cantidad; i++){
            suma = suma + numeroList.get(i).getNumero();
        }
        System.out.println("El promedio es: " + suma/cantidad);

    }

}

