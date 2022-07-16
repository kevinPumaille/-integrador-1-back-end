package com.veterinariavetz.Controller;

import com.veterinariavetz.Exception.ModeloNotFoundException;
import com.veterinariavetz.Model.Doctor;
import com.veterinariavetz.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctores")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> Listar (){
        return doctorService.listar();
    }

    @GetMapping("/{id}")
    public Doctor ListarPorId(@PathVariable("id") Integer id){
        return doctorService.listarPorId(id);
    }

    @PostMapping
    public Doctor Registrar(@RequestBody Doctor c){
        return doctorService.registrar(c);
    }

    @PutMapping
    public Doctor Modificar(@RequestBody Doctor c){
        Doctor obj = doctorService.listarPorId(c.getId_doctor());

        if(obj == null){
            throw new ModeloNotFoundException("ID no encontrado " + c.getId_doctor());
        }

        return doctorService.modificar(c);
    }

    @DeleteMapping("/{id}")
    public void EliminarPorId(@PathVariable("id") Integer id){
        Doctor obj = doctorService.listarPorId(id);

        if(obj == null){
            throw new ModeloNotFoundException("ID no encontrado " + id);
        }

        doctorService.eliminar(id);
    }
}
