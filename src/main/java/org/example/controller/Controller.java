package org.example.controller;

import org.example.model.Tribut;
import org.example.service.Service;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    public void run() {
        // Exercițiul 1 [cite: 41, 42, 43]
        System.out.println("Tributes loaded: " + service.getAllTributes().size());
        System.out.println("Events loaded: " + service.getAllEvents().size());
        System.out.println("Gifts loaded: " + service.getAllGifts().size());
        printTributes(service.getAllTributes());

        // Exercițiul 2 [cite: 75, 81]
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInput district: ");
        int district = scanner.nextInt();
        List<Tribut> filtered = service.filterByDistrictAndAlive(district);
        printTributes(filtered);

        // Exercițiul 3 [cite: 83]
        System.out.println("\nSorted Tributes:");
        printTributes(service.getSortedTributes());
    }

    // Metodă helper pentru afișare în formatul cerut
    private void printTributes(List<Tribut> list) {
        for (Tribut t : list) {
            System.out.printf("%d %s | D%d | %s | skill=%d%n",
                    t.getId(), t.getName(), t.getDistrict(), t.getStatus(), t.getSkillLevel());
        }
    }
}