package soa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import soa.entities.poste;

public interface posteRepo extends JpaRepository<poste, String> {
}
