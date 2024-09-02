package br.com.SistemaDeBarbeariaJava.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.SistemaDeBarbeariaJava.model.Barbeiro;
import br.com.SistemaDeBarbeariaJava.repository.BarbeiroRepository;

@Service
public class BarbeiroService {
    @Autowired
    private BarbeiroRepository clienteRepository;
    
    public Barbeiro salvarBarbeiro(Barbeiro barbeiro) {
        return clienteRepository.save(barbeiro);
    }
    
    public List<Barbeiro> listarBarbeiros() {
        return clienteRepository.findAll();
    }
}
