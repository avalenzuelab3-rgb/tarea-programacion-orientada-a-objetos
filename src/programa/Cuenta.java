package programa;



public class Cuenta {

    String titular;
    double saldo;

    
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado: " + monto);
        } else {
            System.out.println("Monto inválido.");
        }
    }

    
    public void retirar(double monto) {
        if (monto > 0) {
            if (saldo - monto >= 0) {
                saldo -= monto;
                System.out.println("Retiro realizado: " + monto);
            } else {
                System.out.println("No se puede retirar. Saldo insuficiente.");
            }
        } else {
            System.out.println("Monto inválido.");
        }
    }

   
    public void mostrar() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo actual: " + saldo);
        System.out.println("----------------------");
    }
}