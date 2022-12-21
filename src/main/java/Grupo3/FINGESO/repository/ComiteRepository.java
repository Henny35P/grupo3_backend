package Grupo3.FINGESO.repository;

import Grupo3.FINGESO.Model.AcademicoEntity;
import Grupo3.FINGESO.Model.ComiteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface ComiteRepository extends JpaRepository<ComiteEntity,Long> {
    List<ComiteEntity> getComiteEntitiesByEvaluado_Id(Long id);
    List<ComiteEntity> getComiteEntitiesByIntegrantesIsContaining(AcademicoEntity integrante);
}
