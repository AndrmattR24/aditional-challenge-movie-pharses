package com.andrmatt.moviephrases.repository;

import com.andrmatt.moviephrases.model.Phrase;
import com.andrmatt.moviephrases.model.dto.PhraseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PhraseRepository extends JpaRepository<Phrase,Long> {

    @Query("SELECT f FROM Phrase f ORDER By FUNCTION('RANDOM') LIMIT 1")
    public Phrase getRandomPhrase();

}
