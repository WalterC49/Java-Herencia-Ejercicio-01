/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente:
*/
package ejercicio_01;

import ejercicio_01.Entidades.Animal;
import ejercicio_01.Entidades.Caballo;
import ejercicio_01.Entidades.Gato;
import ejercicio_01.Entidades.Perro;

/**
 *
 * @author Walter
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro = new Perro("Stitch","Carne",15,"Dobberman");
        perro.Alimentarse();
        
        Perro perro1 = new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro1.Alimentarse();
        
        Animal gato = new Gato("Pelusa","Galletas",15,"Síames");
        gato.Alimentarse();
        
        Animal caballo = new Caballo("Spark","Pasto",25,"Fino");
        caballo.Alimentarse();
        
    }
    
}
