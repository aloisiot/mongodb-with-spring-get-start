package dev.aloisiot.mongodbgetstart.controller;

import dev.aloisiot.mongodbgetstart.model.Pacote;
import dev.aloisiot.mongodbgetstart.service.PacoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacote")
public class PacoteController {

    private PacoteService service;

    @Autowired
    public PacoteController(PacoteService service) {
        this.service = service;
    }

    @PostMapping
    public Pacote registrar (@RequestBody Pacote pacote) {
        return service.adicionar(pacote);
    }

    @GetMapping
    public List<Pacote> buscarTodos(){
        return service.listarTodos();
    }

    @GetMapping("a_caminho")
    public List<Pacote> buscarTodosACaminho(){
        return service.listarTodosACaminho();
    }
}
