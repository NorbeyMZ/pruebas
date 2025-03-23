package pruebas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class PruebasControladorSaludo {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void pruebaSaludarPorDefecto() throws Exception {
        mockMvc.perform(get("/saludar"))
               .andExpect(status().isOk())
               .andExpect(content().string("¡Hola, como estan!"));
    }

    @Test
    void pruebaSaludarConNombre() throws Exception {
        mockMvc.perform(get("/saludar").param("nombre", "Norbey"))
               .andExpect(status().isOk())
               .andExpect(content().string("¡Hola, Norbey!"));
    }

    @Test
    void pruebaDespedirse() throws Exception {
        mockMvc.perform(get("/despedirse"))
               .andExpect(status().isOk())
               .andExpect(content().string("¡Adiós!"));
    }
}
