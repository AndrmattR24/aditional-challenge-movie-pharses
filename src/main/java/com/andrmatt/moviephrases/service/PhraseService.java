package com.andrmatt.moviephrases.service;

import com.andrmatt.moviephrases.model.Phrase;
import com.andrmatt.moviephrases.repository.PhraseRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

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
}
