package com.pokemon.pokemonapi.domain.service;

import com.pokemon.pokemonapi.domain.model.Pokemon;
import java.util.List;

public interface PokemonService {

    List<Pokemon> findAll();

    Pokemon findById(Long id);

    Pokemon findByName(String name);






}
