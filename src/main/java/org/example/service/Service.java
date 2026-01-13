package org.example.service;

import org.example.model.SponsorGeschenk;
import org.example.model.Tribut;
import org.example.model.Ereignis;
import org.example.repository.EreignisRepository;
import org.example.repository.SponsorGeschenkRepository;
import org.example.repository.TributRepository;

import java.util.List;

public class Service {
    private final EreignisRepository ereignisRepo;
    private final SponsorGeschenkRepository geschenkRepo;
    private final TributRepository tributRepo;

    public Service(EreignisRepository ereignisRepo, SponsorGeschenkRepository geschenkRepo, TributRepository tributRepo) {
        this.ereignisRepo = ereignisRepo;
        this.geschenkRepo = geschenkRepo;
        this.tributRepo = tributRepo;
    }

    public List<Tribut> getAllTributes() {
        return tributRepo.getAll();
    }

    public List<Ereignis> getAllEvents() {
        return ereignisRepo.getAll();
    }

    public List<SponsorGeschenk> getAllGifts() {
        return geschenkRepo.getAll();
    }
}