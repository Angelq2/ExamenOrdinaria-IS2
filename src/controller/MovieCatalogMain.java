package controller;

import model.*;
import view.MovieCatalogDisplay;
/**
 *
 * @author angel
 */
public class MovieCatalogMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Film f1 = new Film("Peli1","drama",5,1997,1020,false);
        Film f2 = new Film("Peli2","comedia",5,1997,0,false);
        Film f3 = new Film("Peli3","drama",4,1997,1500,true);
        Film f4 = new Film("Peli4","terror",null,"Guillermo del toro",null,5,1997,136,18,100,true);
        Film f5 = new Film("Peliqd2","comedia",5,2002,310,false);
        Film f6 = new Film("Pelivt2","comedia",2,2000,70,false);
        
        MovieCatalog catalog = new MovieCatalog("catalogo");
        catalog.add(f1);
        catalog.add(f1);//no deberia añadir peli repetida
        catalog.add(f2);
        catalog.add(f3);
        catalog.add(f4);
        System.out.println(catalog.toString());
        /*
            ---- OUTPUT --- salida normal
            catalogo:
            1) Film{title=Peli1, genere=drama, image=null, director=null, actors=null, rating=5, year=1997, duration=0, ageRating=0, views=1020, novelty=false}
            2) Film{title=Peli2, genere=comedia, image=null, director=null, actors=null, rating=5, year=1997, duration=0, ageRating=0, views=0, novelty=false}
            3) Film{title=Peli3, genere=drama, image=null, director=null, actors=null, rating=4, year=1997, duration=0, ageRating=0, views=1500, novelty=true}
            4) Film{title=Peli4, genere=terror, image=null, director=Guillermo del toro, actors=null, rating=5, year=1997, duration=136, ageRating=18, views=100, novelty=true}
        */
        catalog.remove(f3);
        System.out.println(catalog.toString());
        /*
            ---- OUTPUT --- salida despues de eliminar un elementos
            catalogo:
            1) Film{title=Peli1, genere=drama, image=null, director=null, actors=null, rating=5, year=1997, duration=0, ageRating=0, views=1020, novelty=false}
            2) Film{title=Peli2, genere=comedia, image=null, director=null, actors=null, rating=5, year=1997, duration=0, ageRating=0, views=0, novelty=false}
            3) Film{title=Peli4, genere=terror, image=null, director=Guillermo del toro, actors=null, rating=5, year=1997, duration=136, ageRating=18, views=100, novelty=true}
        */
        catalog.add(f5);
        catalog.add(f6);
        catalog.setOrder(1);
        System.out.println(catalog.toString());
                /*
            ---- OUTPUT --- salida al establecer el orden por genero
            catalogo:
            1) Film{title=Peli2, genere=comedia, image=null, director=null, actors=null, rating=5, year=1997, duration=0, ageRating=0, views=0, novelty=false}
            2) Film{title=Peliqd2, genere=comedia, image=null, director=null, actors=null, rating=5, year=2002, duration=0, ageRating=0, views=310, novelty=false}
            3) Film{title=Pelivt2, genere=comedia, image=null, director=null, actors=null, rating=2, year=2000, duration=0, ageRating=0, views=70, novelty=false}
            4) Film{title=Peli1, genere=drama, image=null, director=null, actors=null, rating=5, year=1997, duration=0, ageRating=0, views=1020, novelty=false}
            5) Film{title=Peli4, genere=terror, image=null, director=Guillermo del toro, actors=null, rating=5, year=1997, duration=136, ageRating=18, views=100, novelty=true}
        */
        catalog.add(f3);
        catalog.setOrder(0);
        System.out.println(catalog.toString());
        
        /*
            ---- OUTPUT --- salida al establecer el orden por defecto(valoracion) rating de mayor a menor
            catalogo:
            1) Film{title=Peli2, genere=comedia, image=null, director=null, actors=null, rating=5, year=1997, duration=0, ageRating=0, views=0, novelty=false}
            2) Film{title=Peliqd2, genere=comedia, image=null, director=null, actors=null, rating=5, year=2002, duration=0, ageRating=0, views=310, novelty=false}
            3) Film{title=Peli1, genere=drama, image=null, director=null, actors=null, rating=5, year=1997, duration=0, ageRating=0, views=1020, novelty=false}
            4) Film{title=Peli4, genere=terror, image=null, director=Guillermo del toro, actors=null, rating=5, year=1997, duration=136, ageRating=18, views=100, novelty=true}
            5) Film{title=Peli3, genere=drama, image=null, director=null, actors=null, rating=4, year=1997, duration=0, ageRating=0, views=1500, novelty=true}
            6) Film{title=Pelivt2, genere=comedia, image=null, director=null, actors=null, rating=2, year=2000, duration=0, ageRating=0, views=70, novelty=false}
        */
    }
    
}
