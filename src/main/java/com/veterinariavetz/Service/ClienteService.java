package com.veterinariavetz.Service;

import com.veterinariavetz.Model.Cliente;
import com.veterinariavetz.Repo.IClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteService {

    @Autowired
    private IClienteRepo clienteRepo;

    public Cliente registrar(Cliente p){
        return clienteRepo.save(p);
    }
    public Cliente modificar(Cliente p){
        return clienteRepo.save(p);
    }
    public List<Cliente> listar(){
        return clienteRepo.findAll();
    }
    public Cliente listarPorId(Integer id){
        return clienteRepo.findById(id).orElse(null);
    }
    public void eliminar(Integer id){
        clienteRepo.deleteById(id);
    }
}
