package com.neighborfit.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.Neighborhood;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public class NeighborhoodService {

    private List<Neighborhood> neighborhoodList;

    public NeighborhoodService() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = getClass().getResourceAsStream("/diverse_neighborhoods_india.json");
            neighborhoodList = mapper.readValue(is, new TypeReference<List<Neighborhood>>() {});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Neighborhood> getNeighborhoodList() {
        return neighborhoodList;
    }
}

