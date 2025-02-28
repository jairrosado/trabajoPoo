import java.util.Scanner; // Importar la clase Scanner

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese el ISBN del libro: ");
        String isbn = scanner.nextLine();

        libro miLibro = new libro(titulo, autor, isbn);

        System.out.println("\nDatos del libro ingresado:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);

        miLibro.abrir();
        miLibro.leer();


        scanner.close();
    }
}
