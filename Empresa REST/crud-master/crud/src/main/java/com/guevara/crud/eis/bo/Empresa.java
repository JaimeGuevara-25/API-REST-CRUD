package com.guevara.crud.eis.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name= "EMPRESA")
public class Empresa implements Serializable {
    private static final long serialVersionUID = -3635184530680623280L;

    @Id
    @Column(name = "idEmpresa")
    private Integer id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="nit")
    private String nit;

    @Column(name="fecha")
    private String fecha;

    @Column(name="direccion")
    private String direccion;

    public Empresa() {
        super();
    }

    public Empresa(Integer id, String nombre, String nit, String fecha, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
        this.fecha = fecha;
        this.direccion = direccion;
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

        Empresa empresa = (Empresa) o;

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
