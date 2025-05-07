import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoEvento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener configuración global (Singleton)
        ConfiguracionGlobal config = ConfiguracionGlobal.getInstancia();
        config.setLogo("🌐 TechConf 2025");
        config.setFuente("Verdana");

        // Crear plantilla base (1Prototype)
        CredencialEvento plantilla = new CredencialEvento();

        // Lista para guardar credenciales generadas
        List<CredencialEvento> credenciales = new ArrayList<>();

        // Menú interactivo
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar nueva credencial");
            System.out.println("2. Ver credenciales generadas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del asistente: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese cargo del asistente: ");
                    String cargo = scanner.nextLine();

                    System.out.print("Ingrese RUT del asistente: ");
                    String rut = scanner.nextLine();

                    // Clonar la plantilla y personalizarla
                    CredencialEvento clon = plantilla.clone();
                    clon.setNombre(nombre);
                    clon.setCargo(cargo);
                    clon.setRut(rut);

                    credenciales.add(clon);
                    System.out.println("✅ Credencial generada con éxito.");
                    break;

                case 2:
                    System.out.println("\n🔎 Credenciales generadas:");
                    for (CredencialEvento c : credenciales) {
                        c.mostrar();
                        // Mostrar también configuración global
                        System.out.println("Logo: " + config.getLogo());
                        System.out.println("Fuente: " + config.getFuente());
                        System.out.println("-----------------------------");
                    }
                    break;

                case 3:
                    continuar = false;
                    System.out.println("👋 Cerrando programa...");
                    break;

                default:
                    System.out.println("❌ Opción inválida. Intente nuevamente.");
            }
        }

        scanner.close();
    }
}
