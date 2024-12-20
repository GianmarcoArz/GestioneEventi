package it.epicode.gestione_eventi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Data
@Entity
@Table(name = "eventi")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private  String titolo;

    @Column(name= "data_evento",nullable = false)
    private LocalDate dataEvento;

    @Column(nullable = false)
    private String descrizione;

    @Column(name="partecipanti.max",nullable = false)
    private int NumeroMassimoPartecipanti;

    @Column(name="tipo_evento", nullable = false)
    private EventoEnum tipoEvento;



}
