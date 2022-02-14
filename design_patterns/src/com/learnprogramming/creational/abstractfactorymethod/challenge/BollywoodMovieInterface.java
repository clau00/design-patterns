package com.learnprogramming.creational.abstractfactorymethod.challenge;

public interface BollywoodMovieInterface {
	public String getMovieName();
}

class BollywoodActionMovie implements BollywoodMovieInterface {

	@Override
	public String getMovieName() {
		return "A Bollywood Action movie";
	}
}

class BollywoodComedyMovie implements BollywoodMovieInterface {

	@Override
	public String getMovieName() {
		return "A Bollywood Comedy movie";
	}
}
