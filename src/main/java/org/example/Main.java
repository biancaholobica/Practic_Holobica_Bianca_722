package org.example;

import org.example.controller.Controller;
import org.example.model.Ereignis;
import org.example.model.SponsorGeschenk;
import org.example.model.Tribut;
import org.example.repository.EreignisRepository;
import org.example.repository.SponsorGeschenkRepository;
import org.example.repository.TributRepository;
import org.example.service.Service;

public class Main {
    public static void main(String[] args) {
        try {
            // Inițializare repo-uri
            TributRepository tributRepo = new TributRepository();
            EreignisRepository ereignisRepo = new EreignisRepository();
            SponsorGeschenkRepository geschenkRepo = new SponsorGeschenkRepository();

            // Încărcare date [cite: 39]
            tributRepo.loadFromJson("tributes.json", Tribut[].class);
            ereignisRepo.loadFromJson("events.json", Ereignis[].class);
            geschenkRepo.loadFromJson("gifts.json", SponsorGeschenk[].class);

            // Dependency Injection
            Service service = new Service(ereignisRepo, geschenkRepo, tributRepo);
            Controller controller = new Controller(service);

            // Pornire aplicație
            controller.run();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}