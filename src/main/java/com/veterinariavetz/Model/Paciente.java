package com.veterinariavetz.Model;

import javax.persistence.*;

@Entity
@Table(name = "tb_paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_paciente;
    String nombre_paciente;
    String raza_pacinte;
    String especie_paciente;
    String color_paciente;

    @ManyToOne
    @JoinColumn(name = "fk_cliente")
    Cliente cliente;

    public Integer getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Integer id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public String getRaza_pacinte() {
        return raza_pacinte;
    }

    public void setRaza_pacinte(String raza_pacinte) {
        this.raza_pacinte = raza_pacinte;
    }

    public String getEspecie_paciente() {
        return especie_paciente;
    }

    public void setEspecie_paciente(String especie_paciente) {
        this.especie_paciente = especie_paciente;
    }

    public String getColor_paciente() {
        return color_paciente;
    }

    public void setColor_paciente(String color_paciente) {
        this.color_paciente = color_paciente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
