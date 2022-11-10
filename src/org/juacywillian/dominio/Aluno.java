package org.juacywillian.dominio;

import java.util.*;

public class Aluno {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Aluno() {
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getAlunos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.out.println("Vocẽ não está matriculado em nenhum conteudo.");
        }
    }

    public double calcularTotalXP() {
        // Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        // double soma = 0;
        // while (iterator.hasNext()) {
        // double next = iterator.next().calcularXP();
        // soma += next;
        // }
        // return soma;

        return this.conteudosConcluidos.stream()
                .mapToDouble(c -> c.calcularXP())
                .sum();
    }

    public String getName() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public String getConteudosInscritosString() {
        return conteudosInscritos.stream()
                .map(c -> c.getTitle())
                .toList()
                .toString()
                .replaceAll(", ", "\n\t")
                .replaceAll("\\[", "\n\t")
                .replaceAll("\\]", " ");
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public String getConteudosConcluidosString() {
        return conteudosConcluidos.stream()
                .map(c -> c.getTitle())
                .toList()
                .toString()
                .replaceAll(", ", "\n\t")
                .replaceAll("\\[", "\n\t")
                .replaceAll("\\]", " ");
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
        result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudosInscritos == null) {
            if (other.conteudosInscritos != null)
                return false;
        } else if (!conteudosInscritos.equals(other.conteudosInscritos))
            return false;
        if (conteudosConcluidos == null) {
            if (other.conteudosConcluidos != null)
                return false;
        } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
            return false;
        return true;
    }

}
