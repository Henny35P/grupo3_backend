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
    String descripcion;
    TipoCompromiso tipo;
//    Agregar comentarios y Evidencia posteriormente
//
//


}