package com.veterinariavetz.Service;


import com.veterinariavetz.Model.Paciente;
import com.veterinariavetz.Repo.IPacienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacienteService {
    @Autowired
    private IPacienteRepo pacienteRepo;

    public Paciente registrar(Paciente p){
        return pacienteRepo.save(p);
    }
    public Paciente modificar(Paciente p){
        return pacienteRepo.save(p);
    }
    public List<Paciente> listar(){
        return pacienteRepo.findAll();
    }
    public Paciente listarPorId(Integer id){
        return pacienteRepo.findById(id).orElse(null);
    }
    public void eliminar(Integer id){
        pacienteRepo.deleteById(id);
    }
}
