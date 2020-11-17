package com.example.Movie.Model;

public class MovieV2 extends Movie{
        private String poster;

        public MovieV2(){}

        public MovieV2(String id, String title,String year, String poster){
            super(id,title,year);
            this.poster=poster;
        }

        public String getPoster() {
            return poster;
        }

        public void setPoster(String poster) {
            this.poster = poster;
        }

            
}
