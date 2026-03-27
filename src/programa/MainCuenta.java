package programa;



public class MainCuenta {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta("Angel", 1000);

        cuenta.mostrar();

        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.retirar(1500); 
        cuenta.mostrar();
    }
}