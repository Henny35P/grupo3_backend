package Grupo3.FINGESO.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ComiteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "academico_id")
    private AcademicoEntity evaluado;
    @ManyToMany
    @JoinTable(
            name = "comite_academico",
            joinColumns = @JoinColumn(name = "comite_id"),
            inverseJoinColumns = @JoinColumn(name = "academico_id")
    )
    private Set<AcademicoEntity> integrantes;

    public ComiteEntity() {
    }

    public AcademicoEntity getEvaluado() {
        return evaluado;
    }

    public void setEvaluado(AcademicoEntity evaluado) {
        this.evaluado = evaluado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<AcademicoEntity> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Set<AcademicoEntity> integrantes) {
        this.integrantes = integrantes;
    }
}
