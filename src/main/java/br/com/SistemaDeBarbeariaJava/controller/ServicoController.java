package br.com.SistemaDeBarbeariaJava.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.SistemaDeBarbeariaJava.model.Servico;
import br.com.SistemaDeBarbeariaJava.service.ServicoService;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @GetMapping
    public List<Servico> listarServicos() {
        return servicoService.listarServicos();
    }

    @PostMapping
    public Servico adicionarServico(@RequestBody Servico servico) {
        return servicoService.adicionarServico(servico);
    }
}