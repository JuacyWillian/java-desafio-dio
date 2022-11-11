import java.time.LocalDate;

import org.juacywillian.dominio.Aluno;
import org.juacywillian.dominio.Bootcamp;
import org.juacywillian.dominio.Curso;
import org.juacywillian.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso javaBasico = new Curso(
                "Curso Java Básico",
                "Curso basico da linguagem Java",
                100);
        Curso javaIntermediario = new Curso(
                "Curso Java Intermediario",
                "Curso avancado de Java",
                200);
        Curso javaAvancado = new Curso(
                "Curso Java Avançado",
                "Curso avancado de Java",
                140);

        Mentoria mentoriaJava = new Mentoria(
                "Mentoria Java",
                "Mentoria de Java ",
                LocalDate.of(2022, 12, 1));

        // System.out.println(javaBasico);
        // System.out.println(javaAvancado);
        // System.out.println(mentoriaJava);

        Bootcamp formacaoDevJava = new Bootcamp(
                "Formação Dev Java",
                "Bootcamp Java de iniciante ao PRO");
        formacaoDevJava.addConteudo(javaBasico);
        formacaoDevJava.addConteudo(javaIntermediario);
        formacaoDevJava.addConteudo(javaAvancado);
        formacaoDevJava.addConteudo(mentoriaJava);

        Aluno camila = new Aluno("Camila");
        camila.inscreverBootcamp(formacaoDevJava);
        System.out.println("Conteudos inscritos de Camila: " +
                camila.getConteudosInscritosString() + "\n");
        camila.progredir();
        camila.progredir();
        System.out.println("");
        System.out.println("Conteudos inscritos de Camila: " +
                camila.getConteudosInscritosString() + "\n");
        System.out.println("Conteudos concluidos de Camila: " +
                camila.getConteudosConcluidosString() + "\n");
        System.out.println("XP: " + camila.calcularTotalXP() + "\n");

        System.out.println("\n\n +++ \n\n");

        Aluno joao = new Aluno("Joao");
        joao.inscreverBootcamp(formacaoDevJava);
        System.out.println("Conteudos inscritos de João: " +
                joao.getConteudosInscritosString() + "\n");
        joao.progredir();
        joao.progredir();
        System.out.println("");
        System.out.println("Conteudos inscritos de João: " +
                joao.getConteudosInscritosString() + "\n");
        System.out.println("Conteudos concluidos de João: " +
                joao.getConteudosConcluidosString() + "\n");
        System.out.println("XP: " + joao.calcularTotalXP() + "\n");

    }
}
