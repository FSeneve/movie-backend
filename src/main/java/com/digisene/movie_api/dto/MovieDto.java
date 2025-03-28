package com.digisene.movie_api.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {

    private UUID id;

    @NotBlank(message = "Please provide movie title")
    private String title;

    @NotBlank(message = "Please the image")
    private String poster;

    @NotBlank(message = "Please the image")
    private String posterUrl;

    @NotBlank(message = "Please provide a studio")
    private String studio;

    private Set<String> movieCast;

    private Integer releaseYear;

    @NotBlank(message = "Provide a director")
    private String director;
}
