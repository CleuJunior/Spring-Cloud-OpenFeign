package br.com.cloud.integration.external.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AbilitySummary {

    @JsonProperty("is_hidden")
    private boolean isHidden;
    private int slot;
    private AbilityDescriptionSummary ability;
}
