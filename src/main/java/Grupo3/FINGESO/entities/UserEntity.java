package Grupo3.FINGESO.entities;

import javax.persistence.*;

@Entity
@Table(name = "user_entity")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_entity_seq")
    @SequenceGenerator(name = "user_entity_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}