package programa;



public class Libro {

    String titulo;
    String autor;
    int paginas;

    
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    
    public boolean esLargo() {
        return paginas > 300;
    }

    
    public void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("----------------------");
    }
}