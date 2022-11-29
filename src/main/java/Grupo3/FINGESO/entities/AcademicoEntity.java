package Grupo3.FINGESO.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Vector;

@Entity
@Table(name="academico_entity")
public class AcademicoEntity extends User {
//    @OneToMany
//    @JoinColumn(name="id_compromiso")
//    private CompromisoEntity compromiso;


}