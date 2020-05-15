package com.guevara.crud.eis.dto;

import java.io.Serializable;

/**
 * @author Henry Hernandez
 * @version 1.0.0
 * @since 1.0.0
 * created on 25/05/18
 */

public class ErrorDTO implements Serializable{

    private Integer code;
    private String description;

    public ErrorDTO() {

    }

    public ErrorDTO(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ErrorDTO errorDTO = (ErrorDTO) o;

        if (!code.equals(errorDTO.code)) return false;
        return description.equals(errorDTO.description);
    }

    @Override
    public int hashCode() {
        int result = code.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ErrorDTO{" +
                "code=" + code +
                ", description='" + description + '\'' +
                '}';
    }
}
