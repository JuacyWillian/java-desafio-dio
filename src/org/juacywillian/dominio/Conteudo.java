package org.juacywillian.dominio;

public abstract class Conteudo {

    public static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    abstract double calcularXP();

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
