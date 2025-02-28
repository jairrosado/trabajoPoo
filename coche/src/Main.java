import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el color del coche: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese la marca del coche: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el modelo del coche: ");
        String modelo = scanner.nextLine();

        coche miCoche = new coche(color, marca, modelo);

        System.out.println("\nDatos del coche ingresado:");
        System.out.println("Color: " + color);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);


        miCoche.arrancar();
        miCoche.frenar();

        scanner.close();
    }
}
