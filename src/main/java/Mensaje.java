import com.sun.deploy.util.StringUtils;

public class Mensaje {
    private static final String mensajeErrorArgumento = "El texto informado debe ser valido.";
    private final String texto;

    public Mensaje(String texto) {
        try {
            if(texto.isEmpty() || texto.equalsIgnoreCase(null)){
                throw new IllegalArgumentException(mensajeErrorArgumento);
            }
        }
        catch(Exception ex) {
            throw new IllegalArgumentException(mensajeErrorArgumento);
        }

        this.texto = texto;
    }

    public String getTexto() {
        return this.texto;
    }

    public Mensaje Concadenar(Mensaje mensaje) {
        return new Mensaje(this.texto.concat(mensaje.getTexto()));
    }
}
