package com.veterinariavetz.Controller;

import com.veterinariavetz.Exception.ModeloNotFoundException;
import com.veterinariavetz.Model.Paciente;
import com.veterinariavetz.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public List<Paciente> Listar (){
        return pacienteService.listar();
    }

    @GetMapping("/{id}")
    public Paciente ListarPorId(@PathVariable("id") Integer id){
        return pacienteService.listarPorId(id);
    }

    @PostMapping
    public Paciente Registrar(@RequestBody Paciente c){
        return pacienteService.registrar(c);
    }

    @PutMapping
    public Paciente Modificar(@RequestBody Paciente c){
        Paciente obj = pacienteService.listarPorId(c.getId_paciente());

        if(obj == null){
            throw new ModeloNotFoundException("ID no encontrado " + c.getId_paciente());
        }

        return pacienteService.modificar(c);
    }

    @DeleteMapping("/{id}")
    public void EliminarPorId(@PathVariable("id") Integer id){
        Paciente obj = pacienteService.listarPorId(id);

        if(obj == null){
            throw new ModeloNotFoundException("ID no encontrado " + id);
        }

        pacienteService.eliminar(id);
    }
}
