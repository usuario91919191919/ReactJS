package com.udigitalproject.udigital.models;

import javax.persistence.*;

@Entity
@Table(name = "inventario")
public class Inventario 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long serial;

    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long modelo;
    private String descripcion;
    private String foto;
    private String color;
    private String fechaCompra;
    private Integer precio;

    @OneToOne
    @JoinColumn(name="usuario", referencedColumnName="id")
    private Usuario usuario;

    @OneToOne
    @JoinColumn(name="marca", referencedColumnName="id")
    private Marca marca;

    @OneToOne
    @JoinColumn(name="estado", referencedColumnName="id")
    private Estado estado;


    @OneToOne
    @JoinColumn(name="tipo", referencedColumnName="id")
    private Tipo tipo;


    public Long getSerial() {
        return serial;
    }


    public void setSerial(Long serial) {
        this.serial = serial;
    }


    public Long getModelo() {
        return modelo;
    }


    public void setModelo(Long modelo) {
        this.modelo = modelo;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getFoto() {
        return foto;
    }


    public void setFoto(String foto) {
        this.foto = foto;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getFechaCompra() {
        return fechaCompra;
    }


    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }


    public Integer getPrecio() {
        return precio;
    }


    public void setPrecio(Integer precio) {
        this.precio = precio;
    }


    public Usuario getUsuario() {
        return usuario;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public Marca getMarca() {
        return marca;
    }


    public void setMarca(Marca marca) {
        this.marca = marca;
    }


    public Estado getEstado() {
        return estado;
    }


    public void setEstado(Estado estado) {
        this.estado = estado;
    }


    public Tipo getTipo() {
        return tipo;
    }


    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }


}
