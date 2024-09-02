package br.com.SistemaDeBarbeariaJava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.SistemaDeBarbeariaJava.model.Barbeiro;

public interface BarbeiroRepository extends JpaRepository<Barbeiro, Long> {}

