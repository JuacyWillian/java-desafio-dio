package org.juacywillian.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria() {
    }

    public Mentoria(String titulo, String descição, LocalDate data) {
        setTitulo(titulo);
        setDescricao(descição);
        this.data = data;
    }

    @Override
    double calcularXP() {
        return XP_PADRAO * 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("""
                Mentoria {
                    titulo = %s,
                    descrição = %s,
                    data = %s
                }\n""", getTitle(), getDescription(), data.toString());
    }
}
