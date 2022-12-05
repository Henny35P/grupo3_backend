package Grupo3.FINGESO.Model;

import javax.persistence.*;

@Entity
@Table(name = "compromiso_entity")
@DiscriminatorValue("CompromisoEntity")
public class CompromisoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "compromiso_entity_seq")
    @SequenceGenerator(name = "compromiso_entity_seq")
    @Column(name = "id", nullable = false)
    private Long id;
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
        return id;
    }

    public void setId(Long id) {
        this.id= id;
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