package br.com.cloud.integration.external.model;

import lombok.Data;

@Data
public class AbilitySummary {
    private boolean is_hidden;
    private int slot;
    private AbilityDescriptionSummary ability;
}
