import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Crear usuario");
            System.out.println("2. Mostrar usuarios");
            System.out.println("3. Editar usuario");
            System.out.println("4. Eliminar usuario");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    crearUsuario();
                    break;
                case 2:
                    mostrarUsuarios();
                    break;
                case 3:
                    editarUsuario();
                    break;
                case 4:
                    eliminarUsuario();
                    break;
            }

        } while (opcion != 5);
    }

    public static void crearUsuario() {
        System.out.println("Creando usuario...");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); 

        listaUsuarios.add(new Usuario(nombre, edad));
        System.out.println("Usuario agregado.");
    }

    public static void mostrarUsuarios() {
        System.out.println("Mostrando usuarios...");
        for (int i = 0; i < listaUsuarios.size(); i++) {
            System.out.println(i + ": " + listaUsuarios.get(i));
        }
    }

    public static void editarUsuario() {
        System.out.println("Editando usuario...");
        mostrarUsuarios();

        System.out.print("Seleccione índice: ");
        int index = sc.nextInt();
        sc.nextLine();

        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Nueva edad: ");
        int edad = sc.nextInt();

        listaUsuarios.get(index).setNombre(nombre);
        listaUsuarios.get(index).setEdad(edad);

        System.out.println("Usuario actualizado.");
    }

    public static void eliminarUsuario() {
        System.out.println("Eliminando usuario....");
        mostrarUsuarios();

        System.out.print("Seleccione índice: ");
        int index = sc.nextInt();

        listaUsuarios.remove(index);
        System.out.println("Usuario eliminado.");
    }
}