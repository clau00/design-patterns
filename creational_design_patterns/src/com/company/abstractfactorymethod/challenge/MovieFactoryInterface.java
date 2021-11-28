package com.company.abstractfactorymethod.challenge;


public abstract class MovieFactoryInterface {
	abstract HollywoodMovieInterface getHollywoodMovie();
	abstract BollywoodMovieInterface getBollywoodMovie();
}

class ActionMovieFactory extends MovieFactoryInterface {

	@Override
	HollywoodMovieInterface getHollywoodMovie() {
		return new HollywoodActionMovie();
	}

	@Override
	BollywoodMovieInterface getBollywoodMovie() {
		return new BollywoodActionMovie();
	}
}

class ComedyMovieFactory extends MovieFactoryInterface {

	@Override
	HollywoodMovieInterface getHollywoodMovie() {
		return new HollywoodComedyMovie();
	}

	@Override
	BollywoodMovieInterface getBollywoodMovie() {
		return new BollywoodComedyMovie();
	}
}

