package Grupo3.FINGESO.repository;

import Grupo3.FINGESO.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
