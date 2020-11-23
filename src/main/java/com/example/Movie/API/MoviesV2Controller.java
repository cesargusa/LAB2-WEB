package com.example.Movie.API;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.Movie.Model.MovieV2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesV2Controller {
    private static ArrayList<MovieV2> moviesV2 = new ArrayList<MovieV2>(Arrays.asList(new MovieV2("Peaky Blinders",
            "2020", "1",
            "https://m.media-amazon.com/images/M/MV5BMTkzNjEzMDEzMF5BMl5BanBnXkFtZTgwMDI0MjE4MjE@._V1_SX300.jpg",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."),
            new MovieV2("Vikings", "2013", "2",
                    "https://m.media-amazon.com/images/M/MV5BNjIzZjljZmQtOGNiYi00YmY2LWE1MGYtN2VlMmEyZDBlMzRmXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg",
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."),
            new MovieV2("Joker", "2019", "3",
                    "https://m.media-amazon.com/images/M/MV5BNGVjNWI4ZGUtNzE0MS00YTJmLWE0ZDctN2ZiYTk2YmI3NTYyXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg",
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."),
            new MovieV2("It", "2019", "4",
                    "https://m.media-amazon.com/images/M/MV5BZDVkZmI0YzAtNzdjYi00ZjhhLWE1ODEtMWMzMWMzNDA0NmQ4XkEyXkFqcGdeQXVyNzYzODM3Mzg@._V1_SX300.jpg",
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."),
            new MovieV2("Gladiator", "2000", "5",
                    "https://m.media-amazon.com/images/M/MV5BMDliMmNhNDEtODUyOS00MjNlLTgxODEtN2U3NzIxMGVkZTA1L2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SX300.jpg",
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."),
            new MovieV2("Vikingdom", "2013", "6",
                    "https://m.media-amazon.com/images/M/MV5BMTc3ODIzMDMwMl5BMl5BanBnXkFtZTgwMDY1NDg5MjE@._V1_SX300.jpg",
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."),
            new MovieV2("Bad Boys for Life", "2020", "7",
                    "https://m.media-amazon.com/images/M/MV5BMWU0MGYwZWQtMzcwYS00NWVhLTlkZTAtYWVjOTYwZTBhZTBiXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg",
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.")));

    // GET METHOD
    @GetMapping("/V2/movies")
    public static ArrayList<MovieV2> GetAllMovies(
            @RequestParam(name = "title", defaultValue = "", required = false) String title,
            @RequestParam(name = "year", defaultValue = "", required = false) String year,
            @RequestParam(name = "id", defaultValue = "", required = false) String id) {
        ArrayList<MovieV2> AllMovies = new ArrayList<MovieV2>();
        if (!id.equals("")) {
            for (MovieV2 elem : moviesV2) {
                if (elem.getId().equals(id)) {
                    AllMovies.add(elem);
                }
            }
            return AllMovies;
        }
        if (title.equals("") && year.equals(""))
            return moviesV2;
        if (!title.equals("") && year.equals("")) {
            for (MovieV2 element : moviesV2) {
                if (element.getTitle().contains(title)) {
                    AllMovies.add(element);
                }
            }
            return AllMovies;
        }
        if (title.equals("") && !year.equals("")) {
            for (MovieV2 element : moviesV2) {
                if (element.getYear().contains(year)) {
                    AllMovies.add(element);
                }
            }
            return AllMovies;
        }
        if (!title.equals("") && !year.equals("")) {
            for (MovieV2 element : moviesV2) {
                if (element.getTitle().contains(title) && element.getYear().contains(year)) {
                    AllMovies.add(element);
                }
            }
            return AllMovies;
        }

        return null;

    }

}
