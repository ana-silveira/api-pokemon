package com.pokemon.pokemonapi.domain.service.impl;

import com.pokemon.pokemonapi.domain.model.Pokemon;
import com.pokemon.pokemonapi.domain.repository.PokemonRepository;
import com.pokemon.pokemonapi.domain.service.PokemonService;
import com.pokemon.pokemonapi.domain.service.exceptions.NoContentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PokemonServiceImpl implements PokemonService {
    @Autowired
    private PokemonRepository pokemonRepository;

    @Override
    public List<Pokemon> findAll() {
        return pokemonRepository.findAll();
    }

    @Override
    public Pokemon findById(Long id) {
        Optional<Pokemon> pokemon = pokemonRepository.findById(id);
        return pokemon.orElseThrow(NoContentException::new);
        /*
        if (pokemon.isPresent()) {return pokemon.get();]
        else {
        throw new NoContentException();}
        */
    }

    @Override
    public Pokemon findByName(String name) {
        Optional<Pokemon> pokemon = pokemonRepository.findByName(name);
        return pokemon.orElseThrow(NoContentException::new);
    }

}
