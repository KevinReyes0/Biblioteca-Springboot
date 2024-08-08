package com.kevinreyes.webapp.blibioteca.service;

import java.util.List;

import com.kevinreyes.webapp.blibioteca.model.Empleado;

public interface IEmpleadoService {

    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleados(Long id);

    public Empleado guardarEmpleados(Empleado empleado);

    public void eliminarEmpleados(Empleado empleado);
}
