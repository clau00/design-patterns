package com.company.singleton.challenge;

public class MakeACaptain {

	private MakeACaptain() {}

	private static class SingletonHelper {
		private static final MakeACaptain captain = new MakeACaptain();
	}

	public static MakeACaptain getCaptain() {
		return SingletonHelper.captain;
	}

}
