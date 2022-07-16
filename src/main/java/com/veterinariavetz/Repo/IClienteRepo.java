package com.veterinariavetz.Repo;

import com.veterinariavetz.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepo extends JpaRepository<Cliente,Integer> {
}
