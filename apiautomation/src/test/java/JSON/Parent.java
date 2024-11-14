package JSON;

import java.util.List;

public class Parent {

	private String category;
	private List<String> acceptedFranchises;
	private List<String> genres;
	private List<Movies> movies;
	private List<TVseries> tVseries;
	private otherdetails details;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<String> getAcceptedFranchises() {
		return acceptedFranchises;
	}
	public void setAcceptedFranchises(List<String> acceptedFranchises) {
		this.acceptedFranchises = acceptedFranchises;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	public List<Movies> getMovies() {
		return movies;
	}
	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}
	public List<TVseries> gettVseries() {
		return tVseries;
	}
	public void settVseries(List<TVseries> tVseries) {
		this.tVseries = tVseries;
	}
	public otherdetails getDetails() {
		return details;
	}
	public void setDetails(otherdetails details) {
		this.details = details;
	}
	
}
