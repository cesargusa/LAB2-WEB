package com.example.Movie.Model;

public class MovieV2 extends Movie{
        private String poster;
        private String urlId;
        private String description;

        public MovieV2(){}

        public MovieV2(String id, String title,String year, String poster,String description){
            super(id,title,year);
            this.poster=poster;
            this.description=description;
            urlId();
        }

        public String getPoster() {
            return poster;
        }

        public void setPoster(String poster) {
            this.poster = poster;
        }

        public String getUrlId() {
            return urlId;
        }

        public void setUrlId(String urlId) {
            this.urlId = urlId;
        }
        public void urlId(){
            this.urlId= "http://localhost:9092/V2/movies/Buscador/detail?id=" + getId();
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
            
}
