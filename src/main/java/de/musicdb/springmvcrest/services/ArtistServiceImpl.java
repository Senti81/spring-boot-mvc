package de.musicdb.springmvcrest.services;

import de.musicdb.springmvcrest.entities.Artist;
import de.musicdb.springmvcrest.repositories.ArtistRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public Artist findArtistById(Long id) {
        return artistRepository.findById(id).get();
    }

    @Override
    public List<Artist> findAllArtists() {
        return artistRepository.findAll();
    }

    @Override
    public Artist insertArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    @Override
    public void deleteArtist(Long id) {
        artistRepository.deleteById(id);
    }
}
