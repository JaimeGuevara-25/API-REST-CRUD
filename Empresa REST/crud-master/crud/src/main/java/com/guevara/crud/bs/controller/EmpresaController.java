package com.guevara.crud.bs.controller;

import com.guevara.crud.bs.service.EmpresaService;
import com.guevara.crud.eis.bo.Empresa;
import com.guevara.crud.eis.dto.EmpresaDTO;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping(value = "/empresa", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmpresaController {
    private final EmpresaService empresaService;
    @Autowired
    public EmpresaController(EmpresaService empresaService){
        Assert.notNull(empresaService,"empresaService no puede ser nulo");

        this.empresaService=empresaService;
    }


    @GetMapping(value = "/listEmpresa/")
    public ResponseEntity<Iterable<EmpresaDTO>> listAllByEmpresa(){
        Iterable<EmpresaDTO> response;
        try {
            response = empresaService.listAll();
        }catch (ServiceException e){
            throw new ResourceNotFoundException(e.getMessage());
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(value = "/listByEmpresa/{idEmpresa}")
    public ResponseEntity<Iterable<EmpresaDTO>> listByGrupo(@PathVariable("idEmpresa") Integer idEmpresa){
        Iterable<EmpresaDTO> response;
        try {
            response = empresaService.listAllByEmpresa(idEmpresa);
        }catch (ServiceException e){
            throw new ResourceNotFoundException(e.getMessage());
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(value = "/listByEmpresa/{idEmpresa}/{nombre}")
    public ResponseEntity<Iterable<EmpresaDTO>> listByEmpresa(@PathVariable("idEmpresa") Integer idEmpresa,@PathVariable("nombre") String nombre){
        Iterable<EmpresaDTO> response;
        try {
            response = empresaService.listAllByEmpresa(idEmpresa);
        }catch (ServiceException e){
            throw new ResourceNotFoundException(e.getMessage());
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<EmpresaDTO> create(@RequestBody Empresa empresa) throws ServiceException{
        EmpresaDTO response = empresaService.add(empresa);
        return new ResponseEntity<>(response,(response != null) ? HttpStatus.OK:HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PATCH)
    public ResponseEntity<EmpresaDTO> edit(@RequestBody Empresa empresa) throws  ServiceException{
        EmpresaDTO response = empresaService.edit(empresa);
        return new ResponseEntity<>(response,(response != null) ? HttpStatus.OK:HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @RequestMapping(value = "/delete/{idEmpresa}", method = RequestMethod.DELETE)
    public ResponseEntity<EmpresaDTO> delete(@PathVariable("idEmpresa") Integer idEmpresa) throws  ServiceException{
        EmpresaDTO response = empresaService.delete(idEmpresa);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
