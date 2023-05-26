package com.example.challengeoneforoalura.dto;



import jakarta.validation.constraints.NotEmpty;
import java.util.Date;

public class TopicoDto {

    public TopicoDto() {
    }

    public TopicoDto(long id, String titulo, String mensaje, Date fecha_creacion, String estatus, String autor, String curso) {
        this.id = id;
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.fecha_creacion = fecha_creacion;
        this.estatus = estatus;
        this.autor = autor;
        this.curso = curso;
    }

    private long id;

    @NotEmpty(message = "no puede estar vacio")
    private String titulo;

    @NotEmpty(message = "no puede estar vacio")
    private String mensaje;


    @NotEmpty
    private String estatus;

    @NotEmpty(message = "no puede estar vacio")
    private String autor;

    @NotEmpty(message = "no puede estar vacio")
    private String curso;
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

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
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
}
