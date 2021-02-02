package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;

/**
 *
 * @author angel
 */
public class MovieCatalog {
    private String name;
    private ArrayList<Film> catalog = new ArrayList<>();
    
    public MovieCatalog(String name) {
        this.name = name;
    }
    
    public Boolean add (Film f) {
        if (!catalog.contains(f)) {
            catalog.add(f);
            return true;
        }
        return false;
    }
    
    public Boolean remove (Film f) {
        if (!catalog.contains(f)) {
            return false;
        }
        catalog.remove(f);
        return true;
    }
    
    public void setOrder(int order) {
  
        if(order == 0){
            //orden por defecto por valoracion (de mayor a menor)
            Collections.sort(catalog, new Comparator<Film>(){
                @Override
                public int compare(Film f1, Film f2){
                    if(f1.getRating() > f2.getRating()){
                        return -1;
                    }else if(f1.getRating() < f2.getRating()){
                        return 1;
                    }
                    
                    return 0;
                }
                
            });
        }
        
        if(order == 1){
            //ordena por genero
            Collections.sort(catalog, new Comparator<Film>(){
                @Override
                public int compare(Film f1, Film f2){
                    if(f1.getGenere().compareTo(f2.getGenere()) != 0){
                        return f1.getGenere().compareTo(f2.getGenere());
                    }
                    
                    return 0;
                }
                
            });
        }
        
        if(order == 2){
            //ordena por novedades

        }
        
        if(order == 3){
            //ordena por las mas vistas

        }

    }
    
    
    public String toString(){
        
        String result = name +":\n";
        int count = 1;
        for (Film f : getFilms()) {
            result += count + ") " + f.toString() + "\n";
            count ++;
        }
        return result;
    }

    public List<Film> getFilms() {//Listado juegos en el orden establecido en setOrder
        return (List<Film>) catalog;
    }

    
}
