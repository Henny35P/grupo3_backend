package Grupo3.FINGESO.Model;

import javax.persistence.*;
import java.util.Vector;

@Entity
@Table(name="academico_entity")
public class AcademicoEntity extends User {

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="id_compromiso")
    private Vector<CompromisoEntity> compromiso;


}