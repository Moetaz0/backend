package soa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import soa.entities.cause;
import soa.entities.incident;

import java.util.List;

public interface incidentRepo extends JpaRepository<incident, Integer> {
    @Query(value = "SELECT * FROM incident WHERE nom_poste = :nom_poste", nativeQuery = true)
    List<incident> findIncidentByPostName(@Param("nom_poste") String nom_poste);
}
