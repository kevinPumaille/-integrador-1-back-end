package com.veterinariavetz.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_historial_clinico")
public class HistorialClinico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_historial_clinico;

    @ManyToOne
    @JoinColumn(name = "fk_paciente")
    Paciente paciente;

    public Integer getId_historial_clinico() {
        return id_historial_clinico;
    }

    public void setId_historial_clinico(Integer id_historial_clinico) {
        this.id_historial_clinico = id_historial_clinico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
