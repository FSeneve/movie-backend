package com.digisene.movie_api.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 200)
    @NotBlank(message = "Please provide movie title")
    private String title;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "Please the image")
    private String poster;


    @Column(nullable = false)
    @NotBlank(message = "Please provide a studio")
    private String studio;

    @ElementCollection
    @CollectionTable(name = "movie_cast")
    private Set<String> movieCast;

    @Column(nullable = false)
    @NotBlank(message = "Please provide a release date")
    private Integer releaseYear;

    @Column(nullable = false, length = 100)
    @NotBlank(message = "Provide a director")
    private String director;
}
