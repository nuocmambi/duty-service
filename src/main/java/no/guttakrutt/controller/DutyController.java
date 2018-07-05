package no.guttakrutt.controller;

import no.guttakrutt.domain.Duty;
import no.guttakrutt.repository.DutyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DutyController {

    @Autowired
    private DutyRepository dutyRepository;

    @GetMapping
    public String test() {
        return "tdfsdf";
    }

    @GetMapping("/duties")
    public Iterable<Duty> getAllDuties() {
        return dutyRepository.findAll();
    }

    @PostMapping("/duties")
    public Iterable<Duty> save(String title, String price) {
        if (title != null) {
            dutyRepository.save(new Duty(title,price));
        }
        return dutyRepository.findAll();
    }
}
