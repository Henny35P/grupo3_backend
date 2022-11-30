package Grupo3.FINGESO.Model;

import javax.persistence.*;

@Entity
@Table(name = "compromiso_entity")
@DiscriminatorValue("CompromisoEntity")
public class CompromisoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "compromiso_entity_seq")
    @SequenceGenerator(name = "compromiso_entity_seq")
    @Column(name = "id_compromiso", nullable = false)
    private Long id_compromiso;
    private String descripcion;
    private TipoCompromiso tipo;
//    Agregar comentarios y Evidencia posteriormente
//
    public CompromisoEntity(String descripcion, TipoCompromiso tipo) {
        this.descripcion = descripcion;
        this.tipo = tipo;
    }
    public CompromisoEntity() {

    }

    public Long getId_compromiso() {
        return id_compromiso;
    }

    public void setId_compromiso(Long id_compromiso) {
        this.id_compromiso = id_compromiso;
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
}