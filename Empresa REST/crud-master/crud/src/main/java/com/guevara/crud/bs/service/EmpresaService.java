package com.guevara.crud.bs.service;


import com.guevara.crud.eis.bo.Empresa;
import com.guevara.crud.eis.dto.EmpresaDTO;

public interface EmpresaService {
    Iterable<EmpresaDTO> listAll();

    Iterable<EmpresaDTO> listAllByEmpresa();
    Iterable<EmpresaDTO> listAllByEmpresa(Integer idEmpresa);

    EmpresaDTO add(Empresa empresa);

    EmpresaDTO edit(Empresa empresa);

    EmpresaDTO delete(Integer idEmpresa);
}

