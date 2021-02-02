package model;

import java.util.Objects;

/**
 *
 * @author angel
 */
public class Film {
    
    private String title, genere, image,director,actors;
    private int rating, year, duration, ageRating,views;
    private boolean novelty;

    public Film(String title, String genere, int rating, int year, int views, boolean novelty) {
        this.title = title;
        this.genere = genere;
        this.rating = rating;
        this.year = year;
        this.views = views;
        this.novelty = novelty;
    }
   
    public Film(String title, String genere, String image, 
            String director, String actors, int rating, 
            int year, int duration, int ageRating,int views, boolean novelty) {
        this.title = title;
        this.genere = genere;
        this.image = image;
        this.director = director;
        this.actors = actors;
        this.rating = rating;
        this.year = year;
        this.duration = duration;
        this.ageRating = ageRating;
        this.views = views;
        this.novelty = novelty;
    }


    /* -----------------------------------
              ###### GETTERS ######
       -----------------------------------*/ 
   
    public String getTitle() {
        return title;
    }

    public String getGenere() {
        return genere;
    }

    public String getImage() {
        return image;
    }

    public String getDirector() {
        return director;
    }

    public String getActors() {
        return actors;
    }

    public int getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    public int getDuration() {
        return duration;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public int getViews() {
        return views;
    }

    public boolean isNovelty() {
        return novelty;
    }
    /* -----------------------------------
              ###### SETTERS ######
       -----------------------------------*/ 
    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }
    
    public void setViews(int views) {
        this.views = views;
    }

    public void setNovelty(boolean novelty) {
        this.novelty = novelty;
    }

    @Override
    public String toString() {
        return "Film{" + "title=" + title + ", genere=" + genere 
                + ", image=" + image + ", director=" + director 
                + ", actors=" + actors + ", rating=" + rating 
                + ", year=" + year + ", duration=" + duration 
                + ", ageRating=" + ageRating + ", views=" 
                + views + ", novelty=" + novelty + '}';
    }

    //dos peliculas son iguales si tienen el mismo titulo, son del mismo año y tienen el mismo director
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Film other = (Film) obj;
        if (this.year != other.year) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        return true;
    }
        
    public int compareTo(Film otro){
        if(otro.getRating() < rating){
            return -1; //ordenacion de pantalla para que compare por valoracion
        }else if(otro.getRating() > rating){
            return 1; //ordenacion por platamorma
        }else{
            return 0;
        }
    }

}
