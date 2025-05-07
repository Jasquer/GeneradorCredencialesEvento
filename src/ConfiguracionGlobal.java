public class ConfiguracionGlobal {
    private static ConfiguracionGlobal instancia;

    private String logo;
    private String fuente;

    // Constructor privado (Singleton)
    private ConfiguracionGlobal() {
        this.logo = "🎫 Evento Anual 2025";
        this.fuente = "Arial";
    }

    // Método de acceso a la instancia única
    public static ConfiguracionGlobal getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionGlobal();
        }
        return instancia;
    }

    // Getters y setters
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }
}
