package soa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import soa.entities.ouvrage;
import soa.entities.poste;

import java.util.List;

public interface posteRepo extends JpaRepository<poste, String> {
    @Query(value = "SELECT * FROM poste WHERE nom_poste = :nom_poste", nativeQuery = true)
    List<poste> findPosteByPostName(@Param("nom_poste") String nom_poste);
}
