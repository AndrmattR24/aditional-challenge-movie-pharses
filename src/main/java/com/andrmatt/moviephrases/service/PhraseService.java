package com.andrmatt.moviephrases.service;

import com.andrmatt.moviephrases.model.Phrase;
import com.andrmatt.moviephrases.model.dto.PhraseDto;
import com.andrmatt.moviephrases.repository.PhraseRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Random;

@Service
@AllArgsConstructor
public class PhraseService {

    @Autowired
    private final PhraseRepository repository;

    public Phrase createNewPhrase(Phrase phrase) {
        return repository.save(phrase);
    }

    public Collection<Phrase> getAllPhrases() {
        return repository.findAll();
    }

    public PhraseDto getRandomPhrase() {
        var phrase =  repository.getRandomPhrase();
        return new PhraseDto(
                phrase.getMoviePhrase(),
                phrase.getPosterMovie(),
                phrase.getAuthorPhrase());
    }
}
