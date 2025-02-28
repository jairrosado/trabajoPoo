public class coche {
    private String color;
    private String marca;
    private String modelo;

    public coche(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void arrancar() {
        System.out.println("El coche ha arrancado.");
    }

    public void frenar() {
        System.out.println("El coche ha frenado.");
    }
}
