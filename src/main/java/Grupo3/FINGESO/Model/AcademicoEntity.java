package Grupo3.FINGESO.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="academico_entity")
public class AcademicoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String rut;
    private String departamento;
    private String facultad;
    private TipoGrado tipoGrado;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToMany(mappedBy = "integrantes")
    private Set<ComiteEntity> comite;

    public AcademicoEntity(Long id, String name, String rut, String departamento, String facultad, TipoGrado tipoGrado, UserEntity user) {
        this.id = id;
        this.name = name;
        this.rut = rut;
        this.departamento = departamento;
        this.facultad = facultad;
        this.tipoGrado = tipoGrado;
        this.user = user;
    }

    public AcademicoEntity() {
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

    public TipoGrado getTipoGrado() {
        return tipoGrado;
    }

    public void setTipoGrado(TipoGrado tipoGrado) {
        this.tipoGrado = tipoGrado;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}