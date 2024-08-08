package com.kevinreyes.webapp.blibioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevinreyes.webapp.blibioteca.model.Empleado;
import com.kevinreyes.webapp.blibioteca.repository.EmpleadoRepository;

@Service
public class EmpleadoService implements IEmpleadoService{

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> listarEmpleados(){
        return empleadoRepository.findAll();
    }

    @Override 
    public Empleado buscarEmpleados(Long id){
        return empleadoRepository.findById(id).orElse(null);
    }

    @Override
    public Empleado guardarEmpleados(Empleado empleado){
        return empleadoRepository.save(empleado);
    }

    @Override 
    public void eliminarEmpleados(Empleado empleado){
        empleadoRepository.delete(empleado);
    }
}
