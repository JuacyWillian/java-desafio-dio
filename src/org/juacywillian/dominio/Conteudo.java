package org.juacywillian.dominio;

public abstract class Conteudo {

    public static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    abstract double calcularXP();

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitle() {
        return titulo;
    }

    public void setTitle(String title) {
        this.titulo = title;
    }

    public String getDescription() {
        return descricao;
    }

    public void setDescription(String description) {
        this.descricao = description;
    }

}
