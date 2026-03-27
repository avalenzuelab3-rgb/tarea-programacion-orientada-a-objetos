package programa;



public class MainCalculadora {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        double num1 = 10;
        double num2 = 5;

        System.out.println("Suma: " + calc.sumar(num1, num2));
        System.out.println("Resta: " + calc.restar(num1, num2));
        System.out.println("Multiplicación: " + calc.multiplicar(num1, num2));
        System.out.println("División: " + calc.dividir(num1, num2));

        
        System.out.println("División entre cero: " + calc.dividir(num1, 0));
    }
}
