package com.neighborfit.controller;

import com.model.Neighborhood;
import com.model.NeighborhoodMatch;
import com.model.UserPreferences;
import com.neighborfit.service.NeighborhoodService;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class MatchController {

    private final NeighborhoodService service;

    public MatchController(NeighborhoodService service) {
        this.service = service;
    }

    @PostMapping("/match")
    public List<NeighborhoodMatch> matchNeighborhoods(@RequestBody UserPreferences prefs) {
        return service.getNeighborhoodList().stream()
                .map(n -> new NeighborhoodMatch(n, calculateScore(n, prefs)))
                .sorted(Comparator.comparingDouble(NeighborhoodMatch::getScore).reversed())
                .limit(5)
                .collect(Collectors.toList());
    }

    private double calculateScore(Neighborhood n, UserPreferences p) {
        return (10 - Math.abs(p.getSafety() - (10 - n.getCrime()))) * 2
             + (10 - Math.abs(p.getSchools() - n.getSchools())) * 1.5
             + (10 - Math.abs(p.getNightlife() - n.getNightlife()))
             + (10 - Math.abs(p.getGreenery() - n.getGreenery()))
             + (10 - Math.abs(p.getAffordability() - n.getAffordability())) * 1.2
             + (10 - Math.abs(p.getTransport() - n.getTransport())) * 1.2;
    }
}

