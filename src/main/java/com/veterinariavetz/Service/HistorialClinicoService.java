package com.veterinariavetz.Service;

import com.veterinariavetz.Model.HistorialClinico;
import com.veterinariavetz.Repo.IHistorialClinicoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistorialClinicoService {
    @Autowired
    private IHistorialClinicoRepo historialClinicoRepo;

    public HistorialClinico registrar(HistorialClinico p){
        return historialClinicoRepo.save(p);
    }
    public HistorialClinico modificar(HistorialClinico p){
        return historialClinicoRepo.save(p);
    }
    public List<HistorialClinico> listar(){
        return historialClinicoRepo.findAll();
    }
    public HistorialClinico listarPorId(Integer id){
        return historialClinicoRepo.findById(id).orElse(null);
    }
    public void eliminar(Integer id){
        historialClinicoRepo.deleteById(id);
    }
}
