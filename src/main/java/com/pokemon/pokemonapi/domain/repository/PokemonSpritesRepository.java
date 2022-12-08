package com.pokemon.pokemonapi.domain.repository;

import com.pokemon.pokemonapi.domain.model.PokemonSprites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonSpritesRepository extends JpaRepository <PokemonSprites, Long> {
}
