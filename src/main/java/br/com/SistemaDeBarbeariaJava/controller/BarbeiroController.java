package br.com.SistemaDeBarbeariaJava.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.SistemaDeBarbeariaJava.model.Barbeiro;
import br.com.SistemaDeBarbeariaJava.service.BarbeiroService;

@RestController
@RequestMapping("/barbeiros")
public class BarbeiroController {
    
    @Autowired
    private BarbeiroService barbeiroService;

    @PostMapping
    public Barbeiro criarBarbeiro(@RequestBody Barbeiro barbeiro) {
        return barbeiroService.salvarBarbeiro(barbeiro);
    }

    @GetMapping
    public List<Barbeiro> listarBarbeiros() {
        return barbeiroService.listarBarbeiros();
    }
}