package com.learnprogramming.creational.abstractfactorymethod.challenge;

public interface HollywoodMovieInterface {
	public String getMovieName();
}

class HollywoodActionMovie implements HollywoodMovieInterface {

	@Override
	public String getMovieName() {
		return "A Hollywood Action movie";
	}
}

class HollywoodComedyMovie implements HollywoodMovieInterface {

	@Override
	public String getMovieName() {
		return "A Hollywood Comedy movie";
	}
}