package soa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soa.entities.ouvrage;


public interface ouvrageRepo extends JpaRepository<ouvrage, String> {
}
