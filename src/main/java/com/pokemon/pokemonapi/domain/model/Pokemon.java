package com.pokemon.pokemonapi.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity ( name = "pokemon")
public class Pokemon {
    @Id
    private Integer id;
    private String name;
    private boolean is_default;
    private String local_area_encounters;
    private PokemonSprites sprites;
    private List<PokemonHeldItem> held_items;


    public Pokemon() {
    }

    public Integer getId() {
        return id;
    }

    public static String getName(String name) {
        return name;
    }

    public boolean isIs_default() {
        return is_default;
    }

    public String getLocal_area_encounters() {
        return local_area_encounters;
    }

    public PokemonSprites getSprites() {
        return sprites;
    }

    public List<PokemonHeldItem> getHeld_items() {
        return held_items;
    }
}
