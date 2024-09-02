package br.com.SistemaDeBarbeariaJava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.SistemaDeBarbeariaJava.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}

