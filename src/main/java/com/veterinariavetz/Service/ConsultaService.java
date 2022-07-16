package com.veterinariavetz.Service;


import com.veterinariavetz.Model.Consulta;
import com.veterinariavetz.Repo.IConsultaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {
    @Autowired
    private IConsultaRepo consultaRepo;

    public Consulta registrar(Consulta p){
        return consultaRepo.save(p);
    }
    public Consulta modificar(Consulta p){
        return consultaRepo.save(p);
    }
    public List<Consulta> listar(){
        return consultaRepo.findAll();
    }
    public Consulta listarPorId(Integer id){
        return consultaRepo.findById(id).orElse(null);
    }
    public void eliminar(Integer id){
        consultaRepo.deleteById(id);
    }
}
