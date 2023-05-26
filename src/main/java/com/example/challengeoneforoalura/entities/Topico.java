package com.example.challengeoneforoalura.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "topicos", uniqueConstraints = @UniqueConstraint(columnNames = {"titulo", "mensaje"}))
public class Topico {

    public Topico() {
    }

    public Topico(String titulo, String mensaje, String estatus, String autor, String curso) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.estatus = estatus;
        this.autor = autor;
        this.curso = curso;
    }

    public Topico(long id, String titulo, String mensaje, String estatus, String autor, String curso, Date fecha_creacion) {
        this.id = id;
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.estatus = estatus;
        this.autor = autor;
        this.curso = curso;
        this.fecha_creacion = fecha_creacion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;

    private String mensaje;

    private String estatus;

    private String autor;

    private String curso;

    @CreationTimestamp
    private Date fecha_creacion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
}
