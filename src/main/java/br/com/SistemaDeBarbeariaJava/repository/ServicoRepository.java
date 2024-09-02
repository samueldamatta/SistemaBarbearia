package br.com.SistemaDeBarbeariaJava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.SistemaDeBarbeariaJava.model.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {}
