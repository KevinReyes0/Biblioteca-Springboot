package com.kevinreyes.webapp.blibioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevinreyes.webapp.blibioteca.model.Cliente;
import com.kevinreyes.webapp.blibioteca.model.Empleado;
import com.kevinreyes.webapp.blibioteca.repository.ClienteRepository;
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
    public Cliente buscarClientes(Long dpi){
        return clienteRepository.findById(dpi).orElse(null);
    }

    @Override
    public Cliente guardarClientes(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @Override 
    public void eliminarClientes(Cliente cliente){
        clienteRepository.delete(cliente);
    }
}
