public class persona {
    private String nombre;
    private int edad;
    private String direccion;

    public persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public void caminar() {
        System.out.println(nombre + " está caminando.");
    }

    public void hablar() {
        System.out.println(nombre + " está hablando.");
    }
}

