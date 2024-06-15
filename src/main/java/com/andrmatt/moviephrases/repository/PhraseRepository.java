package com.andrmatt.moviephrases.repository;

import com.andrmatt.moviephrases.model.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhraseRepository extends JpaRepository<Phrase,Long> {
}
