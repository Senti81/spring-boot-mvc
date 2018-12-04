package de.musicdb.springmvcrest.services;

import de.musicdb.springmvcrest.entities.Artist;

import java.util.List;

public interface ArtistService {

    Artist findArtistById(Long id);

    List<Artist> findAllArtists();

    Artist insertArtist(Artist artist);

    void deleteArtist(Long id);
}
