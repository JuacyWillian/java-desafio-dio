package org.juacywillian.dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate finalDate = initialDate.plusDays(45);
    private Set<Aluno> alunos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp() {
    }

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public Bootcamp(String nome, String descricao, Set<Aluno> alunos, Set<Conteudo> conteudos) {
        this.nome = nome;
        this.descricao = descricao;
        this.alunos = alunos;
        this.conteudos = conteudos;
    }

    public void addConteudo(Conteudo c) {
        this.conteudos.add(c);
    }

    public void removeConteudo(Conteudo c) {
        this.conteudos.remove(c);
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public String getDescription() {
        return descricao;
    }

    public void setDescription(String description) {
        this.descricao = description;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((initialDate == null) ? 0 : initialDate.hashCode());
        result = prime * result + ((finalDate == null) ? 0 : finalDate.hashCode());
        result = prime * result + ((alunos == null) ? 0 : alunos.hashCode());
        result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
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
        Bootcamp other = (Bootcamp) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (initialDate == null) {
            if (other.initialDate != null)
                return false;
        } else if (!initialDate.equals(other.initialDate))
            return false;
        if (finalDate == null) {
            if (other.finalDate != null)
                return false;
        } else if (!finalDate.equals(other.finalDate))
            return false;
        if (alunos == null) {
            if (other.alunos != null)
                return false;
        } else if (!alunos.equals(other.alunos))
            return false;
        if (conteudos == null) {
            if (other.conteudos != null)
                return false;
        } else if (!conteudos.equals(other.conteudos))
            return false;
        return true;
    }

}
