/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_herencia_01.Entidades;

/**
 *
 * @author Walter
 */
public final class Gato extends Animal {
    
    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void Alimentarse() {
        System.out.println("\nEl gato "+nombre+" de la raza "+raza+" con "+edad+" años de edad come "+alimento+".");
    }
    
}
