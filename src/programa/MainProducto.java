package programa;

public class MainProducto {

    public static void main(String[] args) {

       
        Producto p1 = new Producto("001", "Laptop", 5000);
        Producto p2 = new Producto("002", "Mouse", 200);

        
        p1.aplicarDescuento(10); 
        p2.aplicarDescuento(20); 

        
        p1.mostrar();
        p2.mostrar();
    }
}