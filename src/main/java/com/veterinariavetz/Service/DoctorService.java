package com.veterinariavetz.Service;

import com.veterinariavetz.Model.Doctor;
import com.veterinariavetz.Model.Paciente;
import com.veterinariavetz.Repo.IDoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private IDoctorRepo doctorRepo;

    public Doctor registrar(Doctor p){
        return doctorRepo.save(p);
    }
    public Doctor modificar(Doctor p){
        return doctorRepo.save(p);
    }
    public List<Doctor> listar(){
        return doctorRepo.findAll();
    }
    public Doctor listarPorId(Integer id){
        return doctorRepo.findById(id).orElse(null);
    }
    public void eliminar(Integer id){
        doctorRepo.deleteById(id);
    }
}
