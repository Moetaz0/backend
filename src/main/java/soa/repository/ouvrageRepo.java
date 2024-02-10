package soa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import soa.entities.incident;
import soa.entities.ouvrage;

import java.util.List;


public interface ouvrageRepo extends JpaRepository<ouvrage, String> {
    @Query(value = "SELECT * FROM ouvrage WHERE nom_poste = :nom_poste", nativeQuery = true)
    List<ouvrage> findOuvrageByPostName(@Param("nom_poste") String nom_poste);
}

