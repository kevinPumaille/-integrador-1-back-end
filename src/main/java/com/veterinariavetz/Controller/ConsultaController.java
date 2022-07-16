package com.veterinariavetz.Controller;

import com.veterinariavetz.Exception.ModeloNotFoundException;
import com.veterinariavetz.Model.Consulta;
import com.veterinariavetz.Service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @GetMapping
    public List<Consulta> Listar (){
        return consultaService.listar();
    }

    @GetMapping("/{id}")
    public Consulta ListarPorId(@PathVariable("id") Integer id){
        return consultaService.listarPorId(id);
    }

    @PostMapping
    public Consulta Registrar(@RequestBody Consulta c){
        return consultaService.registrar(c);
    }

    @PutMapping
    public Consulta Modificar(@RequestBody Consulta c){
        Consulta obj = consultaService.listarPorId(c.getId_consulta());

        if(obj == null){
            throw new ModeloNotFoundException("ID no encontrado " + c.getId_consulta());
        }

        return consultaService.modificar(c);
    }

    @DeleteMapping("/{id}")
    public void EliminarPorId(@PathVariable("id") Integer id){
        Consulta obj = consultaService.listarPorId(id);

        if(obj == null){
            throw new ModeloNotFoundException("ID no encontrado " + id);
        }

        consultaService.eliminar(id);
    }
}
