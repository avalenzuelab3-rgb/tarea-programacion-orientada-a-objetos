package programa;

public class rectangulo {

    double base;
    double altura;

   
    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    public double area() {
        return base * altura;
    }

  
    public double perimetro() {
        return 2 * (base + altura);
    }
}