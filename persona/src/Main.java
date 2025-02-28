import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese la dirección de la persona: ");
        String direccion = scanner.nextLine();

        persona persona = new persona(nombre, edad, direccion);

        // Mostrar los datos ingresados por el usuario
        System.out.println("\nDatos de la persona ingresada:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);

        persona.caminar();
        persona.hablar();


        scanner.close();
    }
}
