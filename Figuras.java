public class Figuras {
    //atrinutos de el objeto figuras
    //caracteristicas que lo componen
    public String nombre;
    public int n_lados;
    public float longitud_lados;
    private String color_figura;

    public Figuras(String nombre, int n_lados, float longitud_lados, String color_figura) {
        this.nombre = nombre;
        this.n_lados = n_lados;
        this.longitud_lados = longitud_lados;
        this.color_figura = color_figura;
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


    public float getLongitud_lados() {
        return longitud_lados;
    }

    public void setLongitud_lados(float longitud_lados) {
        this.longitud_lados = longitud_lados;
    }

    public String getColor_figura() {
        return color_figura;
    }

    public void setColor_figura(String color_figura) {
        this.color_figura = color_figura;
    }

    public  void Imprimir(){
        System.out.println("Figura: " + getNombre() );
        System.out.println("# de lados: " +getN_lados() );
        System.out.println("Longitud en cm: " + getLongitud_lados() );
        System.out.println("Color de la figura " + getColor_figura());

    }
    //metodos
    public void calcularPerimetro(){
         System.out.println("El perimetro de "+this.nombre + " es : "+longitud_lados*n_lados);
    }
}
