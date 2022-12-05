package Grupo3.FINGESO.Model;

import javax.persistence.*;

@Entity
@Table(name = "evidencia_entity")
public class EvidenciaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "evidencia_entity_seq")
    @SequenceGenerator(name = "evidencia_entity_seq")
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    private CompromisoEntity compromiso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}