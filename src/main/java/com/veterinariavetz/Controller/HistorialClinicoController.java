package com.veterinariavetz.Controller;

import com.veterinariavetz.Exception.ModeloNotFoundException;
import com.veterinariavetz.Model.HistorialClinico;
import com.veterinariavetz.Service.HistorialClinicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historial")
public class HistorialClinicoController {

    @Autowired
    private HistorialClinicoService historialClinicoService;

    @GetMapping
    public List<HistorialClinico> Listar (){
        return historialClinicoService.listar();
    }

    @GetMapping("/{id}")
    public HistorialClinico ListarPorId(@PathVariable("id") Integer id){
        return historialClinicoService.listarPorId(id);
    }

    @PostMapping
    public HistorialClinico Registrar(@RequestBody HistorialClinico c){
        return historialClinicoService.registrar(c);
    }

    @PutMapping
    public HistorialClinico Modificar(@RequestBody HistorialClinico c){
        HistorialClinico obj = historialClinicoService.listarPorId(c.getId_historial_clinico());

        if(obj == null){
            throw new ModeloNotFoundException("ID no encontrado " + c.getId_historial_clinico());
        }

        return historialClinicoService.modificar(c);
    }

    @DeleteMapping("/{id}")
    public void EliminarPorId(@PathVariable("id") Integer id){
        HistorialClinico obj = historialClinicoService.listarPorId(id);

        if(obj == null){
            throw new ModeloNotFoundException("ID no encontrado " + id);
        }

        historialClinicoService.eliminar(id);
    }
}
