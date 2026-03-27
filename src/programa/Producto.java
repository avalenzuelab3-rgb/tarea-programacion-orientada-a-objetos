package programa;

public class Producto {

    String codigo;
    String nombre;
    double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

  
    public void aplicarDescuento(double porcentaje) {
        double descuento = precio * (porcentaje / 100);
        precio = precio - descuento;
    }

    
    public void mostrar() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("----------------------");
    }
}