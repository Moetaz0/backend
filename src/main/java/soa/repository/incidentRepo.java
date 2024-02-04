package soa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soa.entities.incident;

public interface incidentRepo extends JpaRepository<incident, Integer> {
}
