package br.com.SistemaDeBarbeariaJava.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.SistemaDeBarbeariaJava.model.Servico;
import br.com.SistemaDeBarbeariaJava.model.TipoServico;
import br.com.SistemaDeBarbeariaJava.repository.ServicoRepository;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    public Servico adicionarServico(Servico servico) {
        return servicoRepository.save(servico);
    }

    public List<Servico> listarServicos() {
        return servicoRepository.findAll();
    }

    public void inicializarServicosPadrao() {
        if (servicoRepository.count() == 0) {
            servicoRepository.save(new Servico(null, TipoServico.CORTE, 30.00));
            servicoRepository.save(new Servico(null, TipoServico.BARBA, 20.00));
            servicoRepository.save(new Servico(null, TipoServico.CORTE_E_BARBA, 45.00));
        }
    }
}

