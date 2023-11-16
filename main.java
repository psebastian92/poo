package pedir_datos_personales;

public class main {

    public static void main(String[] args) {

        // Creamos un objeto de la clase datos_personales
        datos_personales persona1 = new datos_personales();

        // Llamamos a métodos para pedir información al usuario
        persona1.pedirNombre();
        persona1.pedirEdad();
        persona1.pedirAltura();
        persona1.pedirGenero();

        System.out.println("\n");

        // Llamamos a métodos para imprimir la información recopilada
        persona1.imprimirNombre();
        persona1.imprimirEdad();
        persona1.imprimirAltura();
        persona1.imprimirGenero();
    }
}
