package de.musicdb.springmvcrest.services;

import de.musicdb.springmvcrest.entities.Artist;
import de.musicdb.springmvcrest.repositories.ArtistRepository;

import java.util.List;

public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public Artist findArtistById(Long id) {
        return artistRepository.getOne(id);
    }

    @Override
    public List<Artist> findAllArtists() {
        return artistRepository.findAll();
    }
}
