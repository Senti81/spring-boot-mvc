package de.musicdb.springmvcrest.controllers;

import de.musicdb.springmvcrest.entities.Artist;
import de.musicdb.springmvcrest.services.ArtistService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/artists")
public class ArtistController {

    private ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping
    public List<Artist> getAllArtists() {
        return artistService.findAllArtists();
    }

    @GetMapping("/{id}")
    public Artist getArtistById(@PathVariable Long id) {
        return artistService.findArtistById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Artist insertArtist(@RequestBody Artist artist) {
        return artistService.insertArtist(artist);
    }
}
