package com.veterinariavetz.Repo;

import com.veterinariavetz.Model.HistorialClinico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHistorialClinicoRepo extends JpaRepository<HistorialClinico,Integer> {
}
