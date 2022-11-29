package Grupo3.FINGESO.entities;

import javax.persistence.*;

@MappedSuperclass
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String mail;
    private String rut;
    private String departamento;
    private String facultad;
    private String pass;

    public User(Long id, String name, String mail, String rut, String departamento, String facultad, String pass) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.rut = rut;
        this.departamento = departamento;
        this.facultad = facultad;
        this.pass = pass;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}