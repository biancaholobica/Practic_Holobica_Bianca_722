package org.example;

import org.example.controller.Controller;
import org.example.model.Ereignis;
import org.example.model.SponsorGeschenk;
import org.example.model.Tribut;
import org.example.repository.EreignisRepository;
import org.example.repository.SponsorGeschenkRepository;
import org.example.repository.TributRepository;
import org.example.service.Service;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {

            TributRepository tributRepo = new TributRepository();
            EreignisRepository ereignisRepo = new EreignisRepository();
            SponsorGeschenkRepository geschenkRepo = new SponsorGeschenkRepository();

            tributRepo.loadFromJson("tributes.json", Tribut[].class);
            ereignisRepo.loadFromJson("events.json", Ereignis[].class);
            geschenkRepo.loadFromJson("gifts.json", SponsorGeschenk[].class);

            Service service = new Service(ereignisRepo, geschenkRepo, tributRepo);
            Controller controller = new Controller(service);

            controller.executeExercise1();

        } catch (IOException e) {
            System.err.println("Eroare la citirea fișierelor JSON: " + e.getMessage());
        }
    }
}