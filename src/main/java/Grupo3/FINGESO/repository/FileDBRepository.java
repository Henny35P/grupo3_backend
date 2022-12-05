package Grupo3.FINGESO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Grupo3.FINGESO.Model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
