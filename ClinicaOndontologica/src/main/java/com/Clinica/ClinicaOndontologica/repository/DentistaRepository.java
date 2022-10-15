package com.Clinica.ClinicaOndontologica.repository;

import com.Clinica.ClinicaOndontologica.model.Dentista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistaRepository extends JpaRepository<Dentista, Long> {
}
