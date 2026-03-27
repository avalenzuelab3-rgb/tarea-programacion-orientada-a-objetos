package programa;


public class MainLibro {

    public static void main(String[] args) {

       
        Libro l1 = new Libro("Java Básico", "Juan Pérez", 250);
        Libro l2 = new Libro("Estructuras de Datos", "María López", 350);
        Libro l3 = new Libro("Programación Avanzada", "Carlos Ruiz", 500);

    
        if (l1.esLargo()) {
            System.out.println(l1.titulo + " es un libro largo.");
        }

        if (l2.esLargo()) {
            System.out.println(l2.titulo + " es un libro largo.");
        }

        if (l3.esLargo()) {
            System.out.println(l3.titulo + " es un libro largo.");
        }
    }
}