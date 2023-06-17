package org.promedio.model;
import java.util.List;
import java.util.ArrayList;

public class Numero {

    //Atributos
    int numero;

    //Relaciones
    private  Promedio promedio;

    //Constructor
    public Numero(int numero) {
        this.numero = numero;
    }

    //Getters and Setters
    public int getNumero() {
        return numero;
    }


}
