package com.andrmatt.moviephrases.controller;

import com.andrmatt.moviephrases.model.Phrase;
import com.andrmatt.moviephrases.service.PhraseService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;


@Controller
@AllArgsConstructor
@RequestMapping("/phrase")
public class PhraseController {

    @Autowired
    private final PhraseService service;

    @GetMapping("/list")
    public ResponseEntity<Collection<Phrase>> getAllPhrases() {
        return new ResponseEntity<>(service.getAllPhrases(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createNewPhrase(@RequestBody Phrase phrase) {
        return new ResponseEntity<>(service.createNewPhrase(phrase), HttpStatus.CREATED);
    }
}
