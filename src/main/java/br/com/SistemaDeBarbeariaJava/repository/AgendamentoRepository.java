package br.com.SistemaDeBarbeariaJava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.SistemaDeBarbeariaJava.model.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {}
