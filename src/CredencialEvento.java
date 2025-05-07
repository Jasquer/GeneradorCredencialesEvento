public class CredencialEvento implements Cloneable {
    private String nombre;
    private String cargo;
    private String rut;

    public CredencialEvento() {
        this.nombre = "";
        this.cargo = "";
        this.rut = "";
    }

    public CredencialEvento(String nombre, String cargo, String rut) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void mostrar() {
        System.out.println("🪪 Credencial de Evento");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("RUT: " + rut);
        System.out.println("-----------------------------");
    }

    @Override
    public CredencialEvento clone() {
        try {
            CredencialEvento copia = (CredencialEvento) super.clone();
            // Deep copy explícita
            copia.nombre = new String(this.nombre);
            copia.cargo = new String(this.cargo);
            copia.rut = new String(this.rut);
            return copia;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("No se pudo clonar la credencial.");
        }
    }
}
