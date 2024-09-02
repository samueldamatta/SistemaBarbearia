package br.com.SistemaDeBarbeariaJava.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.SistemaDeBarbeariaJava.model.Agendamento;
import br.com.SistemaDeBarbeariaJava.repository.AgendamentoRepository;

@Service
public class AgendamentoService {
    @Autowired
    private AgendamentoRepository agendamentoRepository;
    
    public Agendamento agendar(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }
    
    public List<Agendamento> listarAgendamentos() {
        return agendamentoRepository.findAll();
    }
    
    // Outros métodos como buscar por cliente, barbeiro, etc.
}

