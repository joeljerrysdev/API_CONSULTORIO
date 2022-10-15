package com.Clinica.ClinicaOndontologica.repository;

import com.Clinica.ClinicaOndontologica.model.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Long> {
}
