package de.musicdb.springmvcrest.bootstrap;

import de.musicdb.springmvcrest.entities.Artist;
import de.musicdb.springmvcrest.repositories.ArtistRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Class for inserting fake Data on startup
 */
@Component
public class BootstrapData implements CommandLineRunner {

    private final ArtistRepository artistRepository;

    public BootstrapData(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public void run(String... args) {

        System.out.println("Loading artists data...");

        Artist a1 = new Artist();
        a1.setName("Thrice");
        a1.setYearFounded(1998);
        artistRepository.save(a1);

        Artist a2 = new Artist();
        a2.setName("Boysetsfire");
        a2.setYearFounded(1995);
        artistRepository.save(a2);

        Artist a3 = new Artist();
        a3.setName("Millencolin");
        a3.setYearFounded(1992);
        artistRepository.save(a3);

        System.out.println("Artists saved: " +artistRepository.count());


    }
}
