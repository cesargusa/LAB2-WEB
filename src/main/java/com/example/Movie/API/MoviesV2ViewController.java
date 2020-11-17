package com.example.Movie.API;

import java.util.ArrayList;

import com.example.Movie.Model.MovieV2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MoviesV2ViewController {
    @GetMapping("/V2/movies/Buscador")
    public ModelAndView GetAll(@RequestParam( name="title", required=false,defaultValue="") String title,
    @RequestParam(name="year",required = false,defaultValue = "") String year){
        ArrayList<MovieV2> result = MoviesV2Controller.GetAllMovies(title, year);
        
        ModelAndView mv = new ModelAndView("buscadorV2");
        mv.addObject("buscadorV2", result);
        return mv;
    }

}
