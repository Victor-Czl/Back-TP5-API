package fr.isis.transport.dao;

import fr.isis.transport.entity.ExamenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface examenRepository extends JpaRepository<ExamenEntity, Integer> {

}
