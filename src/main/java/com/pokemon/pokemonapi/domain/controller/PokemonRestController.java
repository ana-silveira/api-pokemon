package com.pokemon.pokemonapi.domain.controller;

import com.pokemon.pokemonapi.domain.model.Pokemon;
import com.pokemon.pokemonapi.domain.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController ("/pokemon")
public class PokemonRestController {

    @Autowired
    private PokemonService businessLayer;

    @GetMapping("/pokemon")
    public ResponseEntity<List<Pokemon>> findAll() {
        List<Pokemon> pokemons = businessLayer.findAll();
        return ResponseEntity.ok(pokemons);
    }

    @GetMapping ("pokemon/{id}")
    public ResponseEntity<Pokemon> findById(@PathVariable Long id) {
        return ResponseEntity.ok(businessLayer.findById(id));
    }

    @GetMapping ("pokemon/{name}")
    public ResponseEntity<Pokemon> findByName(@PathVariable String name) {
        return ResponseEntity.ok(businessLayer.findByName(name));

    }
}
