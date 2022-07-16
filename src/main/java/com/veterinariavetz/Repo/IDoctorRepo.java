package com.veterinariavetz.Repo;

import com.veterinariavetz.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDoctorRepo extends JpaRepository<Doctor,Integer> {
}
