package Grupo3.FINGESO.Model;

import javax.persistence.*;

@Entity
@Table(name = "compromiso_entity")
@DiscriminatorValue("CompromisoEntity")
public class CompromisoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String descripcion;
    private TipoCompromiso tipo;

    @ManyToOne
    @JoinColumn(name = "id_academico")
    private AcademicoEntity academico;

//    Agregar comentarios y Evidencia posteriormente
//
    public CompromisoEntity(String descripcion, TipoCompromiso tipo) {
        this.descripcion = descripcion;
        this.tipo = tipo;
    }
    public CompromisoEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoCompromiso getTipo() {
        return tipo;
    }

    public void setTipo(TipoCompromiso tipo) {
        this.tipo = tipo;
    }

    public AcademicoEntity getAcademico() {
        return academico;
    }

    public void setAcademico(AcademicoEntity academico) {
        this.academico = academico;
    }
}