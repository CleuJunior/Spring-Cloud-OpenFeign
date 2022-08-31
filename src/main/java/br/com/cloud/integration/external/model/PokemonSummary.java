package br.com.cloud.integration.external.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PokemonSummary {
    private int id;
    private String name;

    @JsonProperty("base_experience")
    private int baseExperience;
    private int order;
    private List<AbilitySummary> abilities;
}