package com.Clinica.ClinicaOndontologica.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @Column(name = "idPaciente")
    @NotEmpty
    @NotNull
    private Paciente paciente;
    @OneToOne
    @Column(name = "idDentista")
    @NotEmpty
    @NotNull
    private Dentista dentista;
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-mm-dd")
    @NotEmpty
    @NotNull
    private Date data;
    @DateTimeFormat(pattern = "hh:mm:ss")
    @NotEmpty
    @NotNull
    private Time hora;

}
