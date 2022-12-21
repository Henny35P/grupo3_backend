package Grupo3.FINGESO.repository;

import Grupo3.FINGESO.Model.CompromisoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CompromisoRepository extends JpaRepository<CompromisoEntity, Long> {
    List<CompromisoEntity> getCompromisoEntitiesByAcademico_Id(Long id);
}