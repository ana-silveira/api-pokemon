package com.pokemon.pokemonapi.domain.service.exceptions;

public class NoContentException extends RuntimeException{
    public NoContentException() {
        super("No content Exception");
    }

}
