package Grupo3.FINGESO.repository;

import Grupo3.FINGESO.Model.AcademicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

public interface AcademicoRepository extends JpaRepository<AcademicoEntity,Long> {
    AcademicoEntity getAcademicoEntityByUser_Id(Long id);
}
