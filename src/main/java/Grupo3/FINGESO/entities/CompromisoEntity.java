package Grupo3.FINGESO.entities;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}