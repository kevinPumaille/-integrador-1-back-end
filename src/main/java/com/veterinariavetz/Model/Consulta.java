package com.veterinariavetz.Model;

import javax.persistence.*;

@Entity
@Table(name = "tb_consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_consulta;
    String estado_consulta;
    String antecedente_consulta;
    String examen_consulta;
    String diagnostico_consulta;
    int edad;
    int peso;
    @ManyToOne
    @JoinColumn(name = "fk_doctor")
    Doctor doctor;
    @ManyToOne
    @JoinColumn(name = "fk_historial_clinico")
    HistorialClinico historialClinico;

    public Integer getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(Integer id_consulta) {
        this.id_consulta = id_consulta;
    }

    public String getEstado_consulta() {
        return estado_consulta;
    }

    public void setEstado_consulta(String estado_consulta) {
        this.estado_consulta = estado_consulta;
    }

    public String getAntecedente_consulta() {
        return antecedente_consulta;
    }

    public void setAntecedente_consulta(String antecedente_consulta) {
        this.antecedente_consulta = antecedente_consulta;
    }

    public String getExamen_consulta() {
        return examen_consulta;
    }

    public void setExamen_consulta(String examen_consulta) {
        this.examen_consulta = examen_consulta;
    }

    public String getDiagnostico_consulta() {
        return diagnostico_consulta;
    }

    public void setDiagnostico_consulta(String diagnostico_consulta) {
        this.diagnostico_consulta = diagnostico_consulta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public HistorialClinico getHistorialClinico() {
        return historialClinico;
    }

    public void setHistorialClinico(HistorialClinico historialClinico) {
        this.historialClinico = historialClinico;
    }
}
