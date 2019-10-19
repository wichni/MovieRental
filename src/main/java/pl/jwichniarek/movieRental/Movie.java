package pl.jwichniarek.movieRental;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class Movie {

    private long id;
    private String movieName;
    private int movieVersion;
    private String movieGenre;
    private String directorNameAndLastName;
}
