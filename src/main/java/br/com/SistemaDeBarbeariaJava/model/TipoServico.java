package br.com.SistemaDeBarbeariaJava.model;

public enum TipoServico {
    CORTE("Corte de cabelo"),
    BARBA("Barba"),
    CORTE_E_BARBA("Corte e Barba");

    private String descricao;

    TipoServico(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
