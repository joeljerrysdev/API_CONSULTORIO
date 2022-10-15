package com.Clinica.ClinicaOndontologica.repository;

import com.Clinica.ClinicaOndontologica.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
