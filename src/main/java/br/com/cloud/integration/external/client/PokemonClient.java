package br.com.cloud.integration.external.client;

import br.com.cloud.integration.external.model.PokemonSummary;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pokemonClient", url = "https://pokeapi.co/api/v2")
public interface PokemonClient {

    @GetMapping("/pokemon/{name}")
    PokemonSummary getPokemonSummary(@PathVariable("name") String name);

}
