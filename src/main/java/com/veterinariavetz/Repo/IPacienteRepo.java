package com.veterinariavetz.Repo;

import com.veterinariavetz.Model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPacienteRepo extends JpaRepository<Paciente,Integer> {
}
