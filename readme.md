[![Build Status](https://travis-ci.org/silverfox78/PooMensajeConcatenado.svg?branch=master)](https://travis-ci.org/silverfox78/PooMensajeConcatenado)


# CIISA - Metodologia de programacion avanzada
## **Profesor :** Raul Carvajal Sanchez
### **Alumnos :** Carlos Hidalgo y Samuel Barrera
---

**Objetivo :** Postear solución correcta al problema ***"Crear el código 100% O.O. para concatenar  un mensaje con otro mensaje en UN NUEVO mensaje"***

Recuerden como se explico en clases todos son objetos mensajes y el nuevo mensaje (resultado de la concatenación debe ser un nuevo objeto mensaje)".

---

### Paso N°1

Validamos que podamos generar una instancia del objeto, en este caso identificamos el objeto llamado [**Mensaje**] de este, vemos la necesidad que disponga de un atributo llamado [**texto**].
Para validar que exista, requerimos:

1. Generar la clase
2. Generar un constructor con un parametro de entrada que inicialice el atributo texto
3. Verificar que el atributo halla quedado inicializado con el valor dado.

Esto nos quedaria asi:

En [**MensajeTest.java**]
```java
    private static final String textoPrueba = "Prueba";

    @Test
    public void ValidaQueSeGenereLaInstancia(){
        Mensaje mensaje = new Mensaje(textoPrueba);
        Assert.assertTrue(mensaje.getTexto() == textoPrueba);
    }
```

Lo cual genera el siguiente codigo:

En [**Mensaje.java**]
```java
    public class Mensaje {
        private final String texto;
    
        public Mensaje(String texto) {
            this.texto = texto;
        }
    
        public String getTexto() {
            return this.texto;
        }
    }
```

---

### Paso N°2

Disponer de un metodo que permita concatenar un mensaje con otro mensaje.
El detalle en este punto es que este metodo debe dar como resultado un nuevo objeto del tipo [**Mensaje**], el cual debe tener la concadenacion de los mensajes originales.

Para esto requerimos:

1. Un texto para una primera instancia de un objeto del tipo [**Mensaje**].
2. Un texto para una segunda instancia de un objeto del tipo [**Mensaje**].
3. Una variable del tipo [**Mensaje**] para representar el primer mensaje.
4. Una variable del tipo [**Mensaje**] para representar el segundo mensaje.
5. Una variable del tipo [**Mensaje**] para representar el resultado concadenado de las instancias previas.

Generamos la siguiente prueba:

En [**MensajeTest.java**]
```java
    @Test
    public void ValidaConcadenacionInstancias(){
        Mensaje primerMensaje = new Mensaje(textoPrimero);
        Mensaje segundoMensaje = new Mensaje(textoSegundo);
        Mensaje resultado = primerMensaje.Concadenar(segundoMensaje);
        Assert.assertTrue(resultado.getTexto().equals(textoPrimero.concat(textoSegundo)));
    }
```

Esto nos da el siguiente codigo:

En [**Mensaje.java**]
```java
    public Mensaje Concadenar(Mensaje mensaje) {
        return new Mensaje(this.texto.concat(mensaje.getTexto()));
    }
```

---

# En Resumen...

Con una clase como la siguiente podemos cubrir la necesidad del requerimiento entregado:

En [**Mensaje.java**]
```java
public class Mensaje {
    private final String texto;

    public Mensaje(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return this.texto;
    }

    public Mensaje Concadenar(Mensaje mensaje) {
        return new Mensaje(this.texto.concat(mensaje.getTexto()));
    }
}
```

---

## Bonus

Para los interesados, se amliaron tantos las pruebas y el codigo con un par de cosas interesantes...
