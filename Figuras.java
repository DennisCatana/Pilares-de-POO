public class Figuras {
    //atrinutos de el objeto figuras
    //caracteristicas que lo componen
    public String nombre;
    public int n_lados;

    public Figuras(String nombre, int n_lados) {
        this.nombre = nombre;
        this.n_lados = n_lados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN_lados() {
        return n_lados;
    }

    public void setN_lados(int n_lados) {
        this.n_lados = n_lados;
    }

    public  void Imprimir(){
        System.out.println("Figura: " + getNombre() );
        System.out.println("# de lados: " +getN_lados() );

    }
    //metodos
    public void calcularPerimetro(){
        System.out.println("Para calcular el perimetro se necesita conocer la longitud de los lados y el numero de lados en el caso de los Poligonos");
    }
}
