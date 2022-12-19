package Grupo3.FINGESO.repository;

import Grupo3.FINGESO.Model.Compromiso_Academico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompromisoAcademicoRepository extends JpaRepository<Compromiso_Academico,Long> {
     List<Compromiso_Academico> findByAcademico_Id(Long id);
}
