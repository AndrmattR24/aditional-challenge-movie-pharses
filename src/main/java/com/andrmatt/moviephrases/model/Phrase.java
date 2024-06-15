package com.andrmatt.moviephrases.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Phrase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPhrase;

    private String moviePhrase;
    private String posterMovie;
    private String authorPhrase;
}
