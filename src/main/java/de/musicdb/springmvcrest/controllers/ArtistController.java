package de.musicdb.springmvcrest.controllers;

import de.musicdb.springmvcrest.entities.Artist;
import de.musicdb.springmvcrest.services.ArtistService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(ArtistController.BASE_URL)
public class ArtistController {

    final static String BASE_URL = "/api/v1/artists";
    private ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping
    List<Artist> getAllArtists() {
        return artistService.findAllArtists();
    }
}
