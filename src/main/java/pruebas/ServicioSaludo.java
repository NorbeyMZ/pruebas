package pruebas;

import org.springframework.stereotype.Service;

@Service
public class ServicioSaludo {

    public String saludar() {
        return "¡Hola, como estan!";
    }

    public String saludar(String nombre) {
        return "¡Hola, " + nombre + "!";
    }

    public String despedirse() {
        return "¡Adiós!";
    }
}
