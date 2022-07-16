package com.veterinariavetz.Controller;

import com.veterinariavetz.Exception.ModeloNotFoundException;
import com.veterinariavetz.Model.Cliente;
import com.veterinariavetz.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> Listar (){
        return clienteService.listar();
    }

    @GetMapping("/{id}")
    public Cliente ListarPorId(@PathVariable("id") Integer id){
        return clienteService.listarPorId(id);
    }

    @PostMapping
    public Cliente Registrar(@RequestBody Cliente c){
        return clienteService.registrar(c);
    }

    @PutMapping
    public Cliente Modificar(@RequestBody Cliente c){
        Cliente obj = clienteService.listarPorId(c.getId_cliente());

        if(obj == null){
            throw new ModeloNotFoundException("ID no encontrado " + c.getId_cliente());
        }

        return clienteService.modificar(c);
    }

    @DeleteMapping("/{id}")
    public void EliminarPorId(@PathVariable("id") Integer id){
        Cliente obj = clienteService.listarPorId(id);

        if(obj == null){
            throw new ModeloNotFoundException("ID no encontrado " + id);
        }

        clienteService.eliminar(id);
    }
}
