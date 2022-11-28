package Grupo3.FINGESO.entities;

import Grupo3.FINGESO.services.UserService;

import javax.persistence.*;

@Entity
@Table(name = "user_entity")
@DiscriminatorValue("UserEntity")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @SequenceGenerator(name = "user_entity_seq")
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String mail;
    private String RUT;
    private String departamento;
    private String facultad;
    private String pass;

    public UserEntity(Long id, String name, String mail, String RUT, String departamento, String facultad, String pass) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.RUT = RUT;
        this.departamento = departamento;
        this.facultad = facultad;
        this.pass = pass;
    }

    public UserEntity(){

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

    public String getRUT() {
        return RUT;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
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