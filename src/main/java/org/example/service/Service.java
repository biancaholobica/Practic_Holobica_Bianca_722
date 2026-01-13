package org.example.service;

import org.example.model.Ereignis;
import org.example.model.SponsorGeschenk;
import org.example.model.Status;
import org.example.model.Tribut;
import org.example.repository.EreignisRepository;
import org.example.repository.SponsorGeschenkRepository;
import org.example.repository.TributRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Service {
    private final EreignisRepository ereignisRepo;
    private final SponsorGeschenkRepository geschenkRepo;
    private final TributRepository tributRepo;

    public Service(EreignisRepository ereignisRepo, SponsorGeschenkRepository geschenkRepo, TributRepository tributRepo) {
        this.ereignisRepo = ereignisRepo;
        this.geschenkRepo = geschenkRepo;
        this.tributRepo = tributRepo;
    }

    // Cerința 1: Getters pentru datele brute
    public List<Tribut> getAllTributes() { return tributRepo.getAll(); }
    public List<Ereignis> getAllEvents() { return ereignisRepo.getAll(); }
    public List<SponsorGeschenk> getAllGifts() { return geschenkRepo.getAll(); }

    // Cerința 2: Filtrare după District și Status LEBENDIG
    public List<Tribut> filterByDistrictAndAlive(int district) {
        return tributRepo.getAll().stream()
                .filter(t -> t.getDistrict() == district)
                .filter(t -> t.getStatus() == Status.ALIVE)
                .collect(Collectors.toList());
    }

    // Cerința 3: Sortare descrescător skillLevel, apoi crescător nume
    public List<Tribut> getSortedTributes() {
        return tributRepo.getAll().stream()
                .sorted(Comparator.comparing(Tribut::getSkillLevel).reversed()
                        .thenComparing(Tribut::getName))
                .collect(Collectors.toList());
    }
}