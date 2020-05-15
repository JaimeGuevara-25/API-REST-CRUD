package com.guevara.crud.bs.repository;

import com.guevara.crud.eis.bo.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface EmpresaRepository extends JpaRepository<Empresa,Integer>, JpaSpecificationExecutor<Integer> {
    List<Empresa> findAllByIdEmpresa(Integer id);

}
