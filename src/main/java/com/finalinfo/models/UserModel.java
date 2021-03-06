package com.finalinfo.models;

import java.sql.Date;
import javax.persistence.*;


@Entity
@Table(name= "Usuario")
public class UserModel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique= true, nullable=false)
    private Long id;

    private String nombre;
    private String apellido;

    @Column(unique=true)
    private String email;
    private String password;

    @Column(name="Fecha")
    private Date fechaCreacion;
    private String ciudad;
    private String provincia;
    private String pais;

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion){
        this.fechaCreacion=fechaCreacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad){
        this.ciudad=ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia){
        this.provincia=provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais){
        this.pais=pais;
    }

}