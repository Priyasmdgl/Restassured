package JSON;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization {

	public static void main(String[] args) throws IOException {
		Parent parent = new Parent();
		
		parent.setCategory("Movies and TVseries");
		
		List<String> Franchises = new ArrayList<String>();
		Franchises.add("Lyka");
        Franchises.add("Maran");
        parent.setAcceptedFranchises(Franchises);
        
        List<String> genres = new ArrayList<String>();
        genres.add("Action");
        genres.add("Heroism");
        genres.add("Fun");
        parent.setGenres(genres);
        
        Movies old = new Movies();
        old.setTitle("Padayappa");
        old.setYear(1990);
        List<String> cast = new ArrayList<String>();
        cast.add("Rajini");
        cast.add("Soundharya");
        old.setCast(cast);
        
        Movies middle = new Movies();
        middle.setTitle("Jayam");
        middle.setYear(1999);
        List<String> cast1 = new ArrayList<String>();
        cast1.add("Jayam Ravi");
        cast1.add("Sadha");
        middle.setCast(cast1);
        
        List<Movies> movies = new ArrayList<Movies>();
        movies.add(old);
        movies.add(middle);
        parent.setMovies(movies);
        
        TVseries entertainment = new TVseries();
        entertainment.setTitle("Company");
        entertainment.setYear(2024);
        
        TVseries music = new TVseries();
        music.setTitle("Saregamapa");
        music.setYear(2023);
        
        List<TVseries> series = new ArrayList<TVseries>();
        series.add(entertainment);
        series.add(music);
        parent.settVseries(series);
        
        otherdetails other = new otherdetails();
        other.setCountry("India");
        other.setLanguage("Tamil");
        parent.setDetails(other);
        
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(parent);
        System.out.println(json);
        //to store it in a given file
		
		 File Serialization = new File("JSON");
		 mapper.writerWithDefaultPrettyPrinter().writeValue(Serialization,parent);
		 
        
	}

}
