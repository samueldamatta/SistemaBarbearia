package br.com.SistemaDeBarbeariaJava.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.SistemaDeBarbeariaJava.model.Cliente;
import br.com.SistemaDeBarbeariaJava.repository.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    
    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }
}

