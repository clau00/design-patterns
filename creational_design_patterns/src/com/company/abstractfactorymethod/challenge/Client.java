package com.company.abstractfactorymethod.challenge;

public class Client {

	public static void main(String[] args) {

		MovieFactoryInterface actionMovies = FactoryProducer.getFactory("ACTION");
		HollywoodMovieInterface hAction = actionMovies.getHollywoodMovie();
		BollywoodMovieInterface bAction = actionMovies.getBollywoodMovie();

		System.out.println("\n  Action movies are: ");
		System.out.println(hAction.getMovieName());
		System.out.println(bAction.getMovieName());

		MovieFactoryInterface comedyMovies = FactoryProducer.getFactory("COMEDY");
		HollywoodMovieInterface hComedy = actionMovies.getHollywoodMovie();
		BollywoodMovieInterface bComedy = actionMovies.getBollywoodMovie();

		System.out.println("\n  Comedy movies are: ");
		System.out.println(hComedy.getMovieName());
		System.out.println(bComedy.getMovieName());

	}
}
