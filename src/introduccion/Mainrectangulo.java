package introduccion;

public class Mainrectangulo {

    public static void main(String[] args) {

        // Crear 2 rectángulos
        rectangulo r1 = new rectangulo(5, 3);
        rectangulo r2 = new rectangulo(4, 6);

        // Mostrar áreas
        System.out.println("Área rectángulo 1: " + r1.area());
        System.out.println("Área rectángulo 2: " + r2.area());

        // Comparar áreas
        if (r1.area() > r2.area()) {
            System.out.println("El rectángulo 1 tiene mayor área.");
        } else if (r2.area() > r1.area()) {
            System.out.println("El rectángulo 2 tiene mayor área.");
        } else {
            System.out.println("Ambos rectángulos tienen la misma area.");
        }
    }
}
//prueba git