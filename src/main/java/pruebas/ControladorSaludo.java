package pruebas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")

public class ControladorSaludo {

    private final ServicioSaludo servicioSaludo;

    public ControladorSaludo(ServicioSaludo servicioSaludo) {
        this.servicioSaludo = servicioSaludo;
    }

    @GetMapping("saludar")
    public String saludar(@RequestParam(required = false) String nombre) {
        return (nombre != null) ? servicioSaludo.saludar(nombre) : servicioSaludo.saludar();
    }

    @GetMapping("despedirse")
    public String despedirse() {
        return servicioSaludo.despedirse();
    }
}
