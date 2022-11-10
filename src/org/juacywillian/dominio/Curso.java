package org.juacywillian.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso() {
    }

    public Curso(String titulo, String descrição, int cargaHoraria) {
        setTitulo(titulo);
        setDescricao(descrição);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    double calcularXP() {
        return XP_PADRAO * this.cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return String.format("""
                Curso {
                    titulo = %s
                    descrição = %s
                    carga horaria = %d
                }\n""", getTitulo(), getDescricao(), cargaHoraria);
    }
}
