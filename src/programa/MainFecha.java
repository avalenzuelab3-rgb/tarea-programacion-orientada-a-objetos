package programa;



public class MainFecha {

    public static void main(String[] args) {


        Fecha f1 = new Fecha(10, 5, 2024);
        Fecha f2 = new Fecha(32, 8, 2024); 
        Fecha f3 = new Fecha(15, 13, 2024); 
       
        if (f1.esValida()) {
            System.out.print("Fecha válida: ");
            f1.mostrar();
        } else {
            System.out.print("Fecha inválida: ");
            f1.mostrar();
        }

        if (f2.esValida()) {
            System.out.print("Fecha válida: ");
            f2.mostrar();
        } else {
            System.out.print("Fecha inválida: ");
            f2.mostrar();
        }

        if (f3.esValida()) {
            System.out.print("Fecha válida: ");
            f3.mostrar();
        } else {
            System.out.print("Fecha inválida: ");
            f3.mostrar();
        }
    }
}