package com.pokemon.pokemonapi.domain.model;

import jakarta.persistence.Entity;

public class PokemonHeldItem {

    private Integer rarity;

    public PokemonHeldItem() {
    }

    public PokemonHeldItem(Integer rarity) {
        this.rarity = rarity;
    }

    public Integer getRarity() {
        return rarity;
    }
}
