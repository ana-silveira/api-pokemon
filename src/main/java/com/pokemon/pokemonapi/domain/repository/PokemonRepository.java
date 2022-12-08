package com.pokemon.pokemonapi.domain.repository;

import com.pokemon.pokemonapi.domain.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PokemonRepository extends JpaRepository <Pokemon, Long> {
    Optional<Pokemon> findByName(String name);
}
