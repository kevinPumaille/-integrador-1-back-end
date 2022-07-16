package com.veterinariavetz.Model;

import javax.persistence.*;

@Entity
@Table(name = "tb_doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id_doctor;
    int dni_doctor;
    String nombre_doctor;
    String apellido_doctor;
    String especialidad_doctor;
    String direccion_doctor;
    int telefono_doctor;
    String usuario;
    String password;

    public Integer getId_doctor() {
        return id_doctor;
    }

    public void setId_doctor(Integer id_doctor) {
        this.id_doctor = id_doctor;
    }

    public int getDni_doctor() {
        return dni_doctor;
    }

    public void setDni_doctor(int dni_doctor) {
        this.dni_doctor = dni_doctor;
    }

    public String getNombre_doctor() {
        return nombre_doctor;
    }

    public void setNombre_doctor(String nombre_doctor) {
        this.nombre_doctor = nombre_doctor;
    }

    public String getApellido_doctor() {
        return apellido_doctor;
    }

    public void setApellido_doctor(String apellido_doctor) {
        this.apellido_doctor = apellido_doctor;
    }

    public String getEspecialidad_doctor() {
        return especialidad_doctor;
    }

    public void setEspecialidad_doctor(String especialidad_doctor) {
        this.especialidad_doctor = especialidad_doctor;
    }

    public String getDireccion_doctor() {
        return direccion_doctor;
    }

    public void setDireccion_doctor(String direccion_doctor) {
        this.direccion_doctor = direccion_doctor;
    }

    public int getTelefono_doctor() {
        return telefono_doctor;
    }

    public void setTelefono_doctor(int telefono_doctor) {
        this.telefono_doctor = telefono_doctor;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
