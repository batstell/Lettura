package org.example.lettura.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "livros")
public class Livro {

    @Id
    private String id;

    private String titulo;
    private String autor;
    private String about;
    private int ano;
    private double avaliacao;

    public Livro(String id, String titulo, String autor, String about, int ano, double avaliacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.about = about;
        this.ano = ano;
        this.avaliacao = avaliacao;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
}

