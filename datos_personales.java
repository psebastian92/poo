// Declaración del paquete al que pertenece la clase
package pedir_datos_personales;

// Importación de la clase Scanner para obtener entrada del usuario
import java.util.Scanner;

// Definición de la clase datos_personales
public class datos_personales {
    
    // Instancia de la clase Scanner para obtener entrada del usuario
    Scanner datos = new Scanner(System.in);

    // Declaración de atributos para almacenar la información personal
    String nombre;
    int edad;
    float altura;
    char genero;
    
    // Método para solicitar al usuario que ingrese su nombre
    public void pedirNombre() {
        System.out.println("Ingresa tu nombre: ");
        nombre = datos.next();
    }
    
    // Método para imprimir el nombre almacenado
    public void imprimirNombre() {
        System.out.println("Tu nombre es: " + nombre);
    }
    
    // Método para solicitar al usuario que ingrese su edad
    public void pedirEdad() {
        System.out.println("Ingresa tu edad: ");
        edad = datos.nextInt();
    }
    
    // Método para imprimir la edad almacenada
    public void imprimirEdad() {
        System.out.println("Tu edad es: " + edad);
    }
    
    // Método para solicitar al usuario que ingrese su altura
    public void pedirAltura() {
        System.out.println("Ingresa tu altura: ");
        altura = datos.nextFloat();
    }
    
    // Método para imprimir la altura almacenada
    public void imprimirAltura() {
        System.out.println("Tu altura es: " + altura);
    }
    
    // Método para solicitar al usuario que ingrese su género
    public void pedirGenero() {
        System.out.println("Ingresa tu género: ");
        genero = datos.next().charAt(0);
    }
    
    // Método para imprimir el género almacenado
    public void imprimirGenero() {
        System.out.println("Tu género es: " + genero);
    }
}
