public class Main {
    public static void main(String[] args) {
        //Abstraccion
        Figuras figura1 =new Figuras("cuadrado", 4, 6,"verde");

        figura1.Imprimir();
        figura1.calcularPerimetro();
        System.out.println("\n--------------------------------------------------------------\n");

        //Polimorfismo
        System.out.println("Polimorfismo\n");
        Figuras figuraA = new Figuras("Triangulo", 3, 10, "Rojo");
        Figuras figuraB = new circulo("Circulo", 0, 5, "Azul", 3, 6);

        figuraA.Imprimir();
        figuraA.calcularPerimetro();
        System.out.println("--------------------------------------------------------------");
        figuraB.Imprimir();
        figuraB.calcularPerimetro();

    }
}
