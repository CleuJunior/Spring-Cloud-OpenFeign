package br.com.cloud.integration.external.model;

import lombok.Data;

import java.util.List;

@Data
public class PokemonSummary {

    private int id;
    private String name;
    private int order;
    private List<AbilitySummary> abilities;
}