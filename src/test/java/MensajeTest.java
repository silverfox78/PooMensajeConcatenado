import org.junit.Assert;
import org.junit.Test;

public class MensajeTest {
    private static final String textoVacio = "";
    private static final String textoNulo = null;
    private static final String textoPrueba = "Prueba";
    private static final String textoPrimero = "FUS";
    private static final String textoSegundo = "ION!!!";

    @Test
    public void ValidaQueSeGenereLaInstancia(){
        Mensaje mensaje = new Mensaje(textoPrueba);
        Assert.assertTrue(mensaje.getTexto() == textoPrueba);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ValidaQueElTextoInicialNoSeaVacio()
    {
        Mensaje mensaje = new Mensaje(textoVacio);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ValidaQueElTextoInicialNoSeaNulo()
    {
        Mensaje mensaje = new Mensaje(null);
    }

    @Test
    public void ValidaConcadenacionInstancias(){
        Mensaje primerMensaje = new Mensaje(textoPrimero);
        Mensaje segundoMensaje = new Mensaje(textoSegundo);
        Mensaje resultado = primerMensaje.Concadenar(segundoMensaje);
        Assert.assertTrue(resultado.getTexto().equals(textoPrimero.concat(textoSegundo)));
    }
}
