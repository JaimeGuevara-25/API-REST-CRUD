package com.guevara.crud.bs.service.impl;

import com.guevara.crud.bs.repository.*;
import com.guevara.crud.bs.service.EmpresaService;
import com.guevara.crud.eis.bo.*;
import com.guevara.crud.eis.dto.EmpresaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;


import java.util.ArrayList;
import java.util.List;

public class EmpresaServiceImpl implements EmpresaService {
    private final EmpresaRepository empresaRepository;

    @Autowired
    public EncuentroServiceImpl(EmpresaRepository empresaRepository) {
        Assert.notNull(empresaRepository,"Empresa Repository no puede ser nulo.");
        this.empresaRepository = empresaRepository;
    }

    /*List*/
    @Override
    public Iterable<EmpresaDTO> listAllByEmpresa(Integer id, String nombre){
        Iterable<EmpresaDTO> responseDto;
        List<EmpresaDTO> response = new ArrayList<>();
        empresaRepository.findAllByIdEmpresa(id).forEach(cycle->{
            Empresa empre = empresaRepository.findOne(cycle.getId());

            response.add(new EmpresaDTO(empre));



        });
        responseDto = response;
        return responseDto;
    }

    @Override
    public Iterable<EmpresaDTO> listAllByEmpresa(Integer idEmpresa){
        Iterable<EmpresaDTO> responseDto;
        List<EmpresaDTO> response = new ArrayList<>();
        empresaRepository.findAllByIdEmpresa(idEmpresa).forEach(cycle->{
            Empresa empresa = empresaRepository.findOne(cycle.getId());
            response.add(new EmpresaDTO(empresa));
        });
        responseDto = response;
        return responseDto;
    }

    /*Save*/
    @Override
    public EmpresaDTO add(Empresa empresa){
        if(empresa==null){
            return new EmpresaDTO(1,"Datos no pueden ser nulos");
        }
        Empresa create = empresaRepository.findOne(empresa.getId());
        if(create==null){
            return new EmpresaDTO(2, "Encuentro ya existe");
        }else{

        }
        return new EmpresaDTO(create);
    }

    /*Edit*/
    @Override
    public EmpresaDTO edit(Empresa empresa){
        Empresa update = empresaRepository.findOne(empresa.getId());
        if (update == null){
            return new EmpresaDTO(3,"Empresa no encontrada");
        }else{
            update.setId(empresa.getId());
            update.setNombre(empresa.getNombre());
            update.setNit(empresa.getNit());
            update.setFecha(empresa.getFecha());
            update.setDireccion(empresa.getDireccion());

            empresaRepository.saveAndFlush(update);
        }
        return new EmpresaDTO(update);
    }

    /*Borrar*/
    @Override
    public EmpresaDTO delete(Integer id){
        Empresa delete = empresaRepository.findOne(id);
        if(delete==null){
            return new EmpresaDTO(3,"No se encontro el registro");
        }
        empresaRepository.delete(id);

        return new EmpresaDTO(delete);
    }
}
