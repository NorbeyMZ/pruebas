package pruebas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PruebasServicioSaludo {

    private final ServicioSaludo servicioSaludo = new ServicioSaludo();

    @Test
    void pruebaSaludarPorDefecto() {
        assertEquals("¡Hola, como estan!", servicioSaludo.saludar());
    }

    @Test
    void pruebaSaludarConNombre() {
        assertEquals("¡Hola, Norbey!", servicioSaludo.saludar("Norbey"));
    }

    @Test
    void pruebaDespedirse() {
        assertEquals("¡Adiós!", servicioSaludo.despedirse());
    }
}
