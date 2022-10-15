package com.Clinica.ClinicaOndontologica.repository;

import com.Clinica.ClinicaOndontologica.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
