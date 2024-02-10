package soa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import soa.entities.cause;

import java.util.List;


public interface causeRepo extends JpaRepository<cause, Integer> {
    @Query(value = "SELECT * FROM cause WHERE designation = :designation", nativeQuery = true)
    List<cause> findCauseByDesignation(@Param("designation") String designation);










}
