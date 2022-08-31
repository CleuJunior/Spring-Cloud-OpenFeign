package br.com.cloud.integration.external.controller;

import br.com.cloud.integration.external.client.PokemonClient;
import br.com.cloud.integration.external.model.PokemonSummary;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PokemonController {
    private final PokemonClient pokemonClient;

    @GetMapping("/{name}")
    public ResponseEntity<PokemonSummary> getPokemonSummary(@PathVariable("name") String name) {
        return ResponseEntity.ok(pokemonClient.getPokemonSummary(name));
    }

}