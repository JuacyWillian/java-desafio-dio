package org.juacywillian.dominio;

public abstract class Conteudo {

    public static final double XP_PADRAO = 10d;
    private String title;
    private String description;

    abstract double calcularXP();

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
