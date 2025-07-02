package com.model;

public class NeighborhoodMatch {
    private Neighborhood neighborhood;
    private double score;

    public NeighborhoodMatch(Neighborhood neighborhood, double score) {
        this.neighborhood = neighborhood;
        this.score = score;
    }

    public Neighborhood getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(Neighborhood neighborhood) {
        this.neighborhood = neighborhood;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

