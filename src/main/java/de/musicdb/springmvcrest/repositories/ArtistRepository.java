package de.musicdb.springmvcrest.repositories;

import de.musicdb.springmvcrest.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
