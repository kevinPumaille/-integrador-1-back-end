package com.veterinariavetz.Repo;

import com.veterinariavetz.Model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IConsultaRepo extends JpaRepository<Consulta,Integer> {
}
