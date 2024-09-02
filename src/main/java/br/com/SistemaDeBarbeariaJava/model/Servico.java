package br.com.SistemaDeBarbeariaJava.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Servico {
    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    private TipoServico tipoServico;

    private Double preco;

    public Servico() {}

    public Servico(Long id, TipoServico tipoServico, Double preco) {
        this.id = id;
        this.tipoServico = tipoServico;
        this.preco = preco;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

