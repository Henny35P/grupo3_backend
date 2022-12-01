package Grupo3.FINGESO.Model;

import javax.persistence.*;

@Entity
@Table(name = "user_entity")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "user_id", nullable = false)
    private Long id;
    private String mail;
    private String pass;
    private Rol rol;

    public UserEntity(Long id, String name, String mail, String rut, String departamento, String pass) {
        this.id = id;
        this.mail = mail;
        this.pass = pass;
    }

    public UserEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}