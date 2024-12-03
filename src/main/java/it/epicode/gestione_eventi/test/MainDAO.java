package it.epicode.gestione_eventi.test;

import com.github.javafaker.Faker;
import it.epicode.gestione_eventi.dao.EventoDAO;
import it.epicode.gestione_eventi.entity.Evento;
import it.epicode.gestione_eventi.entity.EventoEnum;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class MainDAO {


    public static void main(String[] args) {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("unit-jpa");

    EntityManager em= emf.createEntityManager();
        Faker faker = new Faker(new Locale("it"));

    EventoDAO eventoDAO = new EventoDAO(em);
    Evento evento = new Evento();
    evento.setTitolo("festa epicode");
    evento.setDescrizione("una festa da paura");
    evento.setTipoEvento(EventoEnum.PUBBLICO);
    evento.setNumeroMassimoPartecipanti(100);

    eventoDAO.insertEvento(evento);
    em.close();
    }
}
