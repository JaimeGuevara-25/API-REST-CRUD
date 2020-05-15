package com.guevara.crud.eis.dto;

import com.guevara.crud.eis.bo.Empresa;

import java.io.Serializable;

public class EmpresaDTO extends ErrorDTO implements Serializable {
    private Integer id;
    private String nombre;
    private String nit;
    private String fecha;
    private String direccion;

    public EmpresaDTO() { super();
    }

    public EmpresaDTO(Integer code, String description) {
        super(code, description);
    }

    public EmpresaDTO(Empresa empresa) {
        this.id = empresa.getId();
        this.nombre = empresa.getNombre();
        this.nit = empresa.getNit();
        this.fecha = empresa.getFecha();
        this.direccion = empresa.getDireccion();
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (nit != null ? nit.hashCode() : 0);
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpresaDTO empresa = (EmpresaDTO) o;

        if (id != null ? !id.equals(empresa.id) : empresa.id != null) return false;
        if (nombre != null ? !nombre.equals(empresa.nombre) : empresa.nombre != null) return false;
        if (nit != null ? !nit.equals(empresa.nit) : empresa.nit != null) return false;
        if (fecha != null ? !fecha.equals(empresa.fecha) : empresa.fecha != null) return false;
        if (direccion != null ? !direccion.equals(empresa.direccion) : empresa.direccion != null) return false;
        return id != null ? id.equals(empresa.id) : empresa.id == null;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "idEmpresa=" + id +
                ", nombre=" + nombre +
                ", nit=" + nit +
                ", fecha=" + fecha +
                ", direccion=" + direccion +
                '}';
    }
}
