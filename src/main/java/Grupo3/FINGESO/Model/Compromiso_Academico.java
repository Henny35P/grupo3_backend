package Grupo3.FINGESO.Model;

import javax.persistence.*;

@Entity
public class Compromiso_Academico {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "compromiso_academico_gen")
    @SequenceGenerator(name = "compromiso_academico_gen", sequenceName = "compromiso_academico_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "compromiso_id")
    private CompromisoEntity compromiso;

    @ManyToOne
    @JoinColumn(name = "academico_id")
    private AcademicoEntity academico;

    public CompromisoEntity getCompromiso() {
        return compromiso;
    }

    public void setCompromiso(CompromisoEntity compromiso) {
        this.compromiso = compromiso;
    }

    public AcademicoEntity getAcademico() {
        return academico;
    }

    public void setAcademico(AcademicoEntity academico) {
        this.academico = academico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
