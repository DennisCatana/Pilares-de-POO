//Herencia
//La clase circulo (Hijo) hereda caracteristicas de la clase Figuras (Padre)
public class circulo extends Figuras{
    public int radio;
    public int diametro;

    public circulo(String nombre, int n_lados, float longitud_lados, String color_figura) {
        super(nombre, n_lados, longitud_lados, color_figura);
    }

    public circulo(String nombre, int n_lados, float longitud_lados, String color_figura, int radio, int diametro) {
        super(nombre, n_lados, longitud_lados, color_figura);
        this.radio = radio;
        this.diametro = diametro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
