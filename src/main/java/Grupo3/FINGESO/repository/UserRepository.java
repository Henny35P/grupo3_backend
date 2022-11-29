package Grupo3.FINGESO.repository;

import Grupo3.FINGESO.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
