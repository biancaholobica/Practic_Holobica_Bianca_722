package org.example.controller;

import org.example.model.Tribut;
import org.example.service.Service;

public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    public void executeExercise1() {
        // Afișare număr elemente încărcate [cite: 48, 49, 50]
        System.out.println("Tributes loaded: " + service.getAllTributes().size());
        System.out.println("Events loaded: " + service.getAllEvents().size());
        System.out.println("Gifts loaded: " + service.getAllGifts().size());

        // Afișare listă tribute formatată [cite: 45, 46, 51]
        // Format: id name | D<district> | status | skill=<skillLevel>
        for (Tribut t : service.getAllTributes()) {
            System.out.printf("%d %s | D%d | %s | skill=%d%n",
                    t.getId(),
                    t.getName(),
                    t.getDistrict(),
                    t.getStatus(),
                    t.getSkillLevel());
        }
    }
}