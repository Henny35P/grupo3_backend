package Grupo3.FINGESO.Model;

import javax.persistence.*;

@Entity
@Table(name = "academico_user")
public class Academico_User_Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

    @OneToOne
    @JoinColumn(name = "academico_id")
    private AcademicoEntity academicoEntity;

    public Academico_User_Entity() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public AcademicoEntity getAcademicoEntity() {
        return academicoEntity;
    }

    public void setAcademicoEntity(AcademicoEntity academicoEntity) {
        this.academicoEntity = academicoEntity;
    }
}
